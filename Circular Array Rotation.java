static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int size = a.length;
      int[] arr = new int[size];
      for(int i=0;i<size;i++){
            arr[(k+i)%size] = a[i];
      }
      for(int i=0;i<queries.length;i++){
          queries[i] = arr[queries[i]];
      }
      return queries;
    }
