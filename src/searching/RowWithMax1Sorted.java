package searching;

public class RowWithMax1Sorted {
    static int onesIndex(int[] arr){
        int index = arr.length;
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid]==1){
                end = mid - 1;
                index = mid;
            }else{
                start = mid + 1;
            }
        }

        return index;
    }

    static int rowWithMax1s(int[][] arr) {
        int ans = arr.length;
        int index = arr.length;
        int maxRow = arr.length - 1;

        for (int i = 0; i <= maxRow; i++){
            int newIndex = onesIndex(arr[i]);
            if (ans > newIndex){
                ans = newIndex;
                index = i;
            }
        }
        if (index>arr[0].length - 1){
            index = -1;
        }



        return index;
    }
    static void main() {
//        int[][] arr = {{0,1,1,1},{0,0,1,1},{1,1,1,1},{0,0,0,0}};
        int[][] arr = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        System.out.println(rowWithMax1s(arr));
    }
}
