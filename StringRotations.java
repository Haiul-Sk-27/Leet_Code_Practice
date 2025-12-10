//A Program to check if strings are rotations of each  other or not?

public class StringRotations {
   static boolean areRotations(String str1,String str2){
    return (str1.length() == str2.length()) && ((str1+str2).indexOf(str2) !=-1);
   } 

   public static void main(String[] args){
    String str1 = "AACD";
    String Str2 = "ACDA";

    if(areRotations(str1, Str2))
        System.out.println("String are rotaions each others");
    else
        System.out.println("String are not rotations each others");
   }
}
