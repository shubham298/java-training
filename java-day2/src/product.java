import java.util.Scanner;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
System.out.println("Enter the number of element\n");
int n=scan.nextInt();
int i,s,j,m,q,num;
int[] a=new int[n];
s=a.length;
System.out.print("fill the array");
int[] visted=new int[n];

for(i=0;i<a.length;i++) {
	a[i]=scan.nextInt();
}

for(m=0;m<s;m++) {
	for(q=m+1;q<s;q++) {
		if(a[m]!=a[q]) {
			continue;
		}else {
			visted[m]=a[m];//duplicate
			
		}
	}
}



for (int element: visted) {
	System.out.println("Enter the num");
	num=scan.nextInt();
	if(element%num==0) {
		System.out.print(element);	
	}
    
}
	}
}


