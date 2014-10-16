package jichu.duixiang;

class Student{
	private String stuno ;
	private String name ;
	private float math ;
	private float english ;
	private float computer ;
    public Student(String s,String n,float m,float e,float c){
		this.setStuno(s) ;
		this.setName(n) ;
		this.setMath(m) ;
		this.setEnglish(e) ;
		this.setComputer(c) ;
	}
	
	public void setStuno(String s){
		stuno = s ;
	}
	public void setName(String n){
		name = n ;
	}
	public void setMath(float m){
		math = m ;
	}
	public void setEnglish(float e){
		english = e ;
	}
	public void setComputer(float c){
		computer = c ;
	}
	public String getStuno(){
		return stuno ;
	}
	public String getName(){
		return name ;
	}
	public float getMath(){
		return math ;
	}
	public float getEnglish(){
		return english ;
	}
	public float getComputer(){
		return computer ;
	}
	public float sum(){		// ��Ͳ���
		return  math + english + computer ;
	}
	public float avg(){		// ��ƽ��ֵ
		return this.sum() / 3 ;
	}
	public float max(){		// ����߳ɼ�
		float max = math ;	// ��ѧ����߳ɼ�
		max = max>computer?max:computer ;
		max = max>english?max:english ;
		return max ;
	}
	public float min(){		// ����ͳɼ�
		float min = math ;	// ��ѧ����߳ɼ�
		min = min<computer?min:computer ;
		min = min<english?min:english ;
		return min ;
	}
};
public class Student01{
	public static void main(String args[]){
		Student stu = null ;			// ��������
		stu = new Student("10000","С��",95.0f,89.0f,96.0f) ;
		System.out.println("ѧ����ţ�" + stu.getStuno()) ;
		System.out.println("ѧ��������" + stu.getName()) ;
		System.out.println("��ѧ�ɼ���" + stu.getMath()) ;
		System.out.println("Ӣ��ɼ���" + stu.getEnglish()) ;
		System.out.println("��߷֣�" + stu.max()) ;
		System.out.println("��ͷ֣�" + stu.min()) ;
	}
};