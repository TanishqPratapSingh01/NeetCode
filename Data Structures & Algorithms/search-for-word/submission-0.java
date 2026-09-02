class Solution {
    public boolean backtrack(char board[][], int i, int j, int ind, String word){
        if (ind == word.length()){ return true; }
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (board[i][j] != word.charAt(ind)) return false;
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = backtrack(board,i+1,j,ind+1,word) || backtrack(board,i-1,j,ind+1,word) || backtrack(board,i,j+1,ind+1,word) || backtrack(board,i,j-1,ind+1,word);
        board[i][j] = temp;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        for (int i=0; i<board.length; i++){
            for (int j=0; j<board[0].length; j++){
                if (backtrack(board,i,j,0,word)) return true;
            }
        }
        return false;
    }
}
