import java.util.Scanner;
import java.util.function.Predicate;

//class that uses different data types
class DataTypes extends InputHelper {
	//main variables
	private int age;
	private float height;
	private char blood;
	private boolean hasWork;
	private String name;

	//limits/patterns for main variables
	static int minAge = 10;
	static int maxAge = 100;
	static float minHeight = 1.0f;
	static float maxHeight = 2.3f;
	static String regexStr = "^[a-zA-ZáàâãéèêíïóôõöúçñÁÀÂÃÉÈÍÏÓÔÕÖÚÇÑ ]+$";
	static String bloodTypes = "[ABO]";

	/*
		|| reusable strings 
		\/
	*/
	static String errNullStr = "Não foi possível ler o input, tente novamente";
	static String errNumStr = "Formato numérico inválido, tente novamente";
	static String errInputStr = " é um valor inválido, tente novamente";
	static String errIllegalStr = "Não foi possível atribuir o valor.";
	static String errIllegalNameStr = "Nome inválido";
	static String errIllegalAgeStr = "Idade inválida";
	static String errIllegalHeightStr = "Altura inválida";
	static String errIllegalBloodStr = "Tipo sanguíneo inválido";
	static String errIllegalHasWStr = "Verificação de trabalho falhou";

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

	static String bloodStr = "Tipo sanguíneo: ";
	static char blood1 = 'A';
	static char blood2 = 'B';
	static char blood3 = 'O';
	static String bloodChoiceStr = bloodStr + menuString (blood1, blood2, blood3);

	static String hasWorkStr = "Trabalha? ";
	static String hasWTrueStr = " trabalha";
	static String hasWFalseStr = " não trabalha";
	static String hasWAgeFailStr = " não possuí idade suficiente para traballhar";
	static String hasWorkChoiceStr = hasWorkStr + menuString (hasWTrueStr, hasWFalseStr);
	/*
		/\
		|| reusable strings
	*/

	/*
		|| visualizations 
		\/
	*/
	void showBoolean (DataTypes p){
		if (p.getHasWork() == true){
			System.out.println (p.getName() + hasWTrueStr);
		} else if (p.getHasWork() == false){
			System.out.println (p.getName() + hasWFalseStr);
		}
	}

	//update to get methods: name -> getName, age -> getAge ...
	void showData (DataTypes p){
		System.out.println (nameStr + p.getName());
		System.out.println (ageStr + p.getAge());
		System.out.println (bloodStr + p.getBlood());
		System.out.println (heightStr + p.getHeight());
		showBoolean (p);
	}
	/*
		/\
		|| visualizations
	*/

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public float getHeight(){
		return height;
	}
	public char getBlood(){
		return blood;
	}
	public boolean getHasWork(){
		return hasWork;
	}

	//predicate: InputHelper.processInput (name, String.class)
	public void setName (String name, Predicate<String> verifier){
		if (verifier.test (name)){
			this.name = name;
		} else {
			throw new IllegalArgumentException (errIllegalNameStr);
		}
	}

	//predicate: InputHelper.verifyInput (age, DataTypes.minAge, DataTypes.maxAge)
	public void setAge (int age, Predicate<Integer> verifier){
		if (verifier.test (age)){
			this.age = age;
		} else {
			throw new IllegalArgumentException (errIllegalAgeStr);
		}
	}

	//predicate: InputHelper.verifyInput (heigth, DataTypes.minHeight, DataTypes.maxHwight)
	public void setHeight (float height, Predicate<Float> verifier){
		if (verifier.test (height)){
			this.height = height;
		} else {
			throw new IllegalArgumentException (errIllegalHeightStr);
		}
	}

	public void setBlood (char blood, String bloodMatch){
		String bloodStr = String.valueOf (blood);

		if (bloodStr.matches (bloodMatch)){
			this.blood = blood;
		} else {
			throw new IllegalArgumentException (errIllegalBloodStr);
		}
	}

	public void setHasWork (boolean hasWork){
		if (hasWork && this.age < 14){
			System.out.println (name + hasWAgeFailStr);
			this.hasWork = false;
		} else {
			this.hasWork = hasWork;
		}
	}

	public DataTypes (int age, float height, char blood, boolean hasWork, String name){
		this.age = age;
		this.height = height;
		this.blood = blood;
		this.hasWork = hasWork;
		this.name = name;
	}

	//DataTypes constructor overloader
	public DataTypes () {}

	public static void main (String args[]){
		int choice;
		Scanner input = new Scanner (System.in);
		System.out.println ("Preencha os dados abaixo");

		String nameInput = userInput (nameStr, String.class, input);
		int ageInput = userInput (ageStr, Integer.class, input, minAge, maxAge);
		float heightInput = userInput (heightStr, Float.class, input, minHeight, maxHeight);

		choice = userInput (bloodChoiceStr, Integer.class, input, 1, 3);
		char chooseBlood = userChoice (choice, blood1, blood2, blood3);
		choice = userInput (hasWorkChoiceStr, Integer.class, input, 1, 2);
		boolean chooseHasWork = userChoice (choice, true, false);

		DataTypes pessoa = new DataTypes();

		//object atributes validation
		try {
			pessoa.setName (nameInput, x -> stringIsValid (nameInput));
			pessoa.setAge (ageInput, x -> numInputIsValid (x, DataTypes.minAge, DataTypes.maxAge));
			pessoa.setHeight (heightInput, x -> numInputIsValid (x, DataTypes.minHeight, DataTypes.maxHeight));
			pessoa.setBlood (chooseBlood, bloodTypes);
			pessoa.setHasWork (chooseHasWork);
		} catch (IllegalArgumentException e) {
			System.out.println (errIllegalStr + e.getMessage());
		}
		
					
		pessoa.showData (pessoa);
	}
}

//utilitaries
class InputHelper {
	static boolean stringIsValid (String input){
		return (DataTypes.regexStr != null && input.matches (DataTypes.regexStr));
	}

	static <T extends Comparable <T>> boolean numInputIsValid (T input, T min, T max){
		return (input.compareTo (min) >= 0 && input.compareTo (max) <= 0);
	}

	//verify user numeric inputs, can have both integer or decimal arguments
	static <T extends Comparable <T>> T verifyInput (T input, T min, T max){
		if (numInputIsValid (input, min, max)){
			return (T) input;
		} else {
			System.out.println (input + DataTypes.errInputStr);
			return null;
		}
	}
	
	//methods overloader for String data types
	static <T extends Comparable <T>> T userInput (String message, Class<T> dataType, Scanner scan) {
		return userInput (message, dataType, scan, null, null);
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
			T validation = processInput (input, dataType, min, max);
			try {
				if (validation == null){
					continue;
				} else { 
					return validation;
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
			if (stringIsValid (input)){
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