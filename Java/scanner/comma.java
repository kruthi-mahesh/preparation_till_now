import java.util.*;
class comma{
	static void sop(String s)
	{
		System.out.println(s);
	}
	static int find(int ar[],int n){
		int dp[] = new int[n+1];
		sop(""+ dp[0]);
		Arrays.fill(dp,0);
		return 2;
	}
	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		int t = in.nextInt();
		
		while(t--!=0){
			int n = in.nextInt();
			int arr[] = new int[n];
			in.useDelimiter("\\s");
			for(int i=0;i<n;i++)
				arr[i] = in.nextInt();
			for(int i=0;i<n;i++)
				sop(""+arr[i]);
			int res = find(arr,n);
		}
		in.close();
	}
}