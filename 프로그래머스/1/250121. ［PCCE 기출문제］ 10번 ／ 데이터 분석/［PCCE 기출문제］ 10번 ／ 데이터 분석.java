import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        ArrayList<int[]> answer = new ArrayList<>();
        
        for (int i=0; i<data.length; i++) {
            if (ext.equals("code")) {
                if (data[i][0] < val_ext) {
                    answer.add(data[i]);
                }
            }
            else if (ext.equals("date")) {
                if (data[i][1] < val_ext) {
                    answer.add(data[i]);
                }
            } else if (ext.equals("maximum")) {
                if (data[i][2] < val_ext) {
                    answer.add(data[i]);
                }
            } else {
                if (data[i][3] < val_ext) {
                    answer.add(data[i]);
                }
            }
        }
        
        if (sort_by.equals("code")) {
            answer.sort(Comparator.comparingInt(arr -> arr[0]));
        } else if (sort_by.equals("date")) {
            answer.sort(Comparator.comparingInt(arr -> arr[1]));
        } else if (sort_by.equals("maximum")) {
            answer.sort(Comparator.comparingInt(arr -> arr[2]));
        } else {
            answer.sort(Comparator.comparingInt(arr -> arr[3]));
        }
        
        
        return answer.toArray(new int[answer.size()][]);
    }
}