public class Predavanje_Z03 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Dodajte argumente u program!");
		} else {
//			for (int i = 0; i < args.length; i++) {
//				String arg = args[i];
//				System.out.println(arg);
//			}
			int suma =0;
			for (String arg : args) {
				try {
					suma = suma+ Integer.parseInt(arg);
				} catch (NumberFormatException e){
					System.out.printf("Vrijednost %s nije ispravan broj. Preskacem!", arg);
				}			
			}
			System.out.printf("%nSuma argumenata je: %d ",suma);
		}
		
		

	}
}
