import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


public class Marshelxml {


	public static void main(String[] args) throws JAXBException, IOException {
	freeLancer[] base=new freeLancer[3];
	base[0]=new freeLancer("shubham","java",7,1000);
	base[1]=new freeLancer("sahil","python",12,8000);
	base[2]=new freeLancer("bhavya","c",9,20000);
	JAXBContext con=JAXBContext.newInstance(freeLancer.class);
	Marshaller marsh=con.createMarshaller();
	marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
	FileOutputStream fos=new FileOutputStream("C:/Users/mite/Desktop/java_trainnig/new.xml");
	for(freeLancer f:base){marsh.marshal(f,fos);}fos.close();
	System.out.println("XML created");
	
	}

}
