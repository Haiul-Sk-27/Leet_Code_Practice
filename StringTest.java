//Can you write a regular expression to check if  String is a number?
public class StringTest {
    public static void main(String[] args){
        String regex = "[0-9]+";
        String data =  "23343453"; 

        System.out.println("Is number: "+data.matches(regex));
    }
}
