import java.util.*;
public class arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0 ; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(min);
        list.add(max);
        System.out.println(list);
    }
}
