// In a straightforward way, we can create a new array and then copy elements to the
// new array. Then change the original array by using System.arraycopy().

public class RotateArray{
    public void rotate(int[] nums,int k){
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    
    public static void reverse(int[] nums,int start,int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void main(String[] args){
        RotateArray sol = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        sol.rotate(nums,k);
        for(int num : nums){
            System.out.print(num+" ");
        }
    }
}