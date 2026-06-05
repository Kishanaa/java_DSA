package leetCode;

public class ThirdMax {
    public static int thirdMax(int[] nums) {
        Integer thirdMax = null;
        Integer secondMax = null;
        Integer firstMax = null;

        /*
            I am using num.euqls(thirdMax) but why don't I use thirdMax.equals(num) because thirdMax is null
            Java tries to execute null.equals(num) which causes: java.lang.NullPointerException
         */
        for(Integer num : nums){
            if (num.equals(thirdMax) || num.equals(secondMax) || num.equals(firstMax)){
                continue;
            }
            if (firstMax==null || firstMax < num){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (secondMax==null || secondMax < num) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (thirdMax == null || thirdMax < num) {
                thirdMax = num;
            }
        }

        if (thirdMax==null){
            return firstMax;
        }
        return thirdMax;
    }
    static void main() {
        int[] nums = {1,1,2};
        System.out.println(thirdMax(nums));
    }
}
