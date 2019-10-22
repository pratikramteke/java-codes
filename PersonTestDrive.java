class PersonTestDrive{
	public static void main(String args[]){
		Person p1=new Person();
		p1.name="pratik";
		p1.age=20;
		p1.gender="male";
		System.out.println(p1.name);
		p1.talk();
		p1.walk();
	}
}
