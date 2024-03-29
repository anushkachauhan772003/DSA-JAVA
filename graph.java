import java.util.*;
import java.util.LinkedList;
public class graph {
        private LinkedList<Integer>[]adj;
        private int V;
        private int E;
        public graph(int nodes){
            this.V=nodes;
            this.E=0;
            this.adj=new LinkedList[nodes];
            for(int i=0;i<V;i++){
                adj[i]=new LinkedList<>();
            }
        }
    
    public void addEdge(int u,int v){
        this.adj[u].add(v);
        this.adj[v].add(u);
    }
    public void dfs(){
        boolean[]visited=new boolean[V];
        for(int v=0;v<V;v++){
            if(!visited[v]){
                dfs(v,visited);
            }
        }
    }
    public void dfs(int v,boolean[]visited){
        visited[v]=true;
        System.out.println(v+" ");
        for(int w:adj[v]){
            if(!visited[w]){
                dfs(w,visited);
            }
        }
    }
   public static void main(String[]args){
        graph g=new graph(4);
        g.addEdge(0,1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3,0);
        System.out.println(g);
   } 
}
