
public class Manage implements Operate{
	company[] comp=new company[5];
	static int pos;
	public static void main(String[] args) {
		company a=new company("Pavitra","java",4,10000);
		company b=new company("Namitha","C",5,30000);
		company c=new company("Nireeksha","C++",1,10000);
		company d=new company("Pragathi","Pyhton",4,10000);
		Manage m=new Manage();
		m.insert(a);
		m.insert(b);
		m.insert(c);
		m.insert(d);
	}
	public void insert(company a) {
		for(int index=0;index<comp.length;index++)
		{
			if(comp[index]==null)
			{
				comp[index]=a;
				System.out.println(a.getCname()+"Lancer added");
				break;
			}
		}
	}
	
	public void search(String tech)
	{
		if(pos>=comp.length-1)
		{
			return;
		}
		else
		{
			if(comp[pos].getSkill().equalsIgnoreCase(tech))
			{
				System.out.println(comp[pos]);
			}
			pos++;
		}search(tech);
	}
}
