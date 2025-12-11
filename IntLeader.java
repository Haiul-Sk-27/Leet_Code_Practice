// How to find all the leaders in an integer array in  java?

public class IntLeader {
    void printLeaders(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            int j;
            for (j = i + 1; j < size; j++) {
                if (arr[i] <= arr[j])
                    break;
            }
            if (j == size)
                System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        IntLeader lead = new IntLeader();
        int arr[] = new int[] { 25, 10, 2, 4, 1, 3 };
        int n = arr.length;
        lead.printLeaders(arr, n);
    }
}
