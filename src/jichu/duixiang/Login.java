package jichu.duixiang;
 class Check{
	 public boolean validatge(String name,String password){
		 if(name.equals("caohao")&&password.equals("caohao")){
			 
return true;
		 }
		 else{
			 return false;
		 }
	 }
 }
class Operate{
	   private String info[];
	   public Operate(String info[]){
		   this.info=info;
	   }
	   public String login2(){
		   Check check=new Check();
		   this.isExit();
		   String str=null;
		   String name=this.info[0];
		   String password=this.info[1];
		   if(check.validatge(name, password)){
			   str="��ӭ"+name+"����";
		   }
		   else{
			   str="��½����"+password+"����";
			   
		   }
		   return str;
	   }
	   public void isExit(){
		if(this.info.length!=2){
			System.out.println("����ĸ�ʽ����ȷ");
			System.out.print("��ʽ����");
			System.exit(1);
		}   
		   
	   }
	
}
public class Login {


	public static void main(String[] args) {
		Operate a=new Operate(args);
		System.out.println(a.login2());
		

	}

}
