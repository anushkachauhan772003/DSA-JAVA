//count of tree;
//sum of tree node;
//height of tree;
import java.util.*;
import java.util.LinkedList;
public class treeds {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1)
            return null;

            Node newNode=new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root==null)
        return;
        System.out.print(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        if(root==null)
        return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

public static void postorder(Node root){
    if(root==null)
    return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
}
public static void levelOrder(Node root){
if(root==null)
return;
Queue<Node>q=new LinkedList<>();

q.add(root);
q.add(null);
while(!q.isEmpty()){
    Node currNode=q.remove();
    if(currNode==null){
        System.out.println();
        if(q.isEmpty())
        break;
        else
        q.add(null);
    }
    else{
        System.out.print (currNode.data+" ");
        if(currNode.left!=null){
            q.add(currNode.left);
        }
        if(currNode.right!=null)
        q.add(currNode.right);
    }
}

}
public static int countNode(Node root){
    if(root==null)
    return 0;
    int left=countNode(root.left);
    int right=countNode(root.right);

    return left+right+1;
}
public static int sumOfNodes(Node root){
    if(root==null)
    return 0;
    int left=sumOfNodes(root.left);
    int right=sumOfNodes(root.right);
    return left+right+root.data;
}

public static int heightTree(Node root){
    if(root==null)
    return 0;
    int left=heightTree(root.left);
    int right=heightTree(root.right);

    return 1+Math.max(left,right);

}
public static int diameter(Node root){
    if(root==null)
    return 0;
    int dia1=diameter(root.left);
    int dia2=diameter(root.right);
    int dia3=heightTree(root.left)+heightTree(root.right)+1;

    return Math.max(dia3,Math.max(dia1,dia2));

}
static class treeInfo{
    int ht;
    int diam;

    treeInfo(int ht,int diam){
         this.ht=ht;
         this.diam=diam;
    }
}
public static treeInfo diameter1(Node root){
    if(root==null)
    return new treeInfo(0, 0);

    treeInfo left=diameter1(root.left);
    treeInfo right=diameter1(root.right);

    int myheight=Math.max(left.ht,right.ht)+1;

    int dia1=left.diam;
    int dia2=right.diam;
    int dia3=left.ht+right.ht+1;
    int myDiam=Math.max(Math.max(dia1,dia2),dia3);

    treeInfo myInfo=new treeInfo(myheight,myDiam);

    return myInfo;

}

//subtree of another tree

    public static void main(String[]args){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree(); 
        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
       
       levelOrder(root);
       System.out.println(countNode(root));
       System.out.println(sumOfNodes(root));
       System.out.println(heightTree(root));
       System.out.println(diameter(root));
       System.out.println(diameter1(root).diam);
    }
}
