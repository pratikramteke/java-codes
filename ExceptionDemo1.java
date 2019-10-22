class ExceptionDemo1{
	public static void main(String args[]){
		int a=10,b=2;
		try{
			int c=a/b;
			System.out.println("result:"+c);
			int arr[]={10,20,30};
			System.out.println("arr[3]="+arr[3]);
		}
		catch(ArithmeticException e){
			System.out.println("b has value zero");
		}
		catch(Exception x){
			x.printStackTrace();
		}
		finally{
			System.out.println("replay from finally");
		}
	}
}
