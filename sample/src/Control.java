import java.util.Scanner;


public class Control {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int user;
int reg=0;
String model="";
System.out.println("Please mention model");
model=scan.nextLine();
switch(model){
case "RIS":System.out.println("there are two owner price is 80000\n");
			System.out.println(":\n");
			reg=2018;
			user=scan.nextInt();
			if(reg<2016){
				System.out.println("");
			}
			break;
case "Enfield":System.out.println("There are three owner at 100000\n");
			break;
case "Avenger":System.out.println("There are two owner at price 560000\n");
			break;
}

scan.close();
	}

}
