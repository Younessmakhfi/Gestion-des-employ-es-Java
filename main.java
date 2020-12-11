package exercice2;
public class main {
	  public static void main(String[] args) {
		  EmployeCommission employeCommission = new EmployeCommission(100,"ismail ",20,10);
		  employeCommission.afficherSalaireMensuel();
		  EmployeHoraire employeHoraire = new EmployeHoraire("youness",20,10);
		  employeHoraire.afficherSalaireMensuel();
		  EmployeFixe employeFixe = new EmployeFixe(3000 ,"youness");
		  employeFixe.afficherSalaireMensuel();
		  Employer[] employerextended = new Employer[2];
		 // employerextended[0] = new EmployeCommission(100,"mustapha ",20,10);
		 // employerextended[1] = new EmployeHoraire("hassan",20,10);
		 // employerextended[0].afficherSalaireMensuel();
		  //employerextended[1].afficherSalaireMensuel();
	  }
	    	
}
