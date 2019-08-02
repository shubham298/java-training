import java.util.InputMismatchException;
import java.util.Scanner;


public class multi {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hari employment services");
String name=null;int exp[]={12,4,2,8,5},index=0;
Scanner scan=new Scanner(System.in);
	System.out.println("Enter the name:");
	name=scan.next();
	try {
		System.out.println("Mention expreience by index");
		index=scan.nextInt();
		System.out.println("Selected exp :"+exp[index]);
		
	} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e+"\n Index should be within:"+exp.length);
		index=scan.nextInt();
		System.out.println("Selected exp"+exp[index]);
	}catch(InputMismatchException ins){
		Scanner get=new Scanner(System.in);
		System.out.println("Enter only number within:"+exp.length);
		index=get.nextInt();
		System.out.println("Selected exp:"+exp[index]);
	}
	catch(Exception e){System.out.println(e);}
		
	finally{
		if(exp[index]>=2&&exp[index]<6)
		{System.out.println(name+"wll get 15.8 LPA");}
		else if(exp[index]>=6&& exp[index]<10)
		{
			System.out.println(name+"will get 25LPA");
	}else{
	System.out.println(name+"will get 30LPA");	
	}
	}
	

}
}
