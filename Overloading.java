class Overloading{
	int ln,br;
	void calculate(int l,int b){
		ln=l;
		br=b;
		int ar=ln*br;
		System.out.println("area:"+ar);
	}
	void calculate(int lnb){
		ln=br=lnb;
		int ar2=ln*br;
		System.out.println("area:"+ar2);
	}
}
