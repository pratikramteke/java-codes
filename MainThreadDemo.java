class MainThreadDemo{
	public static void main(String args[]){
		try{
			Thread t=Thread.currentThread();
			for(int i=0;i<5;i++){
				System.out.println("Iteratio NO"+i);
				t.sleep(2000);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
