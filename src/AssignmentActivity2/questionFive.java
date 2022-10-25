package AssignmentActivity2;

public class questionFive {
    public static void main(String[] args) {
      int[] a = new int[10];
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        a[4]=4;
        a[5]=5;
        a[6]=6;
        a[7]=7;
        a[8]=8;
        a[9]=9;

        int total = 10;
        int sum = 0;
        for(int i = 0; i<10; i++) {
            sum = sum + i;
            total = i%10;
            System.out.print(total);

//definitely need help with this one

        }

    }
}
