package sept.Task;

public interface TCS_11_Jan {

    public static void main(String[] args) {
        String input ="My Name Is Raj";
        StringBuffer str = new StringBuffer(input);
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
               str.setCharAt(i, Character.toUpperCase(str.charAt(i)));
        } else if (Character.isUpperCase(str.charAt(i))) {
                str.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("Output --->"+str);
    }
}
