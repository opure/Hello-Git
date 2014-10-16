package jichu.duixiang;

class Node{		// ����ڵ���
	private String data ;	// ����ڵ�����
	private Node next ;		// ��ʾ������һ���ڵ�
	public Node(String data){		// ͨ���������ýڵ�����
		this.data = data ;	// ��������
	}
	public void setNext(Node next){
		this.next = next ;		// ������һ���ڵ�
	}
	public Node getNext(){
		return this.next;	// ȡ����һ���ڵ�
	
	}
	public String getData(){
		return this.data ;	// ȡ�ýڵ������
	}
};
public class LinkeDemo01{
	public static void main(String args[]){
		Node root = new Node("��ͷ") ;  // ������ڵ�
		Node n1 = new Node("����-A") ;	// �����һ�����ᣨ��һ���ڵ㣩
		Node n2 = new Node("����-B") ;	// ����ڶ������ᣨ�ڶ����ڵ㣩
		Node n3 = new Node("����-C") ;	// ������������ᣨ�������ڵ㣩
		root.setNext(n1) ;			// ���û�ͷ����һ���ڵ��ǵ�һ������A
		n1.setNext(n2) ;			// ���õ�һ���������һ���ڵ��ǵڶ�������
		n2.setNext(n3) ;			// ���õڶ����������һ���ڵ��ǵ���������
		printNode(root) ;			// ��ͷ��ʼ���
	}
	public static void printNode(Node node){	// ����ڵ�
		System.out.print(node.getData() + "\t") ;	// ����ڵ������
		if(node.getNext()!=null){		// �жϴ˽ڵ��Ƿ������һ���ڵ�
			printNode(node.getNext()) ;	// ���¼������
		}
	}
};