class AppendStringBuilder2 {

	public static void main(String args[]) {

		StringBuilder sb1 = new StringBuilder();

		sb1.append("Java");
		sb1.append(new Person1("Oracle"));
		System.out.println(sb1);
	}
}

class Person1 {

	String name;
	
	Person1(String str) { name = str; }
}