import java.util.*;
class _1a{
	public static void main(String[] args) {
		ArrayDeque<String> q = new ArrayDeque<String>();
		q.addLast("kru");
		q.addLast("thi");
		Iterator<String> itr = q.descendingIterator();
		while(itr.hasNext())
		{
			String s = itr.next();
			System.out.println(s);
		}
		for(String s : q)
			System.out.println(s);
		while(q.peek()!=null)
			System.out.println(q.remove());
	}
}