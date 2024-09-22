package sept.Task;

public class Task_Triangle_Classifier {
    public static void main(String[] args) {
        int s1=10, s2=10, s3=10;
        if((s1==s2) && (s2==s3)){
            System.out.println("Equilateral Triangle");
        } else if ((s1==s2)||(s1==s3)|| (s2==s3)) {
            System.out.println("Isosceles Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }
    }

}
