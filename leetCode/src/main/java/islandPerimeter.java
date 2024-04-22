public class islandPerimeter {
    public static void main(String[] args) {
        int[][] nums = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        int[][] nums2 = {{1}};
        int[][] nums3 = {{0, 1}};

        System.out.println(islandPerimeter(nums3));
    }

    public static int islandPerimeter (int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {             // i - количество строк 1
            for (int y = 0; y < grid[i].length; y++) {      // y - количество столбцов 2
                if (grid[i][y] == 1) {
                    result += 4;
                    if (i != 0 && grid[i-1][y] == 1) {
                        result -= 1;
                    };
                    if (y != 0 && grid[i][y-1] == 1) {
                        result -= 1;
                    };
                    if (i != grid.length - 1 && grid[i+1][y] == 1) {
                        result -=1;
                    };
                    if (y != grid[i].length - 1 && grid[i][y+1] == 1) {
                        result -=1;
                    };
                }
            }
        }
        return result;
    }
}