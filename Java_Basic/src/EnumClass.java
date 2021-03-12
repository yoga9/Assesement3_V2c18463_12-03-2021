
public class EnumClass {              //Unchangeable

	   enum Grades{
		   First, Second, Third;
		
	   }
	   
	   public static void main(String args[]) {
		   
		   Grades obj = Grades.Second;
		   System.out.println(obj);
		   
   System.out.println();   
	   
	   
	   for(Grades obj1 : Grades.values()) {
		   System.out.println(obj1);
	   }
}
	   
}
