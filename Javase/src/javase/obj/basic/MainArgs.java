package javase.obj.basic;

/**
 * 
*@Title:MainArgs
*@Description:主方法参数args即为控制台输入的参数，参数类型为String
*@author:Administrator
*@date:2017年9月13日 上午10:19:22
 */
public class MainArgs {

	public static void main(String[] args) {
		if(args.length!=3){
			System.out.println("参数不足三个");
			System.exit(1);//系统退出
			
		}
		for(int i=0;i<args.length;i++){
			System.out.println("第"+(i+1)+"个参数为："+args[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
