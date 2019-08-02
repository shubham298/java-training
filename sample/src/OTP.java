import java.util.Random;


public class OTP {
public static void main(String[] args) {
	StringBuilder build=new StringBuilder();
	Random ran=new Random();
	int digit=1;
	while(digit<=6){
		build.append(ran.nextInt(10));digit++;
		
	}
	System.out.println("UR OTP IS :"+build.toString());
	
}
}
