
public class StringBufferBuilder {
         
	public static void main(String args[]) {
		
		String str = new String("Hello");
		System.out.println(str);
		
		StringBuffer strBuffer = new StringBuffer("Hi");
		strBuffer.append("Welcome!!!");
		
		System.out.println(strBuffer);
		
		StringBuilder strBuilder = new StringBuilder("Everyone");
		strBuilder.append(":)");
		
		System.out.println(strBuilder);
		
		StringBuilder strBuilder1 = new StringBuilder("Java");
		strBuilder1.insert(1,"@");
		
		System.out.println(strBuilder1);
		
		StringBuilder strBuilder2 = new StringBuilder("Welcome");
		strBuilder2.delete(1,3);
		
		System.out.println(strBuilder2);
		
		StringBuilder strBuilder3= new StringBuilder("Welcome");
		strBuilder3.reverse();
		
		System.out.println(strBuilder3);
		
		
	}
}
