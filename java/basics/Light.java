class Light{
	public static void main(String args[]){
		int lightspeed,days;
		long seconds,distance;
		
		lightspeed = 186000;
		
		days = 1000;
		
		seconds = days * 24 * 60 * 60;
		distance = lightspeed * seconds;
		
		System.out.println("In " + days + " days,Light travels " + distance + " miles");
	}
} 