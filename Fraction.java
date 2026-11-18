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
		
	}
	
}
