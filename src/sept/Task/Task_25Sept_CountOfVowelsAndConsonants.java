package sept.Task;

public class Task_25Sept_CountOfVowelsAndConsonants {
    public static void main(String[] args) {
       int vcount =0;
       int consCount =0;
        String str ="pramod";

        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' ||  str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
                vcount++;
            else {
                consCount++;
            }
        }
        System.out.println("Count of vowels in Pramod is :" +vcount);
        System.out.println("Count of vowels in Pramod is :" +consCount);
        }
        }



