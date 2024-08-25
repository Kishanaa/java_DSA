import java.util.Scanner;

public class Linear_search {
    public static void main(String[] args) {
        int arr[] = new int[20],n,i,j=-1,item;
        System.out.print("Enter the size of array: ");
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        for (i=0;i<n;i++){
            System.out.print("Enter element " + (i+1)+": ");
            arr[i]= scanner.nextInt();
        }
        System.out.print("Enter element to be Search: ");
        item=scanner.nextInt();
        for (i=0;i<n;i++){
            if (arr[i]==item){
                j=i;
                break;
            }
        }
        if (j!=-1){
            System.out.println("Search successful item found at position " + (j+1));
        }else {
            System.out.println("Search unsuccessful");
        }
    }
}
