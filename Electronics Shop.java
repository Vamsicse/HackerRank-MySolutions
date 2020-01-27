public class Solution {

    static int getMoneySpent(int[] keyboards, int[] pendrives, int s) {
        sort(keyboards);//Descending order
        Arrays.sort(pendrives); //Ascending order
        
        int n = keyboards.length;
        int m = pendrives.length;
        int max = -1;
        for(int i = 0, j = 0; i < n; i++){
            for(; j < m; j++){
                if(keyboards[i]+pendrives[j] > s) break; //Prevent j from incrementing
                if(keyboards[i]+pendrives[j] > max)
                    max = keyboards[i]+pendrives[j];
            }
        }
        return(max);
    }
    private static void sort(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] < a[j]) 
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    }
