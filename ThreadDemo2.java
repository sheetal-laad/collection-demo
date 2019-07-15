import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class ThreadDemo2 implements Runnable {
public static int count=0;


	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		int numberofrequest=sc.nextInt();
		ExecutorService es=Executors.newFixedThreadPool(10);
		long start=System.nanoTime();
		for(int i=0;i<numberofrequest;i++)
		{
			es.execute(new ThreadDemo2());
		}
		long totaltime=System.nanoTime()-start;
		es.shutdown();
		boolean b=es.awaitTermination(1, TimeUnit.MILLISECONDS);
		if(b)
			System.out.println("-------------------------------------------------execution of all the threads is completed");
		else
			System.out.println("-----------------------------------------------------------------timed out");
		System.out.println(count +"threads are excecuted");
		System.out.println("total execution time is------"+ totaltime);
	

	}
    @Override
	public void run() {
    	long start=System.nanoTime();
		System.out.println(count+" ---------"+Thread.currentThread()+"------is executing");
		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count++;
		System.out.println("time to execute  "+Thread.currentThread()+"  "+(System.nanoTime()-start));
	
		
	}

}
