public class TextIO_PodaciOOsobi {
	public static void main(String[] args) {

		TextIO.writeFile("profil.txt");

		TextIO.putln("U ovaj file cu unijeti sve podatke o jednoj osobi!");

		TextIO.putln("Kako se zoves?");
		String ime = TextIO.getlnString();
		TextIO.putln("Ime :" + ime);
		
		TextIO.putln ("Kako se prezivas?");
		String prezime = TextIO.getlnString();
		TextIO.put("Prezime: " + prezime);
		
		TextIO.putln ("Koliko godina imas?");
		String godine = TextIO.getlnString();
		TextIO.put("Godine: " + godine);
		
		TextIO.putln ("Gdje si rodjen?");
		String mjesto = TextIO.getlnString();
		TextIO.put("Mjesto rodjenja: " + mjesto);
		
		TextIO.putln ("Tvoja email adresa? ");
		String email = TextIO.getlnString();
		TextIO.put("Email adresa: " + email);
		
		TextIO.putln ("Tvoji hobiji?");
		String hobi = TextIO.getlnString();
		TextIO.put("Godine: " + hobi);




	}
}
