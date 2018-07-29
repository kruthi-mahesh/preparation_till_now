import java.util.*;
 class Pair{
	private Integer x;
	private Integer y;
	Pair(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	int getx(){
		return x;
	}
	int gety()
	{
		return y;
	}
	
}

class _1aMap{


	public static HashMap<Pair,Integer> hm = new HashMap<Pair,Integer>();

	
	private static void visit(Pair p1)
	{
		hm.put(p1,1);
	}
	private static boolean visited(Pair p1)
	{
		if(hm.get(p1)==null)
			return false;
		return true;
	}


	public static void main(String[] args) {
		ArrayDeque<Map.Entry<String,Integer>> a = new ArrayDeque<Map.Entry<String,Integer>>();
		ArrayDeque<Pair> queue = new ArrayDeque<Pair>();
		System.out.println("aHERE");
		queue.addLast(new Pair(0,0));
		queue.addLast(new Pair(0,1));
		queue.addLast(new Pair(0,2));
		Pair p1 = queue.peekFirst();
		for(Pair p:  queue)
			System.out.println(p.getx()+"  "+p.gety());
		queue.removeFirst();
		for(Pair p:  queue)
			System.out.println(p.getx()+"  "+p.gety());

		Pair a1 = new Pair(0,0);
		Pair a2 = new Pair(0,0);
		hm.put(a1,1);
		hm.put(a2,2);
		System.out.println(hm+ " "+ hm.get(a1));
	}

}