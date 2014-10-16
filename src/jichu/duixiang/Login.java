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
			   str="欢迎"+name+"光临";
		   }
		   else{
			   str="登陆密码"+password+"错误";
			   
		   }
		   return str;
	   }
	   public void isExit(){
		if(this.info.length!=2){
			System.out.println("输入的格式不正确");
			System.out.print("格式如下");
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
