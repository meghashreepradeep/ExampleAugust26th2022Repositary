package com.Threadconcept;
class Mythread3 implements Runnable
{
	public void run()
	{
		DisplayEvenNumber();
	}
	synchronized void DisplayEvenNumber()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+"Display Even number:"+i);
				}
			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
public class ThreadDemo3 {

	public static void main(String[] args) {
		
		Mythread3 job=new Mythread3();

		Thread t1=new Thread(job);
		Thread t2=new Thread(job);

		t1.setName("alpha");
		t2.setName("omega");


		t1.start();
		t2.start();
			}

}
