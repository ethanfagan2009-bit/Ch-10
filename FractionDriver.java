public class FractionDriver {
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction("100/100");
		Fraction f2 = new Fraction(1, 2);
		Fraction f3 = new Fraction(2, 3);
		Fraction f4 = Fraction.sub(f2,f3);
		Fraction f5 = new Fraction(9653, 197);
		f5.reduce();
		//f4.reduce();
		//System.out.println(f1.getNum()+ "/" + f1.getDen());
		//System.out.println(f2.getNum()+ "/" + f2.getDen());
		//System.out.println(f3.getNum()+ "/" + f3.getDen());
		//System.out.println(f2.toString());
		//System.out.println(f2.toDouble());
		System.out.println(f4);
		
	}
	
}
