 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
 
       int a = integers [0] > integers [1] ? integers [0]: integers [1];
       int b = a > integers [2] ? a : integers [2];
       
       
       return b;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        return Math.max(integers[0],Math.max(integers[1],integers[2]));
    }
}
