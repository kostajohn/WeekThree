
public class thursday {

	public static void main (String [] args) {

		double[] electricBills = {125.56, 307.89, 420.12, 70.89};
		System.out.println(calculateAverage(electricBills));
	System.out.println(doSomething("john"));
	
	}
	
	
	
	public static double calculateAverage (double [] array) {
		
		
		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		
		double average = sum / array.length;
		return average;
	}
	
	public static String doSomething(String word) {
		return "hello" + word;
	}
	
}
