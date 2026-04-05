class Pair {
    int first ; 
    int second ; 
    public Pair(int first , int second ) {
        this.first = first ; 
        this.second = second ; 
    }
}
class Solution {
    public void bfs(int row , int col , int vis[][] , char grid[][]) {
        int n = grid.length ; 
        int m = grid[0].length ; 
        vis[row][col] = 1 ; 
        Queue<Pair> q = new LinkedList<Pair>() ; 
        q.add(new Pair(row,col)) ; 
        int rowa[] = {-1,0,1,0} ; 
        int cola[] = {0,1,0,-1} ; 
        while (!q.isEmpty()) {
            int r = q.peek().first ; 
            int c = q.peek().second ; 
            q.remove() ; 
            for (int i = 0 ; i < 4 ; i++ ) {
                int nrow = r + rowa[i] ; 
                int ncol = c + cola[i] ; 
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    vis[nrow][ncol] = 1 ; 
                    q.add(new Pair(nrow,ncol)) ; 
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0 ; 
        int n = grid.length ; 
        int m = grid[0].length ; 
        int vis[][] = new int[n][m] ; 
        for (int i= 0 ; i < n ; i++ ) {
            for (int j = 0 ; j < m ; j++ ) {
                if (vis[i][j] == 0 && grid[i][j] == '1') {
                    bfs(i,j,vis,grid) ; 
                    count++ ; 
                }
            }
        }
        return count ; 
    }
}
