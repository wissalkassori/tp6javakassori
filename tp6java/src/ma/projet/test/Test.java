package ma.projet.test;
import ma.projet.bean.Profil;
import ma.projet.bean.Utilisateur;
import ma.projet.impl.ProfilesImpl;
import ma.projet.impl.UtilisateurImpl;

public class Test {
    public static void main(String[] args) {
        ProfilesImpl profileManager = new ProfilesImpl();
        UtilisateurImpl utilisateurManager = new UtilisateurImpl();

        Profil cp = new Profil(1, "Chef de projet");
        Profil mn = new Profil(2, "Manager");
        profileManager.create(cp);
        profileManager.create(mn);

        Utilisateur u1 = new Utilisateur(1, "Ali", "Ahmed", "0612345698", "ali@gmail.com", 5000, "ali", "1234", cp);
        Utilisateur u2 = new Utilisateur(2, "Sara", "Bennani", "0698765472", "sara@gmail.com", 6000, "sara", "5678", mn);
        utilisateurManager.create(u1);
        utilisateurManager.create(u2);

        System.out.println("Managers:");
        for (Utilisateur u : utilisateurManager.getAll()) {
            if (u.getProfil().getLibelle().equals("Manager")) {
                System.out.println(u.nom + " " + u.prenom);
            }
        }
    }
}


