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
			int d1 = random.nextInt(0,10);
			int d2 = random.nextInt(0,10);
			int score=0;
			Fraction f1 = make(n1,d1);
			Fraction f2 = make(n2,d2);
			Fraction awnser = calc(f1,f2,operation);
			System.out.println(print(f1,f2,operation));
				
			
			imput = in.nextLine();
			Fraction guess = new Fraction(imput);
			if(check(awnser, guess)) {
				score++;
				System.out.println("Correct!");
			} else System.out.println("loud incorrect buzzer");
			
		}
	}
	
	public static Fraction make(int n, int d) {
		return new Fraction(n, d);
	} 
	public static boolean check(Fraction aws, Fraction guess){
		if(aws.getNum()==guess.getNum() && aws.getDen()==guess.getDen()) {
			return true;
		}
		return false;
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
		result+=f2.toString();
		return result;
	}
	
	public static Fraction calc(Fraction f1, Fraction f2, int op) {
		
		
		Fraction result= new Fraction(1, 1);
		if(op==0) {
			result= Fraction.add(f1, f2);
		}
		if(op==1) {
			result= Fraction.sub(f1, f2);
		}
		if(op==2) {
			result= Fraction.mult(f1, f2);
		}
		if(op==3) {
			result= Fraction.div(f1, f2);
		}
		result.reduce();
		return result;
	}
	
}



