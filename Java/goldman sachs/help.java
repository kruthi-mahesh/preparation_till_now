class help{
	public static void main(String[] args) {
	
		int index = -2;
		char str = 'a';
		//toRollArray[index] = (char) ('a' + (rollCounts[index] % 26 + toRollArray[index] - 'a') % 26);
        

		char newc =  (char) ( 'z' + (index % 26  + str - 'z') % 26);
        

		System.out.println(newc);

	}
}