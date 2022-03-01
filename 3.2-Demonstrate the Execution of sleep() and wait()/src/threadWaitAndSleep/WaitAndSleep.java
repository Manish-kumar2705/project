package threadWaitAndSleep;
class Test{
	int amount = 1000;
	synchronized void withdraw(int amount) throws InterruptedException {
		if(amount>this.amount) {  //checking if u r withdrawing more amount than that u have
		System.out.println("Not enough money can not withdraw, please deposit first");
		this.wait();//This remove the lock and move the thread in waitlist;
		Thread.sleep(1000); //puts the treat to blocked state for 1ms; we are using synchronised so it doesnt matter other threart cant access even current thread is in sleep
		this.amount-=amount;
		System.out.println("balance remaining: "+ this.amount);
		}
	}
	synchronized void deposit(int amount) {
		this.amount+=amount;
		System.out.println("deposit successfuly your new balance is: " + this.amount );
		this.notify();  //this will notify the treat in waitlist to continue
	}
	
}

public class WaitAndSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();		//object of class
		new Thread(new Runnable() {   //using thread class to create threads
			@Override
			public void run() {
				try {
					t1.withdraw(5000);		//fn call to withdraw
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}).start();
		//2nd threat
		new Thread(new Runnable() {
			public void run() {
				t1.deposit(20000);
			}
		}).start();
		
	}

}
