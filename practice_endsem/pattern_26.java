package practice_endsem;

public class pattern_26 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int star=1;
        int space=n-1;
        while (row<=n){
            int val=1;
            int i=1;
            while (i<=space){
                System.out.print("\t");
                i++;
            }
            int j=1;
            int p=val;
            while (j<=star){
                System.out.print(p+"\t");
                if(p<=star/2) p++;
                else p--;
//                p++;
                j++;
            }
            star+=2;
            space--;
            row++;
            System.out.println();
        }
    }
}
