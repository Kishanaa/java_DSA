package leetCode;

public class Sqrt69 {
    static int mySqrt(int x) {
        long start = 0;
        long end = x;
        long target = x;
        long mid = start + (end - start)/2;

        while(start <= end){
            mid = start + (end - start)/2;

            if(mid*mid == target && (mid-1)*(mid-1) < target){
                return (int) mid;
            }else if (mid*mid <= target && (mid+1)*(mid+1) > target) {
                return (int) mid;
            }else if(mid*mid > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }

        return -1;
    }
    static int method2(int x) {
        long start = 0;
        long end = x;
        long target = x;
        int ans = 0;

        while(start <= end){
            long mid = start + (end - start)/2;

            if(mid*mid== target){
                return (int) mid;
            }else if(mid*mid > target){
                end = mid - 1;
            }else{
                ans = (int) mid;
                start = mid + 1;
            }
        }

        return ans;
    }
    static void main() {
        int target = 1;
        System.out.println(mySqrt(target));
        System.out.println(method2(target));
    }
}
