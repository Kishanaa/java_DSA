package leetCode;

public class StringCompression443 {
    static int compress(char[] chars) {
        int readIndex = 0;
        int writeIndex = 0;

        while (readIndex < chars.length){
            char currentChar = chars[readIndex];
            int count = 0;
            while (readIndex < chars.length && currentChar == chars[readIndex]){
                count++;
                readIndex++;
            }
            chars[writeIndex] = currentChar;
            writeIndex++;
            if (count > 1){
                String countString = String.valueOf(count);
                for (char value : countString.toCharArray()){
                    chars[writeIndex] = value;
                    writeIndex++;
                }
            }
        }
        return writeIndex;
    }
    static void main() {
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));

    }
}
