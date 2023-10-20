import java.util.ArrayList;

public class EspritArraylist implements University {

public ArrayList<Etudiant> l= new ArrayList<Etudiant>();
     public void ajouterEtudiant(Etudiant e){
        l.add(e); };
    public boolean rechercherEtudiant(Etudiant e){

        System.out.println(l.contains(e));
        return l.contains(e);
    };
    public boolean rechercherEtudiant(String nom){

        return true;
    };
    public void supprimerEtudiant(Etudiant e){};
    public void displayEtudiants(){};
    public void trierEtudiantsParId(){};
    public void trierEtudiantsParNom(){};
}
