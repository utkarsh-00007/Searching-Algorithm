import java.util.Scanner;

public class BinarySearch2 {
    static int binarySearch(int[] arr,int search)
    {
        int first=0;
        int last=arr.length-1;
        int mid=(first+last)/2;
        while(first<=last)
        {
            if(arr[mid]!=search)
            {
                if(arr[mid]>search)
                {
                    last=mid-1;
                    mid=(first+last)/2;
                }
                else if(arr[mid]<search)
                {
                    first=mid+1;
                    mid=(first+last)/2;
                }
            }else
            {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter total number of value you want to insert in array: ");
        int n=s.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter your values : ");
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter data you want to search in array : ");
        int search=s.nextInt();
        int t=(binarySearch(arr,search));
        if (t!=-1) {
            System.out.println("Search successful, Element "+ search +" Found at Position " + (t + 1));
        } else {
            System.out.println("Search failed, Element Not found");
        }
    }
}
