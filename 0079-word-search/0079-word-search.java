class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        // Iterate through each cell in the board
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the starting character matches, perform DFS
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, String word, int i, int j, int index) {
        // Base case: If the entire word has been matched
        if (index == word.length()) {
            return true;
        }

        // Check boundaries and character matching
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        // Temporarily mark the current cell as visited
        char temp = board[i][j];
        board[i][j] = '*'; // Marked as visited

        // Explore adjacent cells recursively
        boolean found = dfs(board, word, i + 1, j, index + 1) || // down
                        dfs(board, word, i - 1, j, index + 1) || // up
                        dfs(board, word, i, j + 1, index + 1) || // right
                        dfs(board, word, i, j - 1, index + 1); // left

        // Restore the current cell
        board[i][j] = temp;

        return found;
    }
}
