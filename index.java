public class index{
    public static int findMiddleIndex(int[] array) throws Exception{
        
        int endIndex = array.length -1;
        int startIndex = 0;
        int leftSum = 0;
        int rightSum = 0;
        
        while(true){
            if(leftSum > rightSum){
                rightSum += array[endIndex--];
            }else{
                leftSum += array[startIndex++];
            }
            
            if(startIndex > startIndex){
                if(leftSum == rightSum){
                    break;
                }else{
                    throw new Exception("No Such combination found in the array.");
                }
            }
        }
        return endIndex;
    }
    
    public static void main(String[] args){
         int[] array = {1, 7, 5, 2, 8, 3}; 
         try{
             int index = findMiddleIndex(array);
             System.out.println("Sum precding the index"+index+"is equal to the sum succeding the index "+index);
         }catch(Exception ex){
             System.out.println(ex.getMessage());
         }
    }
}