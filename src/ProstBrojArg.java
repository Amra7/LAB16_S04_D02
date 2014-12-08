public class ProstBrojArg {
	public static void main(String[] args) {
		
		try {
			if (args.length != 0) {
				if (prostBroj(Integer.parseInt(args [0]))&& (Integer.parseInt(args [0])) != 0) {
					System.out.println("Ovaj broj je prost!");
				} else {
					System.out.println("Ovaj broj nije prost!");
				}

			}

		} catch (NegativeArraySizeException e) {
			System.out.println("Pogresno! ");
		}
		
		int broj=0;
		do {
			System.out.println("Unesi broj: ");
			broj= TextIO.getInt();
			if ( prostBroj(broj)) {
				System.out.println("Ovaj broj je prost!");
			} else if ( !prostBroj(broj)){
				System.out.println("Ovaj broj nije prost!");
			}
			
			
		}while ( broj != 0);
	}

	public static boolean prostBroj(int broj) {
		boolean prost = true;
		for (int i = 2; i < broj; i++) {
			if (broj % i == 0) {
				return false;
			}
		}
		return prost;
	}
	// public static boolean prostBrojString(String [] args) {
	// boolean prost = false;

	// for (int i = 0; i < args.length; i++) {
	// int brojString = Integer.parseInt(args[i]);
	// for (int j = 2; j < brojString; j++) {
	// if (brojString % j == 0) {
	// return true;
	// }
	// }
	//
	// }
	// return prost;
	// }

}
