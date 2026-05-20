import java.util.Scanner;

public class Basic {
	public static void main (String args[]) {
		System.out.println ("Um programa que contém conceitos básicos de Java");
	}
}

public class Industry {
	int numId;
	float costValue;
	char category;
	boolean hasLicense;
	String companyName;

	public Industry (int newNumId, float newCostValue, char newCategory, boolean newHasLicense, String newCompanyName){
		numId = newNumId;
		costValue = newCostValue;
		category = newCategory;
		hasLicense = newHasLicense;
		companyName = newCompanyName;
	}

	void showCompanyLicense(){
		if (hasLicense == true){
			System.out.println (companyName + " tem licensa para operar");
		} else if (hasLicense == false){
			System.out.println (companyName + " não possui licensa para operar");
		}
	}
	void showCompanyStats(){
		System.out.println ("Nome da empresa: " + companyName);
		System.out.println ("ID da empresa: " + numId);
		System.out.println ("Classe da empresa: " + category);
		System.out.println ("Valor da empresa: " + costValue);
		showCompanyLicense ();
	}
	
	public static void main (String args[]){
	Scanner input = new Scanner (System.in);
	System.out.println ("Digite os dados da compania");

	System.out.print ("Digite o nome: ");
	String name = input.nextLine();
	System.out.print ("Digite o ID: ");
	int id = input.nextInt();
	System.out.print ("Digite o valor: ");
	float cost = input.nextFloat();
	System.out.print ("Digite a categoria: ");
	char category = input.next().charAt(0);

	Industry industria = new Industry (id, cost, category, true, name);
		
	//Industry fabricaDePaes = new Industry (001, 706548.54f, 'C', true, "Padaria Céu Azul");

	industria.showCompanyStats();
	}
}