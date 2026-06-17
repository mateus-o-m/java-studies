import java.util.Scanner;

public class Basic { //main class
	public static void main (String args[]) {
		System.out.println ("Um programa que contém conceitos básicos de Java");
	}
	/*
	future features:
	- menu to access subclasses
	*/
}

//class that uses different data types
class DataTypes {
	int age;
	float height;
	char blood;
	boolean hasWork;
	String name;

	/*
		|| reusable strings 
		\/
	*/
	static String errNullStr = "Não foi possível ler o input, tente novamente\n";
	static String invalidInputStr = "é um valor inválido";

	static String ageStr = "Idade: ";
	static String heightStr = "Altura: ";
	static String nameStr = "Nome: ";

	static <T> String menuString (T...str){
		int count = 1;
		String menu = "";
		for (T word: str){
			menu = menu + "\n(" + count + ") " + word;
			count ++;
		}
		menu = menu + "\n=> ";
		return menu;
	}


	static String bloodStr = "Tipo sanguíneo: ";
	static char blood1 = 'A';
	static char blood2 = 'B';
	static char blood3 = 'O';
	static String bloodChoice = bloodStr + menuString (blood1, blood2, blood3);

	static String hasWorkStr = "Trabalha? ";
	static String hasWTrueStr = " trabalha";
	static String hasWFalseStr = " não trabalha";
	static String hasWorkChoice = hasWorkStr + menuString (hasWTrueStr, hasWFalseStr);
	/*
		/\
		|| reusable strings
	*/

	//future feature: add get method and set method
	public DataTypes (int age, float height, char blood, boolean hasWork, String name){
		this.age = age;
		this.height = height;
		this.blood = blood;
		this.hasWork = hasWork;
		this.name = name;
	}

	void showBoolean(){
		if (hasWork == true){
			System.out.println (name + hasWTrueStr);
		} else if (hasWork == false){
			System.out.println (name + hasWFalseStr);
		}
	}

	void showData(){
		System.out.println (nameStr + name);
		System.out.println (ageStr + age);
		System.out.println (bloodStr + blood);
		System.out.println (heightStr + height);
		showBoolean ();
	}
	
	/*
	static <T> T verifyInput (T input, T min, T max){
		if (input >= min && input <= max){
			return input;
		} else {
			System.out.printf ("%s %s", input, invalidInputStr);
			return null;
		}
	}

	float verifyHeight (float height){
		if (height <= 1.0 && height <=2.5){
			return height;
		} else {
			System.out.printf ("%.2f é um valor inválido", height);
		}
	}

	int verifyChoice (int age, int max, int min){
		if (age >= min && age <=max){
			return age;
		} else {
			System.out.printf ("%d é um valor inválido", age);
		}
	}

	void DataTypesLoop (DataTypes array[lenght], int length){
		DataTypes[] pess
		for (int i = 0; i <= (lenght - 1); i++){

		}
	}
	*/

	static <T> T userInput (String message, Class <T> dataType, Scanner scan, T min, T max){
		while (true){
			System.out.print (message);
			String input = scan.nextLine();

			if (input.isEmpty()){
				System.out.print (errNullStr);
				continue;
			}
			try {
				if (dataType == Integer.class){
					Integer numInput = Integer.parseInt (input.trim());
					Integer num = verifyInput (numInput, min, max);
				} else if (dataType == Float.class){
					Float numInput = Float.parseFloat (input.trim());
					Float num = verifyInput (numInput, min, max);
				} else if (dataType == String.class){
					return (T) input;
				}
				if (num != null){
					return (T) num;
				} else {
					continue;
				}
			} catch (NumberFormatException e){
            	System.out.println("Erro: Por favor, digite um número válido.");
        	} catch (IllegalArgumentException e) {
            	System.out.println(e.getMessage());
        	}
		}
	}

	/*
	static <T> T inputLoop (String input, Class <T> dataType){
		if (dataType == Integer.class){
			Integer num = Integer.parseInt (input.trim());
			return (T) num;
		} else if (dataType == Float.class){
			Float num = Float.parseFloat (input.trim());
			return (T) num;
		} else if (dataType == String.class){
			return (T) input;
		}
		return null;
	}
	*/

	static <T> T userChoice (int choice, T...options){
		if (choice >= 1 && choice <= options.length) {
			return (T) options[choice - 1];
		}
		return null;
	}

	public static void main (String args[]){
		int choice;
		Scanner input = new Scanner (System.in);
		System.out.println ("Preencha os dados abaixo");

		String name = userInput (nameStr, String.class, input);
		int age = userInput (ageStr, Integer.class, input);
		float height = userInput (heightStr, Float.class, input);

		choice = userInput (bloodChoice, Integer.class, input);
		char chooseChar = userChoice (choice, blood1, blood2, blood3);
		choice = userInput (hasWorkChoice, Integer.class, input);
		boolean chooseBool = userChoice (choice, true, false);

		DataTypes[] pessoas = new DataTypes[5];
		DataTypes pessoa = new DataTypes (age, height, chooseChar, chooseBool, name);
			
		pessoa.showData();
	}
}