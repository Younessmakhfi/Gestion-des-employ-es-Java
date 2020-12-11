package exercice2;

public class Employer {
	private double salaire;
	private String nom;
	

	public Employer(double salaire, String nom) {
		this.salaire = salaire;
		this.nom = nom;
		// TODO Auto-generated constructor stub
	}
	public Employer(String nom) {
		this.nom = nom;
		// TODO Auto-generated constructor stub
	}


	public double getSalaire() {
		return salaire;
	}
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public void afficherSalaireMensuel(){
		System.out.println("Bonjour "+ this.getNom() +" votre salaire est : " + this.salaire + " DH");
	}
	


	

}
