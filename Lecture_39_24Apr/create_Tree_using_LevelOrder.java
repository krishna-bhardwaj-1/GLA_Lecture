package Lecture_39_24Apr;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class create_Tree_using_LevelOrder {
    class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }

    private Node root;

    public create_Tree_using_LevelOrder(){
        createTree();
    }

    private void createTree(){
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        Node nn=new Node(e);
        Queue<Node> q=new LinkedList<>();
        q.add(nn);
        while (!q.isEmpty()){
            Node rv=q.poll();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
                Node n=new Node(c1);
                rv.left=n;
                q.add(n);
            }
            if(c2!=-1){
                Node n=new Node(c2);
                rv.right=n;
                q.add(n);
            }
        }
    }
}
