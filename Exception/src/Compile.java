import java.io.IOException;


public class Compile {

	
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
Runtime run=Runtime.getRuntime();
Process pro=null;
pro=run.exec("calc");
Thread.sleep(4000);
pro=run.exec("mspaint");
	}

}
