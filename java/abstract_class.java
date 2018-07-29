abstract class Figure{
	double dim1,dim2;
	Figure(double a,double b){
		dim1 = a;
		dim2 = b;
	}
	
	abstract double area();
}

class rect extends Figure{
	rect(double a,double b){
		super(a,b);
	}
	
	double area(){
		System.out.println("area of rect is");
		return dim1*dim2;
	}
}
class tri extends Figure{
 	double dim3;
	tri(double a,double b,double c){
		super(a,b);
		dim3 = c;
	}
	
	double area(){
		System.out.println("area of tri is");
		return dim1*dim2*dim3;
	}
}
		
class abstract_class{
	public static void main(String args[]){
		//Figure f = new Figure(10,20);
		rect r = new rect(4,5);
		tri t = new tri(1,2,3);
		Figure figref ;
		//figref.area();
		figref = r;
		figref.area();
		figref = t;
		figref.area();
	}
}
