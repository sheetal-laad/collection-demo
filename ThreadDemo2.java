import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Request implements Runnable
{
	public static int count=0;
	public void run() {
    	long start=System.nanoTime();
		System.out.println(Thread.currentThread()+"------is executing");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	  count++;
	  System.out.println("time to execute  "+Thread.currentThread()+"  "+(System.nanoTime()-start));
	 
		
	}
	
}

public class ThreadDemo2 {

       public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		int numberofrequest=sc.nextInt();
		ExecutorService es=Executors.newFixedThreadPool(10);
		long start=System.nanoTime();
		for(int i=0;i<numberofrequest;i++)
		{
			es.execute(new Request());
		}
		long totaltime=System.nanoTime()-start;
		es.shutdown();
		boolean b=es.awaitTermination(1, TimeUnit.MILLISECONDS);
		if(b)
			System.out.println("execution of all the threads is completed");
		else
			System.out.println("timed out");
		System.out.println("total execution time is------"+ totaltime);
	

	}
  

}
