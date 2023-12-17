package static2.ex2;

import java.util.Arrays;

public class MathArrayUtils {

    // 인스턴스 생성 막기
    private MathArrayUtils() {}
    public static int sum(int[] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static double average(int[] array){
        return (double) sum(array)/array.length;
    }

    public static int min(int[] array){
        int result = array[0];
        for(int value : array) {
            if(value < result) {
                result = value;
            }
        }
        return result;
    }

    public static int max(int[] array){
        int result = array[0];
        for(int value : array) {
            if(value > result) {
                result = value;
            }
        }
        return result;
    }

}
