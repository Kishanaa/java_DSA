package Array;
/*
    Q) Number of occurrences of each element in the array.
    Difficulty level - Medium
 */
public class CountFrequency {
    static void main() {
        int arr[] = {10,15,8,10,10,8};
        int n = arr.length;
        boolean visited[] = new boolean[n];

        int freq = 1;
        int num;

        for (int i = 0; i <= n-1; i++){
            if (visited[i]){
                continue;
            }
            num = arr[i];
            for (int j = i+1; j <= n-1; j++){
                if (num == arr[j]){
                    visited[j]=true;
                    freq++;
                }

            }
            System.out.println(num+" occurs "+ freq + " times in the array");
            freq = 1;
        }
    }
}
