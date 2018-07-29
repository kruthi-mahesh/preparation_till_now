import java.util.*;
class _2b_TreeMap_String{
	public static void main(String[] args) {
		Comparator<String> c = Collections.reverseOrder();
		TreeMap<String,Integer> hm = new TreeMap<String,Integer> (c);
		hm.put("John Doe",35);
		hm.put("Tom Smith",50);
		hm.put("Jane Baker",7);
		hm.put("Tod Hall",12);
		hm.put("Ralph Smith",-6);
		System.out.println(hm);

		Set<String> kset = hm.keySet();

		for(String me : kset)
		{
			System.out.print(me + " : ");
			System.out.println(hm.get(me));
		}
		Iterator<String> itr = kset.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str + " : " + hm.get(str));
		}
		int newValue = hm.get("Jane Baker");
		hm.put("Jane Baker", newValue + 100);
		 System.out.println(hm);
	}
}