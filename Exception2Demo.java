class InvalidResult extends Exception{
}
class MyOperationsNew{
	void doOperations(int a,int b){
		int c=a+b;
		if(c!=10) throw new InvalidResult();
		System.out.println("Result is ok i.e 10");
	}
}
class Exception2Demo{
	public static void main(String args[]){
		MyOperationsNew opl=new MyOperationsNew();
		opl.doOperations(2,4);	
	}
}
