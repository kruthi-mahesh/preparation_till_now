class Box{
	double l,b,h;
double vol(){
		return l*b*h;
	}
	Box(double l,double b,double h){
		this.l = l;
		this.b = b;
		h = h;
		this.h=89;
		System.out.println(" in constr h = " + h + " this h= " + this.h); 
	}
	void exp()
	{
		System.out.println(" h= " + this.h);
	}
}

class BoxDemo5{
	public static void main(String args[]){
		double vol;
		Box mybox = new Box(8,4,56);
		
		vol = mybox.vol();
		System.out.println("Vol is " + vol);
		mybox.exp();
	}
} 