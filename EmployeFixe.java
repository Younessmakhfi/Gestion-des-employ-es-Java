package exercice2;

public class EmployeFixe extends Employer{

	public EmployeFixe(double salaire, String nom) {
		super(salaire, nom);
		// TODO Auto-generated constructor stub
	}
	public void afficherSalaireMensuel() {
		System.out.println("Bonjour "+ this.getNom() +" votre salaire fix est : " + this.getSalaire() + " DH");
		
	}

}
