
class Qsort{
	public void qsort(int[] arr,int left,int right){
		int index = partition(arr,left,right);
		if(left<index-1)
			qsort(arr,left,index-1);
		if(right>index)
			qsort(arr,index,right);
	}
	void print(String s){
		System.out.println(s);
	}

	public  int partition(int[] arr,int left,int right){
		int pivot = arr[(left + right)/2];
		while(left<=right){
			while(arr[left]<pivot) left++;
			while(arr[right]>pivot) right--;
			print("    "+ left+ " "+ pivot);
			if(left<=right)
				swap(arr,left++,right--);
		}
		print(" "+left,arr);
		return left;
	}
	void swap(int [] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	void print(String s,int[] arr){
		System.out.println(s);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = new int[] {0,1,2,3,4,5};
		int[] arr1 = {5,4,3,2,1,0};
		Qsort q  = new Qsort();
		q.print("",arr1);
		q.qsort(arr1,0,arr.length-1);
		q.print("",arr1);
	}
}