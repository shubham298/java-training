import java.util.LinkedList;


public class linkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList list1=new LinkedList();//generic
list1.addLast("Web developer");//add and addlast does samething
list1.add("Android developer");
list1.add(1000);
System.out.println(list1);

LinkedList<Double> list2=new LinkedList<Double>();
list2.addAll(list1);list2.addFirst(45.4);
list2.add(9999.7);
System.out.println(list2);


System.out.println(list1.get(3));
System.out.println(list1.getLast());
System.out.println(list2.indexOf("Web developer"));

list2.remove();//remove and removefirst works same
list2.removeFirst();
System.out.println(list2);
	}

}
