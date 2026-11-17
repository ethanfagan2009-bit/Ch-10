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
	
	//behavior methods
	
}
