class bool{
	public static void main(String args[]){
		boolean b;
		int bool;
		b = false;
		bool = (int) b;
		System.out.println("b is " + b + "int " + bool);
		b = true;
		
		System.out.println("b is now " + b + "int " + bool);
		if(b)	System.out.println("This is executed");
		else	System.out.println("This is not executed");
		System.out.println("10 > 19 is " + (10>19) + "int " + bool);
		
	}
} 