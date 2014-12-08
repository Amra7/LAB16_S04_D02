
public class TextIO_ImeIGodine {
public static void main(String[] args) {
	
	TextIO.readUserSelectedFile();
	while (TextIO.eof()!= true) {
		String ime = TextIO.getlnWord();
		System.out.println("Vase ime je:" + ime);
		
		String godine =TextIO.getlnWord();
		int god = Integer.parseInt(godine);
		
		if ( god >= 18) {
			System.out.println("Nista posebno!");
		} else {
			System.out.println("Nemas dovoljno godina!");
		}
	}
	
	
	
}
}
