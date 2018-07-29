class Box{
	double width;
	double height;
	double length;
}

class BoxDemo{
	public static void main(String args[]){
		Box mybox1 = new Box();
		mybox1.width = 5;
		mybox1.length = 8.3;
		mybox1.height = 4.5;
		double vol = mybox1.height * mybox1.length * mybox1.width;
		System.out.println("Vloume is " + vol);
	}
}
