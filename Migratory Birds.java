import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;
import static java.util.stream.Collectors.toList;

public class Solution {

    static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        Map<Integer, Integer> fMap =  arr.stream().collect(groupingBy(Function.identity(), summingInt(e -> 1)));
        int max = Collections.max(fMap.values());
        if (max != 1) {
            int val=0;
            for (Entry<Integer, Integer> entry : fMap.entrySet()) {
                if (entry.getValue().equals(max)) {
                    val= entry.getKey();
                    break;
                }
            }
            return val;
        } else {
            return 0;
        }
    }
    }
