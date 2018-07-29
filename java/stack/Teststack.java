class stack{
	int stk[] = new int[10];
	int tos;
	stack(){
		tos=-1;
	}
	void push(int key){
		if(tos==9)
			System.out.println("stack is full cant push");
		else
			stk[++tos] = key;
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

class Teststack{
	public static void main(String args[]){
	stack mystack = new stack();
	mystack.pop();
	for(int i=0; i<10;i++)
		mystack.push(i);
	mystack.push(13);
	int item = mystack.pop();
	System.out.println("Pop: " + item);
	}
}
