abstract class Op
{
    public abstract void sum();
}
class Isum extends Op
{
        public void sum()
            {
	int x=10,y=20;
	int z=x+y;
	System.out.println("z="+z);
             }
}
class Fsum extends Op
{
      public void sum()
         {
	float x=3.5f,y=2.6f;
	float z=x+y;
	System.out.println("z="+z);

          }
}
class AbstractDemo
{
   public static void main(String ar[])
    {
                Op ob=null;
	ob=new Isum();
	ob.sum();
	ob=new Fsum();
	ob.sum();
	
    }

}
