import java.util.*;
class _1a{
	public static void main(String[] args) {
		ArrayDeque<String> st = new ArrayDeque<String>();
		st.push("kRU");
		st.push("thi");
		while(st.peek()!=null)
			System.out.println(st.pop()+ " ");
	}
}