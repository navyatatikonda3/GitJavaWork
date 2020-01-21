package demothreads;
class MyThread implements Runnable
{
	private String threadName;
	MyThread()
	{
		threadName="MyThread";
	}
	public void run()
	{
		System.out.println("Mythread running successfully");
		System.out.println("Thread " +threadName+" running successfully");
	}
}
public class RunnableThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Thread name :"+Thread.currentThread().getName()+" started");
		MyThread mt=new MyThread();
		mt.run();

	}

}
