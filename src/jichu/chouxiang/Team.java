package jichu.chouxiang;

public class Team {
             StudentTest[] tm=new StudentTest[100];
             int count;
             public void addStudentTest(StudentTest s){
            	 tm[count++]=s;
             }
             public StudentTest getMaxOrMin(Comparator c){
            	 StudentTest s=tm[0];
            	 for (int i=0;i<count;i++){
            		 if(c.compare(s,tm[i])<0){
            			 s=tm[i];
            		 }
            	 }
            	 return s;
            	 
            	 
             }
}
