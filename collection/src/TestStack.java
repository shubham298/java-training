import java.util.Iterator;
import java.util.Stack;


public class TestStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack stk1=new Stack();//generic-hold data of different datatype
stk1.push(200);stk1.push("sdadasdasd");
stk1.push(2333);stk1.push("two");stk1.push("three");
stk1.push("Four");
System.out.println(stk1.search("two"));
System.out.println(stk1.search(200));
Stack<String> stk2=new Stack<String>();//non generic-specific type
stk2.addAll(stk1);
System.out.println(stk2);
//stk1.pop();
//System.out.println(stk2.search(""));
Iterator<Object> i=stk1.iterator();//Iterator
while(i.hasNext()){System.out.println(i.next());}
//skt1.clear();
	}

}
