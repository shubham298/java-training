import java.util.Scanner;


public class array_operations {
  static Scanner scan=new Scanner(System.in);
  static int ind;
  
	public static void add(int[] week) {
	int index=0;
	while(index<week.length){
		System.out.println("please enter the milage:");
		week[index]=scan.nextInt();
		if(week[index]>30&&week[index]<40){
			week[index]=25;
		}
		index++;
		
	}
}//end of add
	
	public static void traverse(int[] kitkat) {
		if(ind>=kitkat.length){return;}
		else{System.out.println(kitkat[ind]);ind++;}traverse(kitkat);
		
	}//end of traverse
	
	
	public static void main(String[] args) {
		int[] milage=new int[15];
		array_operations.add(milage);
		array_operations.ind=0;
		array_operations.traverse(milage);
		
		
		
	}

}
