import java.util.Scanner;

public class Basic {
	public static void main (String args[]) {
		System.out.println ("Um programa que contém conceitos básicos de Java");
	}
}

class DataTypes {
	int num;
	float decimal;
	char ch;
	boolean bo;
	String str;

	static String numStr = "Idade: ";
	static String decimalStr = "Altura: ";
	static String strStr = "Nome: ";

	static String chStr = "Tipo sanguíneo: ";
	static char chA = 'A';
	static char chB = 'B';
	static char chO = 'O';

	static String boStr = "Trabalha? ";
	static String boTrueStr = "trabalha";
	static String boFalseStr = "não trabalha";

	public DataTypes (int num, float decimal, char ch, boolean bo, String str){
		this.num = num;
		this.decimal = decimal;
		this.ch = ch;
		this.bo = bo;
		this.str = str;
	}

	void showBoolean(){
		if (bo == true){
			System.out.println (str + boTrueStr);
		} else if (bo == false){
			System.out.println (str + boFalseStr);
		}
	}

	void showData(){
		System.out.println (strStr + str);
		System.out.println (numStr + num);
		System.out.println (chStr + ch);
		System.out.println (decimalStr + decimal);
		showBoolean ();
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
		boolean chooseBool = false;
		char chooseChar = ' ';
		Scanner input = new Scanner (System.in);
		System.out.println ("Preencha os dados abaixo");

		String str = userInput (strStr, String.class, input);
		int num = userInput (numStr, Integer.class, input);
		float decimal = userInput (decimalStr, Float.class, input);
		int choose = userInput (chStr, Integer.class, input);

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

		DataTypes pessoa = new DataTypes (num, decimal, chooseChar, chooseBool, str);
			
		//Industry fabricaDePaes = new Industry (001, 706548.54f, 'C', true, "Padaria Céu Azul");

		pessoa.showData();
	}
}