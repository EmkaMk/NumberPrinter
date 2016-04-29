import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class NumberPrinter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sec=sc.nextInt();
		sc.close();
		Thread thread=new Thread(){
			@Override
			public void run()
			{
				
				for(int i=0;i<n;i++)
				{
					if(Thread.interrupted())
					{
						System.out.println("Interrupted");
						return;
					}
					System.out.println(i);
				}
			}
			
		};
		thread.start();
		thread.join(sec);
		System.out.println("Interrupting");
		thread.interrupt();
	

	}

}
