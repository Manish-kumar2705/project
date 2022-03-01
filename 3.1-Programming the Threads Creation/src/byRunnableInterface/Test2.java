package byRunnableInterface;

class Car2 implements Runnable{
	static int i=0;
	public void run() {
		while(i<10) {
		try {//threads are simultaneously accessing the data in random order.//use th.join to let one thread die first.
			//System.out.println("threat is running");
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		}
	}
}

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Car2 obj= new Car2();
		Thread th = new Thread(obj); //constructor overlaoding
		 Thread th2 = new Thread(new Car2());
		th.start();
		//th.join(); //waits for the thread th to die 
		th2.start();
		System.out.println(th.getName());
			
	}

}
