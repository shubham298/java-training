import java.util.Scanner;

//one task multi thread
public class first {

	public static void main(String[] args) {
		bank b=new bank();
		Thread t1=new Thread(b,"Sahil");
		Thread t2=new Thread(b,"Bhavya");
		Thread t3=new Thread(b,"Dhiraj");
		Thread t4=new Thread(b,"Shubham");
		t1.start();t2.start();t3.start();t4.start();

	}

}
class bank extends Thread{
	Scanner scan=new Scanner(System.in);
	int withdraw;
	int avlamt=20000;
	public void getMoney(){
		System.out.println("Enter the withdraw:");
		withdraw=scan.nextInt();
		if(withdraw<=avlamt)
		{System.out.println("withdraw  money is :"+withdraw);avlamt-=withdraw;}
		else{System.out.println("cannot withdraw");
		}
	}
	synchronized public void run(){
	System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
	getMoney();
	}
		
	}
