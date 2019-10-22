class Constover{
	int ln,br;
	Constover(int l,int b){
		ln=l;
		br=b;
		int ar1=ln*br;
		System.out.println("Area:"+ar1);
	}
	Constover(){
		ln=5;
		br=6;
		int ar2=ln*br;
		System.out.println("Area:"+ar2);
	}
	Constover(int lbn){
		ln=br=lbn;
		int ar3=ln*br;
		System.out.println("Area:"+ar3);
	}
}
		
