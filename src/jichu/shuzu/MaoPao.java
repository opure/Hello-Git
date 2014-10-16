package jichu.shuzu;

public class MaoPao{

	public void sort(int[] n) {
		for(int i=0;i<n.length-1;i++) {
			for(int j=0;j<n.length-i-1;j++) {
				if(n[j]>n[j+1]) {
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
			print(n);
		}
	}
	
	public void print(int[] n) {
		for(int i=0;i<n.length;i++)
			System.out.print(n[i] + "\t");
		System.out.println();
	}
	
	public static void main(String[] args) {
		MaoPao s = new MaoPao();
		int[] n = {100,60,80,90,75,38};
		s.sort(n);
		s.print(n);
	}
}                 
