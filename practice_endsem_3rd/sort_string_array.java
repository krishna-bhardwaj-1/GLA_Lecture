package practice_endsem_3rd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sort_string_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        ArrayList<String> st=new ArrayList<>();
        for(int i=0;i<n;i++){
            st.add(sc.nextLine());
        }
        Collections.sort(st);
        String search=sc.nextLine();
        int pos=st.indexOf(search)+1;
        if(pos>0){
            System.out.println();
        }
        else {
            System.out.println(search);
        }
        for(String s:st){
            System.out.println(s);
        }
    }
}
