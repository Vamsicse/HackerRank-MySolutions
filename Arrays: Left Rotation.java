public class Solution {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
           
           if(d<1){
               return a;
           }
           int size=a.length;
           int result[] = new int[size];
           for(int i=0; i<a.length;i++){
               int curr = i+d;
               result[i] = a[curr%size];
           }
       return result;
    }
}
