
public class inner_class {

	String product;float monitorSize;
	class Enquiry{
		int price;
		public void show(){
			System.out.println(product+" "+monitorSize+" "+price);}
		public void greeting(){
			System.out.println(product+"are going to display"+" "+price);}
		}

	
	
	public static void main(String[] args) {
		inner_class in=new inner_class();
		
		in.monitorSize=32.7F;in.product="LG LED";
		
		Enquiry enq=in.new Enquiry();
		
		enq.price=27000;enq.greeting();enq.show();
		
	}

}
