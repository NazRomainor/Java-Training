class ArrayTest {

	public static void main(String [] args) {

		String asiaNation[] = {"China","Malaysia","Thailand","Vietnam","Myanmar","Indonesia","Singapore","India","Korea"};
		//asiaNation = new String[2][];

		/*for(String x : asiaNation) {

			System.out.println(x); }*/

		int intArray[][];
		intArray = new int[4][4];
		
		for(int i=0; i < intArray.length; i++) { 
			for(int j=0; j < intArray[i].length; j++) {
			intArray[i][j] = i + j;
			System.out.print(intArray[i][j]); 
			} 

			System.out.print("\n");
		}

		int x[] = {1, 2, 3, 4};
		System.out.print(x[-10]);
	}
}