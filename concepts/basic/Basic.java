import java.util.Scanner;

//class that uses different data types
class DataTypes extends ImputHelper {
	private int age;
	private float height;
	private char blood;
	private boolean hasWork;
	private String name;

	static int minAge = 10;
	static int maxAge = 100;
	static float minHeight = 1.0f;
	static float maxHeight = 2.3f;
	static String regexStr = "^[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$";

	/*
		|| reusable strings 
		\/
	*/
	static String errNullStr = "Não foi possível ler o input, tente novamente";
	static String errNumStr = "Formato numérico inválido, tente novamente";
	static String errInputStr = " é um valor inválido, tente novamente";

	static String ageStr = "Idade: ";
	static String heightStr = "Altura: ";
	static String nameStr = "Nome: ";

	//loop to create choice menu strings
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

	/*
	public String getName() { return name; }
    public int getAge() { return age; }
    public float getHeight() { return height; }
    public char getBlood() { return blood; }
    public boolean isHasWork() { return hasWork; }
	*/

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

	/*
		|| visualizations 
		\/
	*/
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
		/\
		|| visualizations
	*/

	//future feature: update to get method and set method
	public DataTypes (int age, float height, char blood, boolean hasWork, String name){
		this.age = age;
		this.height = height;
		this.blood = blood;
		this.hasWork = hasWork;
		this.name = name;
	}

	public static void main (String args[]){
		int choice;
		Scanner input = new Scanner (System.in);
		System.out.println ("Preencha os dados abaixo");

		String name = userInput (nameStr, String.class, input);
		int age = userInput (ageStr, Integer.class, input, minAge, maxAge);
		float height = userInput (heightStr, Float.class, input, minHeight, maxHeight);

		choice = userInput (bloodChoice, Integer.class, input, 1, 3);
		char chooseChar = userChoice (choice, blood1, blood2, blood3);
		choice = userInput (hasWorkChoice, Integer.class, input, 1, 2);
		boolean chooseBool = userChoice (choice, true, false);

		//future update: replace to get and set methods
		DataTypes[] pessoas = new DataTypes[5];
		DataTypes pessoa = new DataTypes (age, height, chooseChar, chooseBool, name);
			
		pessoa.showData();
	}
}

//utilitaries
class ImputHelper {
	//verify user numeric inputs, can have both integer or decimal arguments
	static <T extends Comparable <T>> T verifyInput (T input, T min, T max){
		if (input.compareTo (min) >= 0 && input.compareTo (max) <= 0){
			return (T) input;
		} else {
			System.out.println (input + DataTypes.errInputStr);
			return null;
		}
	}

	
	//userInput method overloader
	static <T extends Comparable <T>> T userInput (String message, Class<T> dataType, Scanner scan) {
		return userInput (message, dataType, scan, null, null); //specific to String data types
	}

	//input gather loop
	static <T extends Comparable <T>> T userInput (String message, Class <T> dataType, Scanner scan, T min, T max){
		while (true){
			System.out.print (message);
			String input = scan.nextLine().trim(); //create usefull input

			if (input.isEmpty()){
				System.out.println (DataTypes.errNullStr);
				continue;
			}
			try {
				if (processInput (input, dataType, min, max) == null){
					continue;
				} else { 
					return processInput (input, dataType, min, max);
				}
			} catch (NumberFormatException e){
            	System.out.println (DataTypes.errNumStr);
        	} catch (IllegalArgumentException e){
            	System.out.println (e.getMessage());
        	}
		}
	}

	//validation and data process
	static <T extends Comparable <T>> T processInput (String input, Class<T> dataType, T min, T max){
		if (dataType == String.class){
			if (DataTypes.regexStr != null && input.matches (DataTypes.regexStr)){
				return (T) input;
			} else {
				System.out.println (input + DataTypes.errInputStr);
				return null;
			}
		}

		T num = null;
		if (dataType == Integer.class){
			num = (T) Integer.valueOf (input);
		} else if (dataType == Float.class){
			num = (T) Float.valueOf (input);
		}

		if (num != null && min != null && max != null){
			return (T) verifyInput (num, min, max);
		} else {
			return null;
		}
	}

	//numeric choice menu
	static <T> T userChoice (int choice, T...options){
		if (choice >= 1 && choice <= options.length) {
			return (T) options[choice - 1];
		}
		return null;
	}
}