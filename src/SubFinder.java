import java.util.ArrayList;

public class SubFinder {


    //this method initializes the validate method, which does the rest of the work thanks to recursion
    public static int[] execute(int [] ary, int sum){
        return validate(ary, sum, 1);
    }


    public static int[] validate(int [] ary, int sum, int window){
        int[] tempAry = new int[window];

        //recursion control statement
        if (window > ary.length) { //if window has outgrown the array
            return tempAry; //recursion breaks, returning an empty array of length = window
        }
        else {
            for (int i = 0; (i + window) < ary.length; i++) {
                int summation = 0;
                for (int k = 0; k < window; k++) {
                    summation += ary[i + k];
                    tempAry[k] = ary[i + k];
                }
                if (summation == sum) {
                    return tempAry;
                }
            }
            return validate (ary, sum, window+1);
        }

    }

}
