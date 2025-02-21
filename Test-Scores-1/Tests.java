import java.text.DecimalFormat;

public class Tests {
    public static void main(String[] args) {
        float testscore1 = 99f;
        float testscore2 = 65.3f;
        float testscore3 = 44f;
        float testaverage = (testscore1 + testscore2 + testscore3) / 3;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Test Score 1: " + 99);
        System.out.println("Test Score 2: " + 65.3);
        System.out.println("Test Score 3: " + 44);
        System.out.println("The average of 3 test scores is: " + df.format(testaverage));
    }
}
