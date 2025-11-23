import java.util.*;
public class arrays1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
         for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();  
        }
        int left = 0 ;
        int right = arr.length -1;
        for(int i = 0 ; i < arr.length ; i++){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr) + " ");
    }
}
