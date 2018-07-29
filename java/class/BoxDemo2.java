class box{
	double w,h,l;
	static int n  ;
	void vol()
	{
		System.out.println("Volume is " );
		System.out.println(w*l*h);
		n++;
		System.out.println("n++ = " + n);
		//display();
	}
	static void display()
	{
		n++;
		System.out.println(" Inside display of box class, n is " + box.n);
		//box.vol();
		box obj1 = new box();
		obj1.w = 4;
		obj1.l =8;
		obj1.h =9;
		obj1.vol();
		
	}
}
class BoxDemo2{
	public static void main(String args[])
	{
		box m = new box();
		m.w = 4.5;
		//m.l = 9.88;
		m.h = 3.2;
		System.out.println("IN main ia mcalling vol");
		m.vol();
		//box.vol();	error.
		box.n=19;
		System.out.println(" in main n= " + box.n);
		m.n = 56;
		System.out.println(" in main n= " + box.n);
		//try1();
		BoxDemo2 obj = new BoxDemo2();
		obj.try1();
		System.out.println(" in main n= " + box.n);
		m.display();
		
	}
	void try1()
	{
	 	box m3 = new box();
	 	System.out.println(" in try n= " + m3.n + " " + box.n);
	 	m3.n = 98;
	 	System.out.println(" in try n= " + box.n);
	 	box.n = 789;
	 	box.display();
	 	//display();
	 	
	 }
}
