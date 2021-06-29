
public class Main {

	public static void main(String[] args) {
		
		int [] numbers = {1, 2, 3, 4, 5, 6} ;
		double harmo = 0.0 ;
		double sum = 0.0 ;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += (1/ numbers [i]) ;
	       }
		harmo = (numbers.length / sum) ;
		System.out.println(harmo);
	}

}
