import java.util.*;
class _3a_TreeSet{
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<String>();
		ts.add("C");
		ts.add("B");
		ts.add("F");
		for(String me: ts)
			System.out.print(me + " ");

	}
}