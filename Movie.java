class Movie{
	String title;
	int rating;
	void setdata(String a,int b){
		title=a;
		rating=b;
	}
	void displaydata(){
		System.out.println("title:"+title);
		System.out.println("rating:"+rating);
	}
	void played(){
		System.out.println("movie is played");
	}
}
