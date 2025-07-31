package Lecture_36_09Apr;

import java.util.Scanner;

public class BinaryTree {
    Scanner sc=new Scanner(System.in);

    class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;

    public BinaryTree(){
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
}
