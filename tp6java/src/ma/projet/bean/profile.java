package ma.projet.bean;

public class profile {

    private int id;
    private String libelle;

    public void Profil(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
    public String getLibelle() { return libelle; }
}

class Utilisateur extends Personne {
    private String login;
    private String password;
    private Profil profil;

    public Utilisateur(int id, String nom, String prenom, String telephone, String email, double salaire,
                       String login, String password, Profil profil) {
        super(id, nom, prenom, telephone, email, salaire);
        this.login = login;
        this.password = password;
        this.profil = profil;
    }
    public Profil getProfil() { return profil; }
}
