class Myoperations{
	void a1(){
		System.out.println("replay from a1");
		a2();
	}
	void a2(){
		System.out.println("replay from a2");
		a3();
	}
	void a3(){
		System.out.println("replay from a3");
		a4();
	}
	void a4(){
		System.out.println("replay from a4");
		try{
			a5();
		}
		catch(Exception e){
			System.out.println("replay from a4 for exception");
		}
	}
	void a5() throws Exception{
		System.out.println("replay from a5");
		int a=10,b=0,c=1;
		c=a/b;
		System.out.println("Result:"+c);
	}
}
public class ExceptionThrowsDemo{
	public static void main(String args[]){
	Myoperations mo=new Myoperations();
	System.out.println("Inside Main");
	mo.a1();
	System.out.println("Main Ends");
	}
}
