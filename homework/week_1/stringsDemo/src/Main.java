public class Main {
    public static void main(String[] args) {
       String message = "The weather is very nice today.";

        System.out.println(message);
        System.out.println("Number of elements : "+message.length());
        System.out.println("5. Number of elements : "+message.charAt(4));
        System.out.println(message.concat(" Very good!"));
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));
        char[] characters = new char[11];
        message.getChars(0,11,characters,0);
        System.out.println(characters);
        System.out.println(message.indexOf('a'));
        System.out.println(message.lastIndexOf("ry"));
    }
}