class AsciiDemo{
	public static void main(String args[]){
		char ch=0;
		int i;
		int ascii;
		for(i=-10;i<256;i++,ch++)
		{
			ascii = (int)ch;
			System.out.println(i + ": " + ch + "ascii " + ascii );
			
		}
	}
}
	
