package jichu.shuzu;

public class MethodDigui{
	public static void main(String args[]){
		System.out.println("��������" + sum(100)) ;	// ���ò���
	}
	public static int sum(int num){		// ���巽��������Ͳ���
		if(num==1){						// �ж��Ƿ��Ǽӵ������һ����
			return 1 ;
		}else{
			return num + sum(num-1) ;	// �ݹ����
		}
	}
};