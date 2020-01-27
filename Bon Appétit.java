public class Solution {

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int charged) {
                Integer total=bill.stream().collect(Collectors.summingInt(Integer::intValue));
        int actualShare = total/2;
        int adjShare = (total-bill.get(k))/2;
        int diff=actualShare-adjShare;
        if(adjShare==charged){
            System.out.println("Bon Appetit");
        }
        else{
            System.out.println(diff);
        }
    }
}
