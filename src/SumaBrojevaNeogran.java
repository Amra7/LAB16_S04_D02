public class SumaBrojevaNeogran {
	public static void main(String[] args) {
	
	int suma =0;
	
	
  try {
		if ( args.length !=0) {
			
			if ( Integer.parseInt(args[0]) !=0) {
				suma = suma + Integer.parseInt(args[0]);
			}
		} 
		
			
		} catch (NumberFormatException e) {
			System.out.println("Greska! Unesi drugu vrijednost!");
		}
	 
 
	
	System.out.println("Suma brojeva je : " + suma);
}
}
