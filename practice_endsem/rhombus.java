package practice_endsem;

public class rhombus {
    public static void main(String[] args) {
        int n=3;
        int star=1;
        int space=n-1;
        int row=1;
        int val=1;
        while(row<2*n){
            int i=1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j=1;
            int p=val;
            while (j<=star){
                System.out.print(p+" ");
                if(j<=(star/2)){
                    p++;
                }
                else {
                    p--;
                }
                j++;
            }
            if(row<n){
                star+=2;
                space--;
                val++;
            }
            else {
                star-=2;
                space++;
                val--;
            }
            row++;
            System.out.println();
        }
    }
}
