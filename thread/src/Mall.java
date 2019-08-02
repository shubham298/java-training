import java.util.Scanner;

//inter Thread communication

public class Mall {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Game game=new Game();
Shopping shop=new Shopping(game);
Thread t1=new Thread(game,"Keertan");
Thread t2=new Thread(game,"bhavya");
t1.start();t2.start();
	}

}
class Shopping implements Runnable
{
Game g;
Shopping(Game temp){g=temp;}
	@Override
	public void run() {
		synchronized(g.scan)
		{
			if(g.amount<500)
			{
				g.amount=1000;
				System.out.println(Thread.currentThread().getName()+"going to notify");
				g.scan.notify();
			}
		}
		System.out.println(Thread.currentThread().getName()+"Shopping in Levis and LeeCopper");
		
	}
	
}
class Game implements Runnable
{
Scanner scan=new Scanner(System.in);
int amount;
	@Override
	public void run() {
		synchronized (scan) {
			System.out.println("enter the price");
			amount=scan.nextInt();
			if(amount<=500){
				try {
					scan.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName()+"you can play playsation");
	}
	
}