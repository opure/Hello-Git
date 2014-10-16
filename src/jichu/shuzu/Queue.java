package jichu.shuzu;

public class Queue {
	int [] queue_array=new int[5];
	int value;
	int length;
	public void add(){
		if(length==queue_array.length){
			int[] new_array=new int[queue_array.length+1];
			System.arraycopy(queue_array, 0, new_array, 0,
					queue_array.length);
		    queue_array=new_array;
		}
		queue_array[length++]=++value;
	    
	}
	public void del(){
		int[] new_array=new int[queue_array.length-1];
		System.arraycopy(queue_array, 1, new_array, 0,
				queue_array.length-1);
	    queue_array=new_array;
		length--;
	}
	public void show(){
		for(int a:queue_array){
		System.out.println(a);
		}
	}
public static void main(String args[]){
	Queue q=new Queue();
	q.add();
	q.add();
	q.del();
	q.show();
}
}
