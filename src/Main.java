
import java.util.*;

public class Main {


    public static List<Integer> rPositions = new ArrayList<Integer>();
    public static List<Integer> lPositions = new ArrayList<Integer>();

    public static String solution(long[] arr) {

        if (arr.length == 0 || arr.length == 1) {
            return "";
        }
        long rValues = 0l;
        long lValues = 0l;
        if (arr.length >= 2) {
            levelInsert(arr);
        }
        for (int pos : rPositions) {
            rValues += arr[pos];
        }
        for (int pos : lPositions) {
            lValues += arr[pos];
        }

        if (rValues > lValues) {
            return "Right";
        }
        return "Left";

    }

    //arr is at least two
    public static void levelInsert(long[] arr) {
        int index = 0;
        int i = 0;
        while (i < arr.length / 2) {
            index = 2 * i + 1;
            if (i < arr.length - 1) {
                System.out.println("Add " + index);
                lPositions.add(index);
            }
            index = 2 * i + 2;
            if (index < arr.length - 1) {
                System.out.println("Add " + index);
                rPositions.add(index);
            }

            i++;
        }

    }

    public static void main(String[] args) {

        long[] test = new long[]{3, 6, 27, 9, -1, 10};
        System.out.println(solution(test));
    }

}


