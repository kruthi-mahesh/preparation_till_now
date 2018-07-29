class Outer{
	int outer_x = 100;
	
	void test(){
		Inner inner = new Inner();
		System.out.println(" In test(), Outer x = " + outer_x);
		inner.display();
		
	}
	
	class Inner{
		int y=12;
		
		void display(){
			System.out.println(" In inner class, Outer x = " + outer_x);
			outer_x++;
		}
		
		 void showy(){
			System.out.println(" In inner class, in showy Outer x = " + outer_x); 
			System.out.println(" In inner class, y = " + y);
			y++;
		}
		
	}
	void display(){
		System.out.println(" ,In display(outer class)Outer x = " + outer_x);
			outer_x++;
	}
	
}

class innerdemo{
	public static void main(String args[]){
		Outer outer = new Outer();
		outer.display();
		outer.test();
		outer.display();
		
		//outer.Inner.showy();
		
		/*Outer.Inner in = new Outer.Inner();
		in.display();
		in.showy();*/
		
	}
}
