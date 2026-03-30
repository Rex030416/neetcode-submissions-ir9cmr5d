class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();

        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char val=board[row][col];
                if(board[row][col]=='.') {
                    continue;
                }
                int boxIndex=(row / 3) * 3 + (col / 3);
                if (!rows.containsKey(row)) rows.put(row, new HashSet<>());
                if (rows.get(row).contains(val)) return false;
                rows.get(row).add(val);

                if (!cols.containsKey(col)) cols.put(col, new HashSet<>());
                if (cols.get(col).contains(val)) return false;
                cols.get(col).add(val);

                if (!boxes.containsKey(boxIndex)) boxes.put(boxIndex, new HashSet<>());
                if (boxes.get(boxIndex).contains(val)) return false;
                boxes.get(boxIndex).add(val);

            }
        }

        return true;

    }
}
