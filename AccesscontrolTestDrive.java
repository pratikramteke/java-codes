class AccesscontrolTestDrive{
	public static void main(String args[]){
		Accesscontrol ac=new Accesscontrol();
		ac.a=10;
		ac.b=5;
		//ac.c=15;
		//System.out.println("a b and c"+ac.a+" "+ac.b+" "+ac.c);
		ac.setc(15);
		System.out.println("a b and c"+ac.a+" "+ac.b+" "+ac.getc());
	}
}
