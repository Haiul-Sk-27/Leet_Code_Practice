public class FBExample{
    public static String fb(int number){
        if(number %3 == 0){
            return "Fizzbuzz";
        }else if(number % 5==0){
            return "buzz";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args){
        System.out.println(fb(5));
    }
}
