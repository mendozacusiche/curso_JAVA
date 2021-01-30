package usothreads;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BancosSincronizar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco b = new Banco();

		for (int i = 0; i < 100; i++) {

			EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);

			Thread t = new Thread(r);

			t.start();

		}

	}

}

class Banco {

	public Banco() {

		cuentas = new double[100];

		for (int i = 0; i < cuentas.length; i++) {

			cuentas[i] = 2000;

		}
		
		//saldoSuficiciente = cierreBanco.newCondition();

	}

	public synchronized void transferencias(int cuentaOrigen, int cuentaDestino, Double cantidad) throws InterruptedException {

		//cierreBanco.lock();

		//try {

			while(cuentas[cuentaOrigen] < cantidad) { // evaluca que el saldo no sea inferia
				
				
				wait();
				
				//System.out.println("---------------CANTIDAD INSUFICIENTE: "+ cuentaOrigen+ "............SALDO"+cuentas[cuentaOrigen]+" ...... "+cantidad);
				
				//return;
			
				//saldoSuficiciente.await();
				
			}/*else {
				
				
				System.out.println("---------------CANTIDAD OK-------- "+cuentaOrigen);
				
			}*/

			System.out.println(Thread.currentThread());

			cuentas[cuentaOrigen] -= cantidad; // Dinero que sale de la cuenta origen

			System.out.printf("%10.2f de  %d  para  %d", cantidad, cuentaOrigen, cuentaDestino);

			cuentas[cuentaDestino] += cantidad;

			System.out.printf(" Saldo total: %10.2f%n", getSaldoTotal());

			//saldoSuficiciente.signalAll();
			
			notifyAll();
			
		/*} /*finally {

			cierreBanco.unlock();
		}*/
	}

	public double getSaldoTotal() {

		double suma_Cuentas = 0;

		for (double a : cuentas) {

			suma_Cuentas += a;
		}

		return suma_Cuentas;

	}

	private final double[] cuentas;

//	private Lock cierreBanco = new ReentrantLock();
//	
//	private Condition saldoSuficiciente;

}

class EjecucionTransferencias implements Runnable {

	public EjecucionTransferencias(Banco b, int de, double max) {
		// TODO Auto-generated constructor stub

		banco = b;

		deLacuenta = de;

		cantidadMax = max;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

		try {
			while (true) {

				int paraLacuenta = (int) (100 * Math.random());

				double cantidad = cantidadMax * Math.random();

				banco.transferencias(deLacuenta, paraLacuenta, cantidad);

				Thread.sleep((int) (Math.random() * 10));

			}
		} catch (InterruptedException e) {
			// TODO: handle exception
		}

	}

	private Banco banco;

	private int deLacuenta;

	private double cantidadMax;

}
