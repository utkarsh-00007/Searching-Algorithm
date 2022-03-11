
import java.util.Scanner;

public class BinarySearch1 {
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
        int search = sc.nextInt();
        int first = 0;
        int last = arr.length-1;
        int mid = (arr.length-1)/2;
        while (search!=arr[mid]){
            if (search>arr[mid]){
                first=mid+1;
            }
            else {
                last=mid-1;
            }
            mid=(first+last)/2;

        }
        if (search==arr[mid]){
            System.out.println("Search successful, Element "+ search+" found at position "+ (mid +1));
        }
    }
}
