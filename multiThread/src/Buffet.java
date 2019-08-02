
public class Buffet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
veg v=new veg();
nonveg non=new nonveg();
Thread t1=new Thread(non,"Adarsh");Thread t2=new Thread(non,"Keerthan");
Thread t3=new Thread(v,"Anusha");Thread t4=new Thread(non,"mufeed");
t1.start();

	}

}
class veg implements Runnable
{

	@Override
	public void run() {
	System.out.println(Thread.currentThread().getName()+"had Veg briyani");
	System.out.println(Thread.currentThread().getName()+"had Veg salad");
	System.out.println(Thread.currentThread().getName()+"had Veg dessert");
	if(Thread.currentThread().getName().equals("Anusha")){
		Thread.currentThread().stop();}
	}
	}

class nonveg implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"had muttonbriyani");
		
		
	}
	
}