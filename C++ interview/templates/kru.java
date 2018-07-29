public class kru{
	static int i = 90;

	kru(){
		i=70;
	}
	static void print(String s){
		i=90;
		System.out.println(s);
	}
	public static void main(String[] args) {
		kru obj = new kru();
		i=709;
		print("  "  + obj.i + "  " + i);	
	}
}