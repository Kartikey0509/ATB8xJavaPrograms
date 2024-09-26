package sept.Task;

public class Task_25Sept_Table {
    public static void main(String[] args) {
       // Table of number n = 10, print table with For or while.
        int n=10;
        for (int i=1; i<=10;i++){
            System.out.printf("%d * %d = %d", n, i, n*i);
            System.out.println();
        }
    }
}
