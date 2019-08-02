
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

public class filemulti {


	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Freelancer base=new Freelancer("shubham","Python",7,70000);
File file=new File("C:/Users/mite/Desktop/java_trainnig/train.text");
FileOutputStream fos=new FileOutputStream(file);
DeflaterOutputStream dos=new DeflaterOutputStream(fos);
dos.write(base.toString().getBytes());
dos.close();
fos.close();
System.out.println("File created and data write");
//file reading
FileInputStream fis=new FileInputStream(file);
InflaterInputStream lis=new InflaterInputStream(fis);
byte[] temp=new byte[fis.available()];
lis.read(temp);lis.close();fis.close();
System.out.println(new String(temp));
	
	}

}
