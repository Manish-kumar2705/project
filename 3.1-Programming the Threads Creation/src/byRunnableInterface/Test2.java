package byRunnableInterface;

class Car2 implements Runnable{
	static int i=0;
	public void run() {
		while(i<=10) {
		try {//threads are simultaneously accessing the data in random order.
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
		
		th2.start();
		System.out.println(th.getName());
			
	}

}
