class a3{
	public static void main(String args[]){
		int arr[][] = new int[3][];
		arr[0] = new int[1];
		arr[1] = new int[2];
		arr[2] = new int[3];
		System.out.println(arr[0] + "  "  + arr[1]);
		int k=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<i+1;j++)
				{
					arr[i][j] = k++;
					System.out.print(arr[i][j] + "  ");
				}
			System.out.println();
		}
		int a[][] = {   { 1,2},
				{ 3,4,5}
				};
		System.out.print(a[0][0] + " " + a[0][1] + " " + a[1][2]);
	}
}
