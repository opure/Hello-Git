package jichu.duixiang;

class Node{		// 定义节点类
	private String data ;	// 保存节点内容
	private Node next ;		// 表示保存下一个节点
	public Node(String data){		// 通过构造设置节点内容
		this.data = data ;	// 设置内容
	}
	public void setNext(Node next){
		this.next = next ;		// 设置下一个节点
	}
	public Node getNext(){
		return this.next;	// 取得下一个节点
	
	}
	public String getData(){
		return this.data ;	// 取得节点的内容
	}
};
public class LinkeDemo01{
	public static void main(String args[]){
		Node root = new Node("火车头") ;  // 定义根节点
		Node n1 = new Node("车厢-A") ;	// 定义第一个车厢（第一个节点）
		Node n2 = new Node("车厢-B") ;	// 定义第二个车厢（第二个节点）
		Node n3 = new Node("车厢-C") ;	// 定义第三个车厢（第三个节点）
		root.setNext(n1) ;			// 设置火车头的下一个节点是第一个车厢A
		n1.setNext(n2) ;			// 设置第一个车厢的下一个节点是第二个车厢
		n2.setNext(n3) ;			// 设置第二个车厢的下一个节点是第三个车厢
		printNode(root) ;			// 从头开始输出
	}
	public static void printNode(Node node){	// 输出节点
		System.out.print(node.getData() + "\t") ;	// 输出节点的内容
		if(node.getNext()!=null){		// 判断此节点是否存在下一个节点
			printNode(node.getNext()) ;	// 向下继续输出
		}
	}
};