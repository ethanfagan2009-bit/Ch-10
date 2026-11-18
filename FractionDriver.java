public class FractionDriver {
	
	public static void main(String[] args) {
		Fraction f1 = new Fraction("100/100");
		Fraction f2 = new Fraction(1, 2);
		Fraction f3 = new Fraction(f2);
		
		//System.out.println(f1.getNum()+ "/" + f1.getDen());
		System.out.println(f2.getNum()+ "/" + f2.getDen());
		//System.out.println(f3.getNum()+ "/" + f3.getDen());
		System.out.println(f2.toString());
		System.out.println(f2.toDouble());
	}
	
}
