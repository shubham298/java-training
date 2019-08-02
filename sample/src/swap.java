
public class swap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(args.length);
//int deposited=0,months=0;
//float interest=0.0F;
//char type='\0';
//deposited=Integer.parseInt(args[0]);
//months=Integer.parseInt(args[1]);
//interest=Float.parseFloat(args[2]);
//type=args[3].charAt(0);
//deposited+=(deposited*months*interest)/100;
//System.out.println("deposited:"+deposited);
String name=args[0];
int experience=Integer.parseInt(args[1]);
float salary=0.0F;
salary=Float.parseFloat(args[2]);
int credit,pl;
pl=(int) (salary/4);
credit=(int) (salary/3);
System.out.println("name:"+name+"\nexperience:"+experience);
System.out.println("salary:"+salary+"\ncredit:"+credit+"Personal loan"+pl);
if(experience>2&&experience<4){
	System.out.println("\nTeam lead");
	
}else if(experience>4&&experience<8){
	System.out.println("\nProject manager");
}else{
	System.out.println("\nBDM");
	
}
	}
}
