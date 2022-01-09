public class _1041RobotBoundedInCircle {
    class Solution {
        public boolean isRobotBounded(String instructions) {
            if (instructions.length() == 0)
                return false;
            int x = 0, y = 0;
            String dir = "North";
            for (char c : instructions.toCharArray()) {
                if (c == 'G') {
                    if (dir.equals("North"))
                        y++;
                    else if (dir.equals("South"))
                        y--;
                    else if (dir.equals("East"))
                        x++;
                    else
                        x--;
                } else if (c == 'L') {
                    if (dir.equals("North"))
                        dir = "West";
                    else if (dir.equals("South"))
                        dir = "East";
                    else if (dir.equals("East"))
                        dir = "North";
                    else
                        dir = "South";
                } else if (c == 'R') {
                    if (dir.equals("North"))
                        dir = "East";
                    else if (dir.equals("South"))
                        dir = "West";
                    else if (dir.equals("East"))
                        dir = "South";
                    else
                        dir = "North";
                }
            }
            if (x == 0 && y == 0)
                return true;
            if (dir.equals("North"))
                return false;
            return true;
        }
    }
}
