class factorial{
	public static void main(String args[]){
		int x = 5;
		int fact = 1;
		for(int i=0;i<=x;i++)
			fact = fact * i;
		System.out.println("Factorial of " + x + " is " + fact);
	}
}