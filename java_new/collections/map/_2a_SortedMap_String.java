import java.util.*;
class _2a_SortedMap_String{
	public static void main(String args[]){
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
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
