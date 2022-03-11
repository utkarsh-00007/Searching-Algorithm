import java.util.Scanner;

public class BinarySearch3 {
    static int binarySearch(int[] arr,int ss,int first,int last)
    {
        if(first>last)
        {
            return -1;
        }
        int mid=(first+last)/2;
        if(arr[mid]==ss)
        {
            return mid;
        }
        if(arr[mid]>ss)
        {
            last=mid-1;
        }
        if(arr[mid]<ss)
        {
            first=mid+1;
        }
        return binarySearch(arr,ss,first,last);

    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total number of value you want to insert in array: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter your values : ");
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter data you want to search in array : ");
        int search=s.nextInt();
        int index=binarySearch(arr,search,0,arr.length-1);
        if(index>=0)
        {
            System.out.println("Search succesful, Element "+ search+" found at Position "+(index+1));
        } else {
            System.out.println("Search failed, Element Not found");
        }
    }
}
