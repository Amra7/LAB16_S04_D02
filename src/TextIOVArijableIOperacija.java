public class TextIOVArijableIOperacija {
	public static void main(String[] args) {
	int broj1=0,broj2=0;
		
	if (args.length !=0) {
		broj1 = TextIO.getInt();
		broj2 = TextIO.getInt();
		
		broj1 = Integer.parseInt(args[0]);
		broj2 = Integer.parseInt(args[1]);
	}
	
	char funkcija = TextIO.getAnyChar();
	char sabiranje = '+';
	char oduzimanje = '-';
	char mnozenje= '*';
	char dijeljenje = '/';
	char modul = '%';
	char stepenovanje  =  '^';
	
	if ( funkcija==sabiranje ) {
		int sab = broj1 + broj2;
		System.out.println("Sabiranje brojeva je: " + sab);
	}
	
	if ( funkcija==oduzimanje ) {
		int odu = broj1 - broj2;
		System.out.println("raylika brojeva je: " + odu);
	}
	
	if ( funkcija==mnozenje ) {
		int mno = broj1 * broj2;
		System.out.println("Mnozenje dva broja je: " + mno);
	}
	
	if ( funkcija==dijeljenje ) {
		double dijel = broj1 / broj2;
		System.out.println("Dijeljenje brojeva je " + dijel);
	}
	
	if ( funkcija==modul ) {
		double mod = broj1 % broj2;
		System.out.println("Modul broja je: " + mod);
	}
	
	if ( funkcija==stepenovanje ) {
		int step = (int) Math.pow(broj1,broj2);
		System.out.println("Stepenovanje brojeva je: " + step);
	}
	
}


	}

