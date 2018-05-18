package javase.obj.advaced.Pet;

/**
 * 
*@Title:PetShop
*@Description: 
*@author:Administrator
*@date:2017��9��9�� ����1:50:16
 */
class PetShop {
	private Pet[] pets;//ͨ������Petȥ��ӿڹ�ͨ
	private int foot;
	
	public PetShop(int len){    //ͨ��ʵ�������ٳ���洢�ռ䣨���飩
		if(len>0){
			this.pets=new Pet[len];
		}else{
			this.pets=new Pet[1];
		}
	}
	public boolean add(Pet pet){
		if(this.foot<this.pets.length){//��Ϊ�в�����ӽ����ĳ�����Ա������ռ�����ж�
			this.pets[this.foot]=pet;
			this.foot++;
			return true;  
		}else {
			return false;
		}
		
	}
	
	public Pet[] search(String keyword){
		Pet p[]=null;
		int count=0;
		for(int i=0;i<pets.length;i++){
			if(pets[i]!=null){
				if(this.pets[i].getName().indexOf(keyword) !=-1 ||
						this.pets[i].getColor().indexOf(keyword)!=-1){
					count++;//ȷ����ƥ�������
				}
			}
		}
		p=new Pet[count];//������������ռ䣬��Ϊ�µ�ַ���أ���Ϊƥ��Ŀ����ǲ������Ŀռ��ַ��
		int f=0;
		for(int i=0;i<pets.length;i++){
			if(pets[i]!=null){
				if(this.pets[i].getName().indexOf(keyword) !=-1 ||
						this.pets[i].getColor().indexOf(keyword)!=-1){
					p[f]=this.pets[i];
					f++;
				}
			}
		}
		return p;
		
	}

}
