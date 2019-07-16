 class Account {
	private float balance=50000;
	public float getBalance()
	{
		return balance;
	}
	public synchronized void withdraw(float amount,String name)
	{
		if(this.getBalance()>amount)
		{
			balance=balance-amount;
			System.out.println(amount+" rs is withdrawn by"+name);
		}else
			System.out.println("account has insufficient balance");
	}
}



 class AccountHolder implements Runnable {
public Account account;
float amount;
String name;
public AccountHolder(float amount,Account account,String name) {
	this.account = account;
	this.amount=amount;
	this.name=name;
}
public void run()
{
	account.withdraw(amount,name);
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


}



public class SynchronizationDemo1 {

	public static void main(String[] args) throws InterruptedException
	{
		Account account=new Account();
		AccountHolder h1=new AccountHolder(1000.0f,account,"jack");
		AccountHolder h2=new AccountHolder(2000.0f,account,"john");
		Thread t1=new Thread(h1);
		Thread t2=new Thread(h2);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("balance remaining in account is" +account.getBalance());
		
	}

}