import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Task2 implements Runnable
{

	@Override
	public void run() {
		long start=System.nanoTime();
		System.out.println(Thread.currentThread().getName()+" is executing");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long end=System.nanoTime();
		long totaltime=end-start;
		System.out.println(Thread.currentThread().getName()+" has comleted execution in "+totaltime);
		
	}

}
public class SingleThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executor=Executors.newSingleThreadExecutor();
		long start=System.nanoTime();
		for(int i=0;i<5;i++)
		{
			executor.execute(new Task2());
		}
		long end=System.nanoTime();
		long totaltime=end-start;
		executor.shutdown();
		executor.awaitTermination(Long.MAX_VALUE,TimeUnit.MILLISECONDS);
		System.out.println("total execution time :"+totaltime);
	}

}

