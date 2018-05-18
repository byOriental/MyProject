package javase.obj.advaced.Pet;

/**
 * 
*@Title:PetShop
*@Description: 
*@author:Administrator
*@date:2017年9月9日 下午1:50:16
 */
class PetShop {
	private Pet[] pets;//通过声明Pet去与接口沟通
	private int foot;
	
	public PetShop(int len){    //通过实例化开辟宠物存储空间（数组）
		if(len>0){
			this.pets=new Pet[len];
		}else{
			this.pets=new Pet[1];
		}
	}
	public boolean add(Pet pet){
		if(this.foot<this.pets.length){//因为有不断添加进来的宠物，所以必须对其空间进行判断
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
					count++;//确定能匹配的数量
				}
			}
		}
		p=new Pet[count];//开辟真正所需空间，作为新地址返回，因为匹配的可能是不连续的空间地址。
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
