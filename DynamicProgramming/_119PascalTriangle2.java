
import java.util.ArrayList;
import java.util.List;

public class _119PascalTriangle2 {
    class Solution {
        public List<Integer> getRow(int rowIndex) {
            List<Integer> ans = new ArrayList<>();
            ans.add(1);
            if (rowIndex == 0)
                return ans; // [1]
            ans.add(1);
            if (rowIndex == 1)
                return ans; // [1, 1]
            int count = 1; // rowIndex > 1
            while (count <= rowIndex) {
                List<Integer> row = new ArrayList<>();
                row.add(1);
                for (int i = 0; i < count - 1; i++) {
                    row.add(ans.get(i) + ans.get(i + 1)); // calculating new row from previous/ans row
                }
                row.add(1);
                ans = row; // setting previous row as new_row
                count++;
            }
            return ans;
        }
    }
}
