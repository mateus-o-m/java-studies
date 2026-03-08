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
	
	public static void main (){
		Industry fabricaDePaes = new Industry (001, 706548.54f, 'C', true, "Padaria Céu Azul");

		fabricaDePaes.showCompanyStats();
	}
}