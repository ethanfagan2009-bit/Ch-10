import java.util.Random;
import java.util.Scanner;
public class FractionQuiz {
	
	
	public static void main(String[] args) {
		Random random = new Random();
		boolean playing=true;
		Scanner in= new Scanner(System.in);
		
		String imput = "";
		while(imput!="Quit") {
			int operation= random.nextInt(5);
			int n1 = random.nextInt(10);
			int n2 = random.nextInt(10);
			int d1 = random.nextInt(10);
			int d2 = random.nextInt(10);
			Fraction f1 = make(n1,d1);
			Fraction f2 = make(n2,d2);
			System.out.println();
				
			
			imput = in.nextLine();
		}
	}
	
	public static Fraction make(int n, int d) {
		return new Fraction(n, d);
	} 
	
	public static String print(Fraction f1, Fraction f2, int op) {
		String result="";
		result+=f1.toString();
		result+=" ";
		if(op==0) result+="+";
		if(op==1) result+="-";
		if(op==2) result+="*";
		if(op==3) result+="/";
		result+=" ";
		return result;
	}
	
}



