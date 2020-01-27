 public class Solution {
 static int pageCount(int pages, int page) {
       
        int beg = (page/2);
        int end = 0;
        if(pages%2==1)
            end = (pages-page)/2;
        else
            end = (int) Math.ceil((pages-page)/2.0);
       return Math.min(beg,end);
    }
    }
