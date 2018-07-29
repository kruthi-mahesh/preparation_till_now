class arr{
	int a[];
	arr(int size){
		a = new int[size];
	}
	
	void print(int i){
		if(i==-1)
			return ;
		
		System.out.println("[" + i + "] " + a[i]);
		print(i-1);
	}

		
}

class recursion2{
	public static void main(String args[]){
		arr a1 = new arr(10);
		for(int i=0;i<10;i++){
			a1.a[i] = i;
		}
		a1.print(9);
	}
}
