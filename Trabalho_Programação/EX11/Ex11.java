public class Ex11 {

	public static void main(String[] args){ 
		
		int totalPar = 0;
		int totalImpar = 0;

		for (int i = 0; i <= 30; i++) {
			
			if (i % 2 == 0) {
						
				if (totalPar == 0) {
					totalPar = i;	
				} else {
					totalPar = totalPar*i;
				}

			} else {
				totalImpar += i;
			}
		}

		System.out.println(totalPar);
		System.out.println(totalImpar);
	}
}