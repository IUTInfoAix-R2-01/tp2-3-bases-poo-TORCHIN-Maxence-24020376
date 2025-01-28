public class TestPersonne {
    public static void main(String[] args) {
        Personne p1 = new Personne("Agostinelli", "Laurence");
        System.out.println(p1);

        Personne p2 = new Personne("Torchin", "Maxence");
        System.out.println(p2);

        System.out.println("Nom : " + p1.getNom());
        System.out.println("Prénom : " + p1.getPrenom());

        System.out.println("Nom : " + p2.getNom());
        System.out.println("Prénom : " + p2.getPrenom());
    }
}
