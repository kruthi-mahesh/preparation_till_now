class long1{
	public static void main(String args[]){
		int i;
		long l;
		short s;
		byte b;
		l = 0x7ffffffffffffffL;
		i = 32676;
		System.out.println("i: " + i + "l: " + l + "s: " + s + "b: " + b);
		l = i;
		b = 12;
		s = b;
		System.out.println("i: " + i + "l: " + l + "s: " + s + "b: " + b);
	}
}
