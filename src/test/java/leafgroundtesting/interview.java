package leafgroundtesting;


public class interview {
    public static void main(String args[]) {
        int[][] a = new int[4][4];
        int i, j, k = 0;
        for (i = 0; i < 4; i++)
            for (j = 0; j < 4; j++) {
                a[i][j] = k;
                k++;

            }
for(i=0;i<4;i++){
for (j=0;j<4;j++)
    System.out.print(a[i][j] + " ");
    System.out.println();

    }}}

       /* int [] x = {5,10,5,12,13,14,15};
        System.out.println(x.getClass());
        System.out.println(x.length);
        for(int i =0;i<x.length;i++)
            System.out.println(x[i]);
        int[] month_days={31,28,31,30,31,30,31,30,30,31,30,31};
        System.out.println("april has "+month_days[3]+" number of days");
        double result=0.0;

            for (int i = 0; i < month_days.length; i++)

                result = result + month_days[i];
            System.out.println("average of result is " + result / 5);
        */
          /*  int[][] y = new int[4][5];
            int j, k,l=0;
            for (j = 0; j < 4; j++)
                for(k=0;k<5;k++)
                {
                    y[j][k]=l;
                    l++;

                }
        for (j = 0; j < 4; j++){
            for(k=0;k<5;k++)
                System.out.print(y[j][k] + " ");
            System.out.println();

        }*/





