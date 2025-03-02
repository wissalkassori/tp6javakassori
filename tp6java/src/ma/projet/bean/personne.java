
package ma.projet.bean;

class Personne {
    protected int id;
    private String nom;
    private String prenom;
    protected String telephone;
    protected String email;
    protected double salaire;

    public Personne(int id, String nom, String prenom, String telephone, String email, double salaire) {
        this.id = id;
        this.setNom(nom);
        this.setPrenom(prenom);
        this.telephone = telephone;
        this.email = email;
        this.salaire = salaire;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}