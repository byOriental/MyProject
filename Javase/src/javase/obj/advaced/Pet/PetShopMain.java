package javase.obj.advaced.Pet;
/**
 * 
*@Title:PetShopMain
*@Description:面向对象综合（重点）
*@author:Administrator
*@date:2017年9月9日 下午2:55:39
 */
public class PetShopMain {

	public static void main(String[] args) {
		PetShop ps = new PetShop(5);
		ps.add(new Cat("白猫", "蓝色", 3));
		ps.add(new Cat("黑猫","黄色",5));
		ps.add(new Cat("黄猫","金色",1));
		ps.add(new Dog("黄狗", "黄色", 5));
		ps.add(new Dog("小黑", "黑色", 3));
		ps.add(new Dog("小绿", "白色", 5));
		print(ps.search("黑"));
		
	}
	public static void print(Pet p[]){
		for(int i=0;i<p.length ;i++){
			if(p[i]!=null){
				System.out.println(p[i].getName()+","+p[i].getColor()+","+p[i].getAge());
			}
		}
	}

}
