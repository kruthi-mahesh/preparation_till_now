class BoxDemo1{
	double width,height,length;
	static int e;
	void vol(){
		System.out.println("Volume is " );
		e=10;
		System.out.println(width * length * height   + " e is " + e);
		
	}
	public static void main(String args[]){
		BoxDemo1 mybox = new BoxDemo1();
		mybox.height = 5.2;
		mybox.width = 1.2;
		mybox.length = 8.9;
		mybox.vol();
		BoxDemo1.e = 4;
		System.out.println(BoxDemo1.e);
	}
}
