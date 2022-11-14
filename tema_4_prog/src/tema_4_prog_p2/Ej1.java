package tema_4_prog_p2;

public class Ej1 {
	public static void main(String[]args) {
	String frase = "This is just a sample string";
	int totalCharacters = 0;
    char temp;
    for (int i = 0; i < frase.length(); i++) {

        temp = frase.charAt(i);
        if (temp == 'i')
            totalCharacters++;
    }

    System.out.println("i appears " + totalCharacters + " times in exampleString");
}
}
