package javase.thread.prdcsm;

class Producer implements Runnable{
	private Info info=null;//������࣬�����ͨ��
	public Producer(Info info){
		this.info=info;
	}
	public void run(){
		boolean flag=false;
		for(int i=0;i<10;i++){
			if(flag){
				this.info.set("����", "�й������Ļ�����");	
				flag=false;
			}else{
				this.info.set("�Ϻ�", "�й������Ļ�����");
				flag=true;
			}
		}
	}
}
