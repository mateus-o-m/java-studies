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
	static char ch1 = 'A';
	static char ch2 = 'B';
	static char ch3 = 'O';
	static String chChoice = chStr + "\n(1) " + ch1 + "\n(2) " + ch2 + "\n(3) " + ch3 + "\n=>";

	static String boStr = "Trabalha? ";
	static String boTrueStr = " trabalha";
	static String boFalseStr = " não trabalha";
	static String boChoice = boStr + "\n(1)" + boTrueStr + "\n(2)" + boFalseStr + "\n=>";

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

	static <T> T userChoice (int choice, T...options){
		if (choice >= 1 && choice <= options.length) {
			return (T) options[choice];
		}
		return null;
	}

	public static void main (String args[]){
		int choice;
		Scanner input = new Scanner (System.in);
		System.out.println ("Preencha os dados abaixo");

		String str = userInput (strStr, String.class, input);
		int num = userInput (numStr, Integer.class, input);
		float decimal = userInput (decimalStr, Float.class, input);

		choice = userInput (chChoice, Integer.class, input);
		char chooseChar = userChoice (choice, ch1, ch2, ch3);
		choice = userInput (boChoice, Integer.class, input);
		boolean chooseBool = userChoice (choice, true, false);

		DataTypes pessoa = new DataTypes (num, decimal, chooseChar, chooseBool, str);
			
		pessoa.showData();
	}
}