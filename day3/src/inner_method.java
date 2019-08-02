
public class inner_method {
	int suit=42;
	public void root(long temp){
		long accNo=temp;
		class React
		{
			public void display(){System.out.println(inner_method.this.suit);}
		}
		System.out.println(accNo);
	}
public static void main(String[] args)
	{
		inner_method in=new inner_method();
		
		in.root(343545454554L);
	}
}
