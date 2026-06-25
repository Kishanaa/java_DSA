package searching;

public class BookAllocation {
    static int allocation(int[] arr, int k){
        int ans = 0;
        int minPages = arr[0];
        int maxPages = 0;

        if(k > arr.length){
            return -1;
        }

        for (int page : arr) {
            maxPages += page;
            minPages = Math.max(minPages, page);
        }
        int booksLength = arr.length - 1;

        while(minPages <= maxPages){
            boolean possible = true;
            int studentRemaining = k;
            int midPages = minPages + (maxPages - minPages)/2;

            int sum = 0;

            for(int i = 0; i <= booksLength; i++){
                sum += arr[i];
                if (midPages<sum){
                    studentRemaining--;
                    if (studentRemaining==0){
                        possible = false;
                        break;
                    }

                    sum = arr[i];
                }
            }
            if(possible){
                ans = midPages;
                maxPages = midPages - 1;
            }else{
                minPages = midPages + 1;
            }
        }

        return ans;
    }
    static void main() {
        int[] books = {10, 20, 30, 40, 50, 60};
        int student = 3;
        System.out.println(allocation(books,student));
    }
}