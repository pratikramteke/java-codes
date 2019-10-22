class MyThread2 implements Runnable{
	  public void run(){
                Thread t=Thread.currentThread();
                try{
                        for(int i=1;i<5;i++){
                                System.out.println("Iteration "+i+" of "+t.getName());
                                t.sleep(500);
                        }
                }
                catch(InterruptedException e){
                        e.printStackTrace();
                }
        }

}
class MyThreadDemo2{
	public static void main(String args[]){
		MyThread2 mt=new MyThread2();
		Thread t=new Thread(mt,"My New Thread");
		try{
			for(int i=1;i<5;i++){
				System.out.println("Replay from "+Thread.currentThread().getName());
				Thread.currentThread().sleep(1000);
			}
		}
		catch(Exception e){

		}
		t.start();
	}
}
