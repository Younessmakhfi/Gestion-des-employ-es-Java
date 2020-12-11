package exercice2;

public class EmployeHoraire extends Employer{
	double tauxHoraire, heuresPrestees,salaireMensuel;
	
 public EmployeHoraire(String nom, double tauxHoraire, double heuresPrestees) {
	 	super(nom);
		this.tauxHoraire = tauxHoraire;
		this.heuresPrestees = heuresPrestees;
		
	}


 

public double getTauxHoraire() {
	return tauxHoraire;
}

public void setTauxHoraire(double tauxHoraire) {
	this.tauxHoraire = tauxHoraire;
}

public double getHeuresPrestees() {
	return heuresPrestees;
}

public void setHeuresPrestees(int heuresPrestees) {
	this.heuresPrestees = heuresPrestees;
}
public void afficherSalaireMensuel() {
	this.salaireMensuel = (this.tauxHoraire * this.heuresPrestees);
	this.setSalaire(this.salaireMensuel);
	System.out.println("Bonjour "+ this.getNom() +" votre salaire par heurs est : " + this.salaireMensuel + " DH");
	
}

}
