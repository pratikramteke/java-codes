class Circle{
	int radius;
	void setradius(int r){
		radius=r;
	}
	void area(){
		double area=3.14*radius*radius;
		System.out.println("area:"+area);
	}
	void circumference(){
		double circumference=2*3.14*radius;
		System.out.println("circumference:"+circumference);
	}
}
