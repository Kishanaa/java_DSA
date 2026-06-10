package searching;

public class AggressiveCows {

    static int distance(int[] positions, int cows){
        int ans = 0;
        int minDistance = 0;
        int maxDistance = 0;

        for (int position : positions){
            maxDistance = Math.max(maxDistance, position);
        }

        while (minDistance<=maxDistance){
            int midDistance = minDistance + (maxDistance - minDistance)/2;

            if (distanceCondition(positions, cows, midDistance)){
                ans = midDistance;
                minDistance = midDistance + 1;
            }else{
                maxDistance = midDistance - 1;
            }
        }

        return ans;
    }



    private static boolean distanceCondition(int[] positions, int cows, int midDistance) {
        int n = positions.length - 1;
        int lastPosition = positions[0];

        for (int i = 0; i <= n; i++){

            if (( positions[i]-lastPosition)>=midDistance){
                cows--;
                lastPosition = positions[i];
                if (cows==1){
                    return true;
                }
            }
        }

        return false;
    }

    private static void sort(int[] positions){
        int n = positions.length - 1;

        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= n-i-1; j++){
                if (positions[j]>positions[j+1]){
                    int temp = positions[j+1];
                    positions[j+1] = positions[j];
                    positions[j] = temp;
                }
            }
        }
    }

    static void main() {
        int[] positions = {6,4,3,16,20,7,18,10};

        int cows = 5;

        sort(positions);
        System.out.println(distance(positions, cows));

    }
}
