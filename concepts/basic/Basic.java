import java.util.Scanner;

public class Basic {
	public static void main (String args[]) {
		System.out.println ("Um programa que contém conceitos básicos de Java");
	}
}

class DataTypes {
	int age;
	float height;
	char gender;
	boolean isStudying;
	String name;

	public Industry (int newAge, float newHeight, boolean newIsStudying, String newName){
		age = newAge;
		height = newHeight;
		isStudying = newIsStudying;
		name = newName;
	}

	void showIsStudying(){
		if (isStudying == true){
			System.out.println (name + " é estudante");
		} else if (isSutying == false){
			System.out.println (name + " não é estudante");
		}
	}

	void showData(){
		System.out.println ("Nome: " + name);
		System.out.println ("Idade: " + age);
		System.out.println ("Gênero: " + gender);
		System.out.println ("Altura: " + height);
		showIsStudying ();
	}
	
	public static void main (String args[]){
		Scanner input = new Scanner (System.in);
		System.out.println ("Preencha os dados da pessoa");

		System.out.print ("Digite o nome: ");
		String name = input.nextLine();
		System.out.print ("Digite a idade: ");
		int age = input.nextInt();
		System.out.print ("Digite a altura: ");
		float height = input.nextFloat();
		System.out.print ("Escolha o gênero: ");
		//implementar função para escolha
		//char category = input.next().charAt(0);

		DataType pessoa = new DataType (age, geight, gender, true, name);
			
		//Industry fabricaDePaes = new Industry (001, 706548.54f, 'C', true, "Padaria Céu Azul");

		pessoa.showData();
	}
}