package searching;

public class BookAllocationFor2Students {
    static int allocation(int[] books){
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;

        int end = books.length;

        for (int i = 0; i < end; i++){
            rightSum += books[i];
        }

        for (int i = 0; i < end; i++){
            rightSum-=books[i];
            leftSum+=books[i];

            if (leftSum <= rightSum){
                sum = rightSum;
            }else{
                if (sum > leftSum){
                    sum = leftSum;
                }
                break;
            }
        }




        return sum;
    }
    static void main() {
        int[] books = {100, 200, 300, 400};
        System.out.println(allocation(books));
    }
}
