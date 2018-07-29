class Stack{
	private int stk[];
	private int tos;
	
	Stack(int size){
		stk = new int[size];
		tos = -1;
	}
	
	void push(int item){
		if(tos >= stk.length-1)
			System.out.println("Stack overflow");
		else
			stk[++tos] = item;
	}
	
	int pop(){
		if(tos<0){		
				System.out.println("Stack underflow");
				return 0;
		}
		else
			return stk[tos--];
	}
}

class teststack{
	public static void main(String args[]){
		Stack m1 = new Stack(10);
		for(int i=0; i<10; i++)
			m1.push(i);
		m1.push(10);
		//m1.pop();
		for(int i=0;i<10;i++)
		 	System.out.println(" pop: " + m1.pop());
		 m1.pop();
	}
}
