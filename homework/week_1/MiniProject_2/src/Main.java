public class Main {
    public static void main(String[] args) {

        char letter = 'A';


        switch (letter){
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("bold vowel");
                break;
            default:
                System.out.println("thin vowel");
        }
    }
}