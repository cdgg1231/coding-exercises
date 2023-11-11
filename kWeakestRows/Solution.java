import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

     List <int[]> rowStrengths = new ArrayList<>();

           //control the loop;  condition;  increment +1 after each
     for (int i=0; i < mat.length; i++){
        int count = 0;
        for (int j = 0; j < mat[i].length; j++){
            if (mat[i][j] ==1){
                count ++;
            }
            else{
                break; //soldiers are sorted in the beginning, break early
            }
        }
            rowStrengths.add(new int[]{i, count});  // not a return just building the List.
        }

            //Now sort incase of 1st index being equal.

            Collections.sort(rowStrengths, (a,b) -> {
                if(a[1] == b[1]){
                    return a[0] - b[0];    //smallest index first
                }
                return a[1] - b[1];  //else sort by count


            });

        int[] result = new int[k];
        for (int i = 0; i< k; i++){
            result[i] = rowStrengths.get(i)[0];
        }
        return result;

     }


    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;

        Solution test = new Solution();
        int[] result = test.kWeakestRows(mat, k);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
