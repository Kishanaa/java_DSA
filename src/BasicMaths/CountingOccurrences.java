package BasicMaths;

public class CountingOccurrences {
    static void main() {
        int a = 15153435;
        int occ = 0;

        while (a!=0){
            int b = a%10;
            if (b==3){
                occ++;
            }
            a/=10;
        }
        System.out.println(occ);
    }
}
