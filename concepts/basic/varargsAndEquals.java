class usingVarargsAndEquals {
	public static void printNumbers (int...num){
		for (int numPrint: num){
			System.out.println (numPrint);
		}
	}

	public static void main (){
		System.out.println ("Numbers: ");
		printNumbers (1, 4, 6, -6, 30);

		String word1 = "casa";
		String word2 = "Casa";

		String compareResult;

		compareResult = word1.equals (word2) ? "iguais" : "diferentes";		
		/*em progresso
		switch (word1.equals (word2)){
			case (true):
				compareResult = "iguais";
				break;
			case (false):
				compareResult = "diferentes";
				break;
		}
		*/

		System.out.println ("A palavra " + word1 + " e " + word2 + " são " + compareResult);
	}
}