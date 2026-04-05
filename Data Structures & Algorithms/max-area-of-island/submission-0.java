class Pair {
    int first , second ; 
    public Pair(int first , int second ) { this.first = first ; this.second = second ; }
}
class Solution {
    public int maxArea(int row , int col , int vis[][] , int grid[][]) {
        vis[row][col] = 1 ;
        Queue<Pair> q = new LinkedList<Pair>() ; 
        q.add(new Pair(row,col)) ; 
        int n = grid.length ; 
        int m = grid[0].length ; 
        int rowa[] = {-1,0,1,0} ; 
        int cola[] = {0,1,0,-1} ; 
        int area =  1 ; 
        while (!q.isEmpty()) {
            int r = q.peek().first ; 
            int c = q.peek().second ; 
            q.remove() ; 
            for (int i = 0 ; i < 4 ; i++ ) {
                int nrow = r + rowa[i] ; 
                int ncol = c + cola[i] ; 
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 1 ) {
                    vis[nrow][ncol] = 1 ; 
                    q.add(new Pair(nrow,ncol)) ; 
                    area++ ; 
                }
            }
        }
        return area ; 
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length ; 
        int m = grid[0].length ; 
        int vis[][] = new int[n][m] ; 
        
        int count = 0 ; 
        for (int i = 0 ; i < n ; i++ ) {
            for (int j = 0 ; j < m ; j++ ) {
                if (grid[i][j] == 1 && vis[i][j] == 0 ) {
                    int area = maxArea(i,j,vis,grid) ; 
                    count = Math.max(area,count) ; 
                }
            }
        }
        return count ; 
    }
}
