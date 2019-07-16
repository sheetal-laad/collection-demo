import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
	public String name;
	public Task(String name)
	{
		this.name=name;
	}

    @Override
    public void run() {
    	for(int i=0;i<5;i++)
    	{
    		if(i==0)
    		{
    			System.out.println("execution of---"+name+"  started");
    		}else
    		{
    			System.out.println(name +"    is executing");
    		}
    	}
       System.out.println("execution completed for-----------" +name);
	
    }
	
}
public class FixedThreadPoolDemo {

	public static void main(String[] args)
	{
		ExecutorService executor=Executors.newFixedThreadPool(3);
		Task t1=new Task("A");
		Task t2=new Task("B");
		Task t3=new Task("C");
		Task t4=new Task("D");
		Task t5=new Task("E");
		executor.execute(t1);
		executor.execute(t2);
        executor.execute(t3);
        executor.execute(t4);
        executor.execute(t5);
        executor.shutdown();


	}

}
