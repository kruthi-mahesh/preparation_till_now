import java.util.*;
class Mycomp implements Comparator<String>{
	Map<String,Integer> mp ;
	Mycomp(Map<String,Integer> map)
	{
		mp = map;
	}
	public int compare(String a,String b)
	{
		int val = mp.get(b).compareTo(mp.get(a));
		if( val == 0)
			return a.compareTo(b);
		return val; 
	}
}
class url{
	static void sop(String s){
		System.out.println(s);
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		Map<String,Integer> mp  =new HashMap<String,Integer>();
		int t = in.nextInt();
		in.nextLine();
		String s;
		while(t--!=0)
		{
			s = in.nextLine();
			Integer val = mp.get(s);
			if(val == null)
				mp.put(s,1);
			else
				mp.put(s,val+1);
			
		}
		Map<String,Integer> tr = new TreeMap<String,Integer>(new Mycomp(mp));
		tr.putAll(mp);
		sop(""+ tr.keySet());
		for(String str:tr.keySet())
		{
			sop(str);
		}

	}
}