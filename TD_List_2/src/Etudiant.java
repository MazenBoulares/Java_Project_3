public class Etudiant {
    private int id;
    private String nom;
    private String prenom;


    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public static boolean equals(Object e1, Object e2) {
        if ((e1 instanceof Etudiant) && (e2 instanceof Etudiant))
            return ((Etudiant) e1).getId() == ((Etudiant) e2).getId();
        else
            return false;
    }


    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
