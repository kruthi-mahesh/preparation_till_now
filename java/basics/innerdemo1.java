class outer{
	int outer_x = 100;
	
	void test(){
	int i;
	for(i=0;i<10;i++){
		//Inner i1  = new Inner(); 	This is giving error
		//i1.display();
		class Inner{
			void display(){
				outer_x++;
				System.out.println(outer_x + " ");
			}
		}
		Inner i1  = new Inner();
		i1.display();
		
	}
}
}

class innerdemo1{
	public static void main(String args[]){
		outer o1 = new outer();
		o1.test();
		outer.Inner = new outer.Inner();
		
	}
}
