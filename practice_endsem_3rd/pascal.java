package practice_endsem_3rd;

public class pascal {
    public static void main(String[] args) {
        int n=5;
        int star=1;
        int row=0;
        while (row<n){
            int i=0;
            int ncr=1;
            while (i<star){
                System.out.print(ncr+" ");
                ncr=((row-i)*ncr)/(i+1);
                i++;
            }
            row++;
            star++;

            System.out.println();
        }
    }
}
