
public class bubbleSort {
public static void sort(String ele) {
	byte []got=ele.getBytes();
	int pos=0,com=0;
	while(pos<got.length-1)
	{
		com=0;
		while(com<got.length-pos-1)
		{
			if(got[com]>got[com=1]){
				{
					got[com]^=got[com+1]^=got[com];got[com]^=got[com+1];
					
					
				}
				com++;
				
			}pos++;
		}System.out.println(new String(got));
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String desired="DAdfdFFce";
//System.out.println(arr);
bubbleSort.sort(desired);
	}

}
