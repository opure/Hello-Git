package jichu.chouxiang;

interface USB{		// ������USB�ӿ�
	public void start() ;	// USB�豸��ʼ����
	public void stop() ;	// USB�豸��������
}
class Computer{
	public static void plugin(USB usb){	// �����Ͽ��Բ���USB�豸
		usb.start() ;
		System.out.println("=========== USB �豸���� ========") ;
		usb.stop() ;
	}
}
class Flash implements USB{
	public void start(){	// ��д����
		System.out.println("U�̿�ʼ������") ;
	}
	public void stop(){		// ��д����
		System.out.println("U��ֹͣ������") ;
	}
};
class Print implements USB{
	public void start(){	// ��д����
		System.out.println("��ӡ����ʼ������") ;
	}
	public void stop(){		// ��д����
		System.out.println("��ӡ��ֹͣ������") ;
	}
};
public class InterfaceDemo002{
	public static void main(String args[]){
		Computer.plugin(new Flash()) ;
		Computer.plugin(new Print()) ;
	}
};