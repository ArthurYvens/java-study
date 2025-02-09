import java.util.Scanner;
public class Split {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = "potato apple lemon orange";
		///Taking the s String and splitting it based on each " "
		String[] vect = s.split(" ");
		
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
	
		
	}
}
