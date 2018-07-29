class hexByte{
	public static void main(String args[]){
		char hex[] = { '0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		byte b = (byte)0xa0;
		int i = b>>>1;
		int a = 0x7fffffff;
		int c = (a<<1) + 1;
		System.out.println( "b = " + i + " hex = " + hex[(b >> 4) & 0xf] + hex[b & 15] + " a " + a + " c " + c);
	}
}
