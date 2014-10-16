package jichu.InnerClass;


//4) 可以通过完整的类名直接访问静态内部类的静态成员。
class A {
      public static class B {
             int v1;                       //实例变量
             static int v2;                //静态变量

             public static class C {
                    static int v3;         //静态内部类
                    int v4;
             }
      }
}

public class Test {
      public void test() {
             A.B b = new A.B();
             A.B.C c = new A.B.C();
             b.v1 = 1;
        
                 //编译错误
             A.B.v2 = 1;             //合法
             A.B.C.v3 = 1;           //合法
      }
}
