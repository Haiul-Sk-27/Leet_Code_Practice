//Program to convert lower to upper case without  using toUppercase()?

public class LowerToUpperCase {
    public static void toLowerCase(String a){
        for(int i = 0;i < a.length();i++){
            char character = a.charAt(i);
            if(65 <= character && character <=90){
                character = (char)(character+32);
            }
        }
    }

    public static void main(String[] args){
        String str = "HELLO WORLD";
        toLowerCase(str);
    }
}
