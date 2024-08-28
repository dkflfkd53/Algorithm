import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int[][] answer = {};
        
        List<int[]> filteredList = Arrays.stream(data)
            .filter(d -> {
                switch(ext) {
                    case "code":
                        return d[0] < val_ext;
                    case "date":
                        return d[1] < val_ext;
                    case "maximum":
                        return d[2] < val_ext;
                    case "remain":
                        return d[3] < val_ext;
                    default:
                        return false;
                }
            })
            .collect(Collectors.toList());

        int[][] resultArray = filteredList.toArray(new int[filteredList.size()][]);

        switch(sort_by) {
            case "code":
                Arrays.sort(resultArray, Comparator.comparingInt(a -> a[0]));
                break;
            case "date":
                Arrays.sort(resultArray, Comparator.comparingInt(a -> a[1]));
                break;
            case "maximum":
                Arrays.sort(resultArray, Comparator.comparingInt(a -> a[2]));
                break;
            case "remain":
                Arrays.sort(resultArray, Comparator.comparingInt(a -> a[3]));
                break;
        }

        return resultArray;
    }
}