class MovieTestDrive{
	public static void main(String args[]){
		Movie ddlj=new Movie();
		ddlj.setdata("ddlj",5);
		ddlj.displaydata();
		ddlj.played();
		Movie gb=new Movie();
		gb.setdata("gully boy",7);
		gb.displaydata();
		gb.played();
		Movie uri=new Movie();
		uri.setdata("uri",9);
		uri.displaydata();
		uri.played();
	}
}
