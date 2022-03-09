
import java.util.Scanner;

// also known as linear search
public class SequentialSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter total number of value you want to insert in array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your values : ");
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter data you want to search in array : ");
        int item = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (item==arr[i]){
                System.out.println("Search successful, item found at position "+ (i+1));
                break;
            }
            else {
                System.out.println("Search not successful, elements not found");
                break;
            }
        }


    }
}
