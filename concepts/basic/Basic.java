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

	public DataTypes (int age, float height, char gender, boolean isStudying, String name){
		this.age = age;
		this.height = height;
		this.gender = gender;
		this.isStudying = isStudying;
		this.name = name;
	}

	void showIsStudying(){
		if (isStudying == true){
			System.out.println (name + " é estudante");
		} else if (isStudying == false){
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
		int choose;
		boolean chooseBool = false;
		char chooseChar = ' ';
		Scanner input = new Scanner (System.in);
		System.out.println ("Preencha os dados da pessoa");

		System.out.print ("Digite o nome: ");
		String name = input.nextLine();
		System.out.print ("Digite a idade: ");
		int age = input.nextInt();
		System.out.print ("Digite a altura: ");
		float height = input.nextFloat();
		System.out.printf ("Escolha o gênero, digite:\n(1) para masculino\n(2) para femenino\n=>: ");
		choose = input.nextInt();
		//implementar função para escolha
		switch (choose){
			case (1):
				chooseChar = 'M';
				break;
			case (2):
				chooseChar = 'F';
				break;
		}
		choose = 0;
		System.out.printf ("É estudante?\n(1) Sim\n(2) Não\n=>: ");
		choose = input.nextInt();
		switch (choose){
			case (1):
				chooseBool = true;
				break;
			case (2):
				chooseBool = false;
				break;
		}
		//char category = input.next().charAt(0);

		DataTypes pessoa = new DataTypes (age, height, chooseChar, chooseBool, name);
			
		//Industry fabricaDePaes = new Industry (001, 706548.54f, 'C', true, "Padaria Céu Azul");

		pessoa.showData();
	}
}