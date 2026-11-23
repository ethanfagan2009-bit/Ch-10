public class Fraction {
	//instance variables (atributes, fields) information that object need to keep track of
	private int numor, denom;
	
	//constructor 
	public Fraction() {//defult
		numor=1;
		denom=1;
		
	}
	
	public Fraction(int n, int d) {//peramiterized constructor
		numor = n;
		if(d!=0) 
			denom = d;
		else {
			denom=1;
			System.out.println("Error: 0 can not be denominator");
		}
		
	}
	
	public Fraction(String str) {
		numor= Integer.parseInt(str.substring(0, str.indexOf("/")));
		
		denom= Integer.parseInt(str.substring(str.indexOf("/")+1, str.length()));
		if(denom==0) {
			denom=1;
			System.out.println("Error: 0 can not be denominator");
		}
		
	}
	
	public Fraction(Fraction frac) {
		numor=frac.numor;
		if(frac.denom!=0) 
			denom = frac.denom;
		else {
			denom=1;
			System.out.println("Error: 0 can not be denominator");
		}
	}
	
	//behavior methods (accessor, mutator, helper)
	public int getNum() {
		return numor;
	}
	public int getDen() {
		return denom;
	}
	public String toString() {
		String result="";
		result= Integer.toString(numor) + "/" + Integer.toString(denom);
		return result;
	}
	public double toDouble() {
		return (double) numor/denom;
	}
	/////////////////////////////////////////////////////////////////////////////// mutators
	public void setNum(int n) {
		numor=n;
	}
	
	public void setDen(int d) {
		if(d!=0) 
			denom = d;
		else {
			denom=1;
			System.out.println("Error: 0 can not be denominator");
		}
	}
	
	public void reduce() {
		int n=numor;
		int d=denom;
		while(n!=d) {
			if(n>d) n-=d;
			if(n<d) d-=n;
			if(d<=0 || n<=0) {
				n=d;
			}
		}
		if(n>0 && d>0) {
			numor/=n;
			denom/=d;
		} else System.out.println("Error: no gcf");
	}
	
	public static Fraction mult(Fraction a, Fraction b) {
		int n=a.getNum()*b.getNum();
		int d=a.getDen()*b.getDen();
		Fraction answer = new Fraction(n,d);
		answer.reduce();
		return answer;
	}
	public static Fraction div(Fraction a, Fraction b) {
		int n=a.getNum()*b.getDen();
		int d=a.getDen()*b.getNum();
		Fraction answer = new Fraction(n,d);
		answer.reduce();
		return answer;
	}
	public static Fraction add(Fraction a, Fraction b) {
		int n1=a.getNum()*b.getDen();
		int d=a.getDen()*b.getDen();
		int n2=b.getNum()*a.getDen();
		//Fraction answer = Fraction((n1+n2),d);
		//answer.reduce();
		//return answer;
		return new Fraction((n1+n2),d);
	}
	
	public static Fraction sub(Fraction a, Fraction b) {
		int n1=a.getNum()*b.getDen();
		int d=a.getDen()*b.getDen();
		int n2=b.getNum()*a.getDen();
		//Fraction answer = Fraction((n1-n2),d);
		//answer.reduce();
		//return answer;
		return new Fraction((n1-n2),d);
	}
	
}
