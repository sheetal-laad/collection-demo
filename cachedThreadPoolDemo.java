import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is executing");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" has comleted execution");
		
	}

}
public class cachedThreadPoolDemo {

	public static void main(String[] args) {
		ExecutorService executor=Executors.newCachedThreadPool();
		for(int i=0;i<100;i++)
		{
			executor.execute(new Task1());
		}
		executor.shutdown();

	}

}
