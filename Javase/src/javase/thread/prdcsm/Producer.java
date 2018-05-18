package javase.thread.prdcsm;

class Producer implements Runnable{
	private Info info=null;//加入基类，子类的通信
	public Producer(Info info){
		this.info=info;
	}
	public void run(){
		boolean flag=false;
		for(int i=0;i<10;i++){
			if(flag){
				this.info.set("北京", "中国政治文化中心");	
				flag=false;
			}else{
				this.info.set("上海", "中国经济文化中心");
				flag=true;
			}
		}
	}
}
