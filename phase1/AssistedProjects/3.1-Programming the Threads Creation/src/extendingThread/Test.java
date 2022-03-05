package extendingThread;

class Car extends Thread{		//cant extend class car , it will become multiple inheritance,(not allowed)
	public void run()
	{System.out.println("thread is running");
			}
}


public class Test {

	public static void main(String[] args) {
		Car obj = new Car();
		obj.start();	}

}
