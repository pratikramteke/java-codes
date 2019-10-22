class ExceptionDemo{
	public static void main(String args[]){
		int a=10,b=2;
		try{
			int c=a/b;
			System.out.println("result:"+c);
		}
		catch(ArithmeticException e){
			System.out.println("b has value zero");
		}
	}
}
