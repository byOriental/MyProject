package javase.obj.basic;

/**
 * 
*@Title:MainArgs
*@Description:����������args��Ϊ����̨����Ĳ�������������ΪString
*@author:Administrator
*@date:2017��9��13�� ����10:19:22
 */
public class MainArgs {

	public static void main(String[] args) {
		if(args.length!=3){
			System.out.println("������������");
			System.exit(1);//ϵͳ�˳�
			
		}
		for(int i=0;i<args.length;i++){
			System.out.println("��"+(i+1)+"������Ϊ��"+args[i]);
		}
		
		// TODO Auto-generated method stub

	}

}
