class str_char{
	public static void main(String args[])
	{
		String s = "kruthi";
		char ch = s.charAt(2);
		System.out.println("ch: " + ch);
		int len = s.length();
		char[] arr = new char[len];
		arr = s.toCharArray();
		System.out.println(arr);
	}
}
