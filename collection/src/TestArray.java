import java.util.ArrayList;
import java.util.Collections;
import java.util.Vector;

public class TestArray{
	public static void main(String[] args) {
		ArrayList<String> html=new ArrayList<String>();
		Vector<String> xml=new Vector<String>();
		html.add("car");
		html.add("css");html.add("kit");html.add("database");
		xml.add("car");
		xml.add("css");xml.add("bob");xml.add("lang");
		Collections.sort(xml);
	}
}