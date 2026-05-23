import java.util.Scanner;

public class Basic {
	public static void main (String args[]) {
		System.out.println ("Um programa que contém conceitos básicos de Java");
	}
}

class DataTypes {
	int age;
	float height;
	char bloodType;
	boolean hasWork;
	String name;

	public DataTypes (int age, float height, char bloodType, boolean hasWork, String name){
		this.age = age;
		this.height = height;
		this.bloodType = bloodType;
		this.hasWork = hasWork;
		this.name = name;
	}

	void showhasWork(){
		if (hasWork == true){
			System.out.println (name + " trabalha");
		} else if (hasWork == false){
			System.out.println (name + " não trabalha");
		}
	}

	void showData(){
		System.out.println ("Nome: " + name);
		System.out.println ("Idade: " + age);
		System.out.println ("Gênero: " + bloodType);
		System.out.println ("Altura: " + height);
		showhasWork ();
	}
	
	static <T> T userInput (String message, Class <T> dataType, Scanner scan){
		System.out.print (message);
		String input = scan.nextLine();
		if (dataType == Integer.class){
			Integer num = Integer.parseInt (input);
			return (T) num;
		} else if (dataType == Float.class){
			Float num = Float.parseFloat (input);
			return (T) num;
		} else if (dataType == String.class){
			return (T) input;
		}
		return null;
	}

	public static void main (String args[]){
		int choose;
		boolean chooseBool = false;
		char chooseChar = ' ';
		Scanner input = new Scanner (System.in);
		System.out.println ("Preencha os dados abaixo");

		String name = userInput ("Nome: ", String.class, input);
		int age = userInput ("Idade: ", Integer.class, input);
		float height = userInput ("Altura: ", Float.class, input);

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