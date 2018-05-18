package javase.thread.prdcsm;


class Consumer implements Runnable{
	private Info info=null;
	public Consumer(Info info){
		this.info=info;
	}
	public void run(){
		for(int i=0;i<10;i++){
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			this.info.get();
		}
		
	}
}
