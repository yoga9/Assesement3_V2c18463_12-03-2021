
public class WrapperClass {

	  public static void main(String args[]) {
		  
		int a = 5;
		Integer b = Integer.valueOf(a);    //autoboxing (primitive to obj)
		Integer c=a;
		
		System.out.println(a+ " " +b+ " " +c);
		  
	    Character a1 = new Character('K');     //Unboxing (obj to primitive)
	    char i = a1.charValue();
	    char j = a1;
	    
	    System.out.println(a1+ " " +i+ " " +j);
		  
	  }
}
