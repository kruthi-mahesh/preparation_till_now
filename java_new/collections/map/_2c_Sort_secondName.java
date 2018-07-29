import java.util.*;
class MyComp implements Comparator<String>{
	public int compare(String a,String b)
	{
		int i,j,k;
		//String aStr,bStr;

		i = a.lastIndexOf(' ');
		j = b.lastIndexOf(' ');
		//System.out.println(a.substring(i+1)+ "kru");
		k = a.substring(i+1).compareTo(b.substring(j+1));
		if(k==0)
			return a.compareTo(b);
		else
			return k;
	}
}
class _2c_Sort_secondName{
	public static void main(String[] args) {
		TreeMap<String,Integer> hm = new TreeMap<String,Integer> (new MyComp());
		hm.put("John Doe",35);
		hm.put("Tom Smith",50);
		hm.put("Jane Baker",7);
		hm.put("Tod Hall",12);
		hm.put("Ralph Smith",-6);
		System.out.println(hm);

		Set<Map.Entry<String,Integer>> set = hm.entrySet();

		for(Map.Entry<String,Integer> me : set)
		{
			System.out.print(me.getKey() + " : ");
			System.out.println(me.getValue());
		}
		int newValue = hm.get("Jane Baker");
		hm.put("Jane Baker", newValue + 100);
		 System.out.println(hm);
	}
}
