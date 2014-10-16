package jichu.duixiang;

class Person{			// 定义Person类
	private String name ;	// 姓名
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	private int age ;		// 年龄
	private Book book ;		// 一个人有一本书
	public Person(String name,int age){
		this.setName(name) ;
		this.setAge(age) ;
	}
	
	public Book getBook(){
		return book ;
	}
};
class Book{				// 定义Book类
	private String title ;	// 标题
	private float price ;	// 价格
	private Person person ;	// 一本书属于一个人
	public Book(String title,float price){
		this.setTitle(title) ;
		this.setPrice(price) ;
	}
	public void setTitle(String t){
		title = t ;
	}
	public void setPrice(float p){
		price = p ;
	}
	public String getTitle(){
		return title ;
	}
	public float getPrice(){
		return price ;
	}
	public void setPerson(Person p){
		person = p ;
	}
	public Person getPerson(){
		return person ;
	}
};
public class RefDemo03{
	public static void main(String arg[]){
		Person per = new Person("张三",30) ;
		Book bk = new Book("JAVA SE核心开发",90.0f) ;
		per.setBook(bk) ;		// 设置两个对象间的关系，一个人有一本书
		bk.setPerson(per) ;		// 设置两个对象间的关系，一本书属于一个人
		System.out.println("从人找到书 --> 姓名：" + per.getName()+"；年龄：" 
			+ per.getAge() +"；书名：" + per.getBook().getTitle() + "；价格：" 
			+ per.getBook().getPrice()) ;	// 可以通过人找到书
		System.out.println("从书找到人 --> 书名：" + bk.getTitle() + "；价格："
			+ bk.getPrice() + "；姓名：" + bk.getPerson().getName() + "；年龄："
			+ bk.getPerson().getAge()) ;	// 也可以通过书找到其所有人
	}
};