     static int[] cutTheSticks(int[] arr) {
        Arrays.sort(arr);
        List<Integer> resultList = new ArrayList<>();
        resultList.add(arr.length);
        while(size(arr)>1){
            int shortValue = getShort(arr);
            arr = deductValue(arr,shortValue);
            int size = size(arr);
            if(size>0) {
                resultList.add(size);
            }
        }
        int[] res = new int[resultList.size()];
        for(int i=0;i<resultList.size();i++){
            res[i] = resultList.get(i);
        }
        return res;
    }

    private static int[] deductValue(int[] arr, int shortValue) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr[i]-=shortValue;
            }
        }
        return arr;
    }

    private static int getShort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                return arr[i];
            }
        }
        return arr[0];
    }

    private static int size(int[] arr){
        int s=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                s++;
            }
        }
        return s;
    }
