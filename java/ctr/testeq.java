class test{
	int a,b;
	test(int i,int j)
	{
		a=i;b=j;
	}
	boolean iseq(test ob)
	{
		if(ob.a==a && ob.b==b)return true;
		else return false;
	}
}

class testeq{
	public static void main(String args[]){
	test t1 = new test(4,8);
	test t2 = new test(4,8);
	test t3 = new test(7,8);
	System.out.println(" t1==t2  is " +  t1.iseq(t2));
	System.out.println(" t1==t3 is " + t1.iseq(t3));
	}
}