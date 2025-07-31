package codeforces;

import java.util.Scanner;

public class AntonAndPolyhedron {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int faces=0;
        while (n-->0){
            String s=sc.next();
            if(s.equals("Tetrahedron")) faces+=4;
            else if(s.equals("Cube")) faces+=6;
            else if(s.equals("Octahedron")) faces+=8;
            else if(s.equals("Dodecahedron")) faces+=12;
            else faces+=20;
        }
        System.out.println(faces);
    }
}
