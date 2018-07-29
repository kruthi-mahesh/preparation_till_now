class LL1{
	public int i=10;
	int fn()
	{
		i++;
		return i;
	}
	public static void main(String[] args) {
		
		
		LL1 obj = new LL1();
		//fn();
		int j = obj.fn();
		//i++;
		//fn();
		//i++;
		System.out.println(" "+j);
	}
}