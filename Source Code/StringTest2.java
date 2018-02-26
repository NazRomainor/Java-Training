class StringTest2 {

	public static void main(String[] args) {

		String x1 = "Japan";
		String x2 = "Japan";
		System.out.println(x1 == x2);

		String x3 = new String("Japan");
		System.out.println(x1 == x3);

		System.out.println(x1.equals(x2));

		String x4 = new String("China");
		System.out.println(x3.equals(x4));

	}
}