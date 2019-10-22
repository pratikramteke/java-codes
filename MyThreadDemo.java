class MyThread extends Thread{
	public void run(){
		Thread t=Thread.currentThread();
		try{
			for(int i=1;i<5;i++){
				System.out.println("Iteration "+i+" of "+t.getName());
				sleep(500);
			}
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
class MyThreadDemo{
        public static void main(String args[]){
                System.out.println("Main starts");
                MyThread mt=new MyThread();
                mt.setName("My First Thread");
                mt.start();
		try{
                        for(int i=1;i<5;i++){
                                System.out.println("Replay from "+Thread.currentThread().getName());
				Thread.currentThread().sleep(1000);
			}
		}
		catch(Exception e){

		}
	}
}

