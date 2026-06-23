package recursion;

public class RecursionPractice {
    static void countEleInArray(int[] arr, int i, int target, int count){
        if (i >= arr.length){
            System.out.println(count);
            return;
        }
        if (arr[i] == target){
            count++;
        }
        countEleInArray(arr, i+1, target, count);
    }
    static void findEleInArray(int[] arr, int i, int num){
        if (i >= arr.length ){
            return;
        }
        if (arr[i] == num){
            System.out.println(i + " Index");
            return;
        }
        findEleInArray(arr, i+1, num);
    }
    static void print1ToN(int n, int count){
        if (count > n){
            return;
        }
        System.out.println(count);
        count++;
        print1ToN(n,count);
    }
    static void printArray(int[] arr, int i){
        if (i >= arr.length){
            return;
        }
        System.out.println(arr[i]);

        printArray(arr, i+1);
    }
    static void printArrayMaxEle(int[] arr, int max, int i){
        if (i >= arr.length){
            System.out.println(max);
            return;
        }

        if (max < arr[i]){
            max = arr[i];
        }

        printArrayMaxEle(arr, max, i+1);
    }
    static void printDigit(int num){
        if (num == 0){
            return;
        }
        printDigit(num/10);
        System.out.println(num%10);
    }
    static void printNameNTimes(int n, String name){
        if (n == 0){
            return;
        }
        System.out.println(name);
        printNameNTimes(n-1, name);
    }
    static void printNto1(int n, int count){
        if (count > n){
            return;
        }

        printNto1(n,count+1);

        System.out.println(count);
    }
    static void main() {
        int[] arr = {1,2,2,3,4,4,4,4,4,1,1};
        countEleInArray(arr,0,5,0);
    }
}
