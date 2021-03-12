import java.util.Scanner;

public class CalcBuffer {
	
	public static void main(String args[]) {
		
	
		String str = "Programming";
		StringBuffer s = new StringBuffer("Java");
		
		Scanner n = new Scanner(System.in);
		
		System.out.println(" Enter the value:");
		int value = n.nextInt();
		
		switch(value) {
		
		
		case 1:
			
		StringBuffer s2 = new StringBuffer(str.concat(" Simple"));
		System.out.println(s2);
		break;
		
		case 2:
		StringBuffer s3 = new StringBuffer(s.reverse());
		System.out.println(s3);
		break;
		
		default:
			System.out.println("Invalid value");
			
		}
		
		
		
}

}
