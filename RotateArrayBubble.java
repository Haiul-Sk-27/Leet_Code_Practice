public class RotateArrayBubble{
    public static void rotate(int[] arr,int order){
        int n = arr.length;
        order = order % n;
        
        for(int i = 0;i < order;i++){
            for(int j = n-1;j > 0;j--){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
    }
    
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+"");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6};
         
        int k = 2;
         
        System.out.println("Original array:");
        printArray(arr);

        rotate(arr, k);

        System.out.println("Array after rotating by " + k + ":");
        printArray(arr); 
    }
}