
public class Personne {
	private String Nom;
	private String Prenom;
	
	public Personne (String Nom, String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	
	public String getNom() {
		return Nom;
	}
	
	public String getPrenom() {
		return Prenom;
	}
	
	public String toString() {
        return "[nom = " + Nom + ", prenom = " + Prenom + "]";
    }
}