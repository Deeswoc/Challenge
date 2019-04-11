import java.util.ArrayList;

public class mainClass {
    public static void main(String args[] ){
        int[] cornbeef = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        ArrayList<Integer> answer = solution(9, cornbeef);
        for(Integer x:answer) {
            System.out.println(x);
        }
    }

    static ArrayList<Integer> solution(int k, int[] array) {
        ArrayList<Integer> outPut = new ArrayList<Integer>();
        int series =0;
        int total;
        int min = 0, max = 0, x = 0, y = 0;
        while(series!=k) {
            while(series<k) {
                series += array[max];
                max++;
            }
            while(series>k) {
                series -= array[min];
                min++;
            }
        }
        min++;
        for(; min <=max; min++) {
            outPut.add(min);
        }
        return outPut;
    }
}
