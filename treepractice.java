import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class treepractice {

   static class Node{
    Node left;
    Node right;
    int data;
        public Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
   }
   static class BinaryTree{
    static int idx=-1;
    public static Node buildTree(int nodes[]){
        if(nodes[idx]==-1)
        return null;
        Node newNode=new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);

        return newNode;
        
    }
   
   }
   public static int countNode(Node root){
    if(root==null)
    return 0;
    int left=countNode(root.left);
    int right=countNode(root.right);

    return left+right+root.data;

   }
       public static void main(String[]args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.buildTree(nodes);
        System.out.println(countNode(root));


    }
}
