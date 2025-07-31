package Lecture_37_10Apr;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeQuestion {
    Scanner sc=new Scanner(System.in);

    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public void tree(){
        root=createTree();
    }

    private Node createTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=createTree();
        }

        boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=createTree();
        }
        return nn;
    }


    public void Display(){
        Display(root);
    }
    private void Display(Node nn){
        if(nn==null){
            return;
        }
        String str="<--"+nn.val+"-->";
        if(nn.left!=null){
            str=nn.left.val+str;
        }
        else {
            str="."+str;
        }
        if(nn.right!=null){
            str=str+nn.right.val;
        }
        else {
            str=str+".";
        }
        System.out.println(str);
        Display(nn.left);
        Display(nn.right);
    }

    public boolean find(int item){
        return find(root,item);
    }

    private boolean find(Node nn,int item){
        if(nn==null){
            return false;
        }
        if(nn.val==item){
            return true;
        }
        boolean left=find(nn.left,item);
        boolean right=find(nn.right,item);
        return left||right;
    }

    public int max(){
        return max(root);
    }

    private int max(Node root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int left=max(root.left);
        int right=max(root.right);
        return Math.max(root.val,Math.max(left,right));
    }

    public int ht(){
        return ht(root);
    }
    private int ht(Node nn){
        if(nn==null) return -1;

        int lh=ht(nn.left);
        int rh=ht(nn.right);

        return Math.max(lh,rh)+1;
    }

    public void PreOrder(){
        PreOrder(root);
        System.out.println();
    }

    private void PreOrder(Node nn){
        if(nn==null){
            return;
        }
        System.out.print(nn.val+" ");
        PreOrder(nn.left);
        PreOrder(nn.right);
    }

    public void InOrder(){
        InOrder(root);
        System.out.println();
    }

    private void InOrder(Node nn){
        if(nn==null){
            return;
        }

        InOrder(nn.left);
        System.out.print(nn.val+" ");
        InOrder(nn.right);
    }


    public void PostOrder(){
        PostOrder(root);
        System.out.println();
    }

    private void PostOrder(Node nn){
        if(nn==null){
            return;
        }

        PostOrder(nn.left);
        PostOrder(nn.right);
        System.out.print(nn.val+" ");
    }

    public void LevelRoot(){
        LevelOrder(root);
    }
    private void LevelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root); //add last
        while (!q.isEmpty()){
            Node n=q.poll();
            System.out.println(n.val+" ");
            if(n.left!=null){
                q.add(n.left);
            }
            if(n.right!=null){
                q.add(n.right);
            }
        }
        System.out.println();
    }
}
