import java.util.ArrayList;

public class Main {
    public static void main (String []args) {
        int [] array = {6, -4, 10, 78, 25, -30, 56, 24, 23, 18, 1, 60};
        int sum = 5000;
        int [] answer = SubFinder.execute(array, sum);
        for (int i = 0; i < answer.length; i++){
            System.out.printf(answer[i] + " ");
        }

    }
}
