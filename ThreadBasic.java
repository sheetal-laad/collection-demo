class Task3 implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread()+"  is in running state");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread()+" has completed execution");
		
	}
	
}



public class ThreadBasic {

	public static void main(String[] args) {
	Task3 ob=new Task3();
	Thread t1=new Thread(ob);
	Thread t2=new Thread(ob);
	Thread t3=new Thread(ob);
	t1.start();
	t2.start();
	t3.start();
	try{
	t1.join();
	t2.join();
	t3.join();
	}catch(Exception e){}
System.out.println("execution of all the threads is completed");
	}

}
