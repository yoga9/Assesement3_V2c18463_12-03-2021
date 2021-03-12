
public class NestedClass {
 
	     public static void main(String args[]) {
	    	 
	    	 Outer obj = new Outer();
	    	 Outer.Inner obj1 = obj.new Inner();
	    	 
	    	 System.out.println(obj1.b + obj.a);
	    	 
	    	 System.out.println(obj1.display());
	    	 
	    	 
	    	 
	     }
	     
}
	   
	     class Outer{
	    	 
	    	 int a = 5;
	     
	         class Inner{
	        	 
	        	 int b = 5;
	        	 
	        	 public int display() {     //It's accessed
	        		 return a;
	        	 }
	         }
 }
	     
     
