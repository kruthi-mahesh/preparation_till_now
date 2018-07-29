class long1{
	public static void main(String args[]){
		int i;
		long l;
		short s = 14;
		byte b = 15;
		l = 0x7fffffffffffff5l;
		i = 32676;
		System.out.println("i: " + i + " l: " + l + " s: " + s + " b: " + b);
		i = (int)l;
		s = 150;
		b = (byte)s;
		System.out.println(" i: " + i + " l: " + l + " s: " + s + " b: " + b);l = i;
		b = 12;
		s = b;
		System.out.println(" i: " + i + " l: " + l + " s: " + s + " b: " + b);
		
	}
	
}
