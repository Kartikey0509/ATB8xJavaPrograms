package sept.Task;

public class Task_10Oct_Nisum {
    public static void main(String[] args) {
        //Input string = Robert Schul Paswan
        //Output string =R.S.Paswan
        String str ="Robert Schul Paswan";
        String s= str.replace(" ", "");

         String str1= s.substring(0).replace("obert", ".");
        System.out.println(str1);


        String str2 = str1.substring(0,3);
        System.out.println(str2);

        String str3 = str1.substring(7);
        System.out.println(str3);

        System.out.println(str2+"."+str3);

    }
}
