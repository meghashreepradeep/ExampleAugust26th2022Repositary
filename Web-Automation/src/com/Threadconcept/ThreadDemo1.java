package com.Threadconcept;
class Mythread implements Runnable
{
	public void run()
	{
		DisplayEvenNumber();
	}
	void DisplayEvenNumber()
	{
		try
		{
			for(int i=20;i<=40;i++)
			{
				if(i%2==0)
				{
					System.out.println("Even number:"+i);
				}
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		Mythread job=new Mythread();
		
		Thread t1=new Thread(job);
		t1.start();

	}

}
