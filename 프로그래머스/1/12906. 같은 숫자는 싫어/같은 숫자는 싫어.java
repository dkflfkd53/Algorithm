// 0~9로 이루어진 수열에서 연속적으로 나타나는 숫자들을 제거해서 return 한다.
// for문으로 배열을 돈다 -> 배열의 요소를 저장한다 -> 다음 요소와 저장되었던 전 요소를 비교한다 -> 숫자가 일치한다면 해당요소를 삭제한다.

import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                list.add(arr[i]);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}