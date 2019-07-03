import java.util.Iterator;
import java.util.PriorityQueue;


public class PriorityQueueDemo {

	public static void main(String[] args) {
	PriorityQueue p=new PriorityQueue();
	p.offer(234);
	p.offer(436);
	p.offer(12324);
	p.poll();
	
	PriorityQueue p1=new PriorityQueue();
	p1.offer(67);
	p1.offer(123);
	p.addAll(p1);
	Iterator it=p.iterator();
	
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
System.out.println(p.peek());
	}

}
