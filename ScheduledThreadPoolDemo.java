import java.util.Date;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class Tasks implements Runnable{

	@Override
	public void run() {
		System.out.println("database is updated at :"+System.currentTimeMillis());
		
	}
	
}

public class ScheduledThreadPoolDemo {

	public static void main(String[] args) {
		ScheduledExecutorService sc=Executors.newScheduledThreadPool(5);
		sc.scheduleAtFixedRate(new Tasks(),1,5,TimeUnit.SECONDS);

	}

}
