public class Main {
    public static void main(String[] args) {
       String message = "The weather is very nice today.";
        System.out.println(message);

        System.out.println("Number of elements : "+message.length());
        System.out.println("5. Number of elements : "+message.charAt(4));
        System.out.println(message.concat(" Very good!"));
        //ilk harf B mi kontrol eder
        System.out.println(message.startsWith("B"));
        // son harf . mı kontrol eder
        System.out.println(message.endsWith("."));
        char[] characters = new char[11];
        message.getChars(0,11,characters,0);
        System.out.println(characters);
        // girilen kelime veya karakterin baştan kaçıncı indexte olduğunu bulur.
        System.out.println(message.indexOf('a'));
        // girilen kelime veya karakterin sondan başlayarak kaçıncı indexte olduğunu bulur.
        System.out.println(message.lastIndexOf("ry"));

        System.out.println(message.replace(' ','-'));

        System.out.println(message.substring(5,12));
        System.out.println("----------------------");
        for(String word:message.split(" ")){
            System.out.println(word);
        }
        System.out.println("----------------------");
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        // başında veya sonunda boşluk varsa siler
        System.out.println(message.trim());

    }
}