package a3.comandament;


public class Comandament {
	private boolean lliure;
		
	public Comandament() {
		lliure = true;
	}
	
	public synchronized void agafa() {
		try {
			while(!lliure) wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		lliure = false;
		notifyAll();
	}

	public synchronized void deixa() {
		lliure = true;
		notifyAll();
	}
}
