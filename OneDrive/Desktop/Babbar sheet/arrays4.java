import java.util.*;
public class arrays4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int mid = 0;
        int high = arr.length -1;
        while(mid <= high){
          if(arr[mid]== 0){
            int temp = arr[low];
            arr[low] = arr[mid];
            arr[mid] = temp;
            low++;
            mid++;
          } else if(arr[mid] == 1){
            mid++;
          }else{
            int temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            high--;
          }
        }
        System.out.println(Arrays.toString(arr));
    }
}
