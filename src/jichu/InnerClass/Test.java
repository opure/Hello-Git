package jichu.InnerClass;


//4) ����ͨ������������ֱ�ӷ��ʾ�̬�ڲ���ľ�̬��Ա��
class A {
      public static class B {
             int v1;                       //ʵ������
             static int v2;                //��̬����

             public static class C {
                    static int v3;         //��̬�ڲ���
                    int v4;
             }
      }
}

public class Test {
      public void test() {
             A.B b = new A.B();
             A.B.C c = new A.B.C();
             b.v1 = 1;
        
                 //�������
             A.B.v2 = 1;             //�Ϸ�
             A.B.C.v3 = 1;           //�Ϸ�
      }
}
