import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class unmarsheljava {

	public static void main(String[] args) throws JAXBException {
File file=new File("C:/Users/mite/Desktop/java_trainnig/new.xml");		
JAXBContext con=JAXBContext.newInstance(freeLancer.class);
Unmarshaller unmarsh=con.createUnmarshaller();
freeLancer temp=(freeLancer)unmarsh.unmarshal(file);
System.out.println(temp);
	
	}

}
