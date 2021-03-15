

/**
 *
 * @author tactfactory
 *
 *         - Le programme doit utiliser un design pattern "Observer" afin
 *         d'avoir les elements suivant : 
 *         - 1 : Un Subject sera observe par 3
 *         observer 
 *         - 2 : Le Subject possedera un state de type int 
 *         - 3 : Lors
 *         de la modification du state du Subject les observers attaches seront
 *         appele avec : 
 *         - 1 : Un observer affichera l'entier en hexadecimal - 2
 *         : Un observer affichera l'entier en octal - 3 : Un observer affichera
 *         l'entier en binaire - 3 : Le lancement de l'application doit afficher
 *         les elements suivant :
 *
 *         First state change: 15 Hex String: F Octal String: 17 Binary String:
 *         1111 Second state change: 10 Hex String: A Octal String: 12 Binary
 *         String: 1010
 */
public class ObserverTp1 {
	public static void main(String[] args) {

		SubjectObservable s = new Subject(1);
		s.attach(new ObserverBin());
		s.attach(new ObserverHex());
		s.attach(new ObserverOct());
		
		s.notifyObservers();
		
		
		
		
		
	}
}
