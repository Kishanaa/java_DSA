package leetCode;

public class SearchInInfiniteArr702 {

    static int search(int[] arr, int target){
        int start = 1;
        int end = 1;

        if (arr[0]==target){
            return 0;
        }
        while (arr[end]<target){
            start = end;
            end*=2;
            if (end>=arr.length){
                end = arr.length-1;
                break;
            }
        }

        while (start<=end){
            int mid = start + (end - start)/2;

            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }


        return -1;
    }
    static void main() {
//        array index -> 50
        int[] arr = {3,   7,  12,  18,  24,
                31,  39,  48,  58,  69,
                81,  94, 108, 123, 139,
                156, 174, 193, 213, 234,
                256, 279, 303, 328, 354,
                381, 409, 438, 468, 499,
                531, 564, 598, 633, 669,
                706, 744, 783, 823, 864,
                906, 949, 993,1038,1084,
                1131,1179,1228,1278,1329};
        int target = 949;
        System.out.println(search(arr, target));
    }
}
