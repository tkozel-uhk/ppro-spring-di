package lifecycle;

/**
 * Trida s inicializacni a ukoncovaci metodou.
 * Vyvolani metod bude realizovano pomoci atributu
 * init-method a destroy-metod XML definice
 * @author Tomas Kozel
 *
 */
public class InitDestroyMethodBean {
	
	public void inicializace() {
		System.out.println("IDMethod: Jsem v metode 'inicializace()'");
	}
	
	public void ruseni() {
		System.out.println("IDMethod: Jsem v metode 'ruseni()'");
	}
	
	public void pracuj() {
		System.out.println("IDMethod: Pracuji");
	}
}
