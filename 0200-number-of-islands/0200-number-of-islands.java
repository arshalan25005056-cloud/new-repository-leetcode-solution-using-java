class Solution {

    static void dfs(int r,int c,boolean[][] vis,char[][] adj){
        vis[r][c]=true;
        int m = adj.length;
        int n = adj[0].length;
        //top
        if(r-1>=0 && vis[r-1][c]==false && adj[r-1][c]=='1') dfs(r-1,c,vis,adj);

        //bottom
        if(r+1<m && vis[r+1][c]==false && adj[r+1][c]=='1') dfs(r+1,c,vis,adj);

        //left
        if(c-1>=0 && vis[r][c-1]==false && adj[r][c-1]=='1') dfs(r,c-1,vis,adj);
        
        //right
        if(c+1<n && vis[r][c+1]==false && adj[r][c+1]=='1') dfs(r,c+1,vis,adj);
    }
    public int numIslands(char[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int count = 0;
        boolean[][] vis = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!vis[i][j] && arr[i][j]=='1'){
                    dfs(i,j,vis,arr);
                    count++;
                }
            }
        }
        return count;
    }
}