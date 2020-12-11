package exercice2;


public class EmployeCommission extends Employer{
	double  salaireMensuel, commission, ventes;
	public EmployeCommission(double salaire, String nom, double commission,double ventes) {
		super(salaire, nom);
		// TODO Auto-generated constructor stub
		this.commission = commission;
		this.ventes = ventes;
		
	}
	public double getSalaireMensuel() {
		return salaireMensuel;
	}
	public void setSalaireMensuel(double salaireMensuel) {
		this.salaireMensuel = salaireMensuel;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	public double getVentes() {
		return ventes;
	}
	public void setVentes(int ventes) {
		this.ventes = ventes;
	}
	
	public void afficherSalaireMensuel() {
		this.salaireMensuel = (this.commission * this.ventes) + this.getSalaire();
		this.setSalaire(this.salaireMensuel);
		System.out.println("Bonjour "+ this.getNom() +" votre salaire avec commission est : " + this.salaireMensuel + " DH");
		
	}
	
	
	
}
