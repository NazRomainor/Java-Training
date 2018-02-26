class TernaryOperator {

	public static void main(String[] args) {

	double number = 10.5;
	String result;

	result = (number > 0.0) ? "positive" : "negative";

	System.out.println(number + "is " + result);

//above ternaryoperator is the simpication of below ifelse

	if(number > 0.0) {

	System.out.println(number + "is positive");}
		
		else { System.out.println(number + "is negative");}
	
	}
}


