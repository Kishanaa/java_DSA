import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        int arr[]=new int[6],i,j,temp;
        System.out.print("Enter Value in array: ");
        Scanner scanner=new Scanner(System.in);
        for (i=0;i<6;i++){
            arr[i]=scanner.nextInt();
        }
        for (i=0;i<6;i++){
            temp=arr[i];
            j=i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
        System.out.println("After sorting array is: ");
        for (i=0;i<6;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
