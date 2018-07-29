class linear{
	public static void main(String args[]){
		int[] nums = {1,2,3,4};
		boolean found = false;
		for(int x : nums)
			if(x == 2)
			{
				found = true;
				System.out.println("Found\n");
				return;
			}
		System.out.println("Not found\n");
	}
}
