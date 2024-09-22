package sept.Task;

public class Task_18_Sept {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(  --a + a --  + a--); //26
        System.out.println(a); //7

        int b = 10;
        System.out.println(  --b + b++ + b--);//28
        System.out.println(b);//9

        int costprice=100;
        float sellingprice= 105.00f;

        int profit= (int) sellingprice - costprice; //narrowing
        double gain= ((double) profit /costprice)*100;  //widening
        System.out.println(profit);
        System.out.println(gain);

    }


}
