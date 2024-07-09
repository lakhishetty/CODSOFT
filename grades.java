import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number of subjects");
        int num = sc.nextInt();

        int[] marks = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.println("enter the marks for subject(out of 100)" + (i + 1));
            marks[i] = sc.nextInt();
        }

        int totalmarks = 0;
        for (int mark : marks) {
            totalmarks = totalmarks + mark;
        }

        double avgpercent = (double) totalmarks / num;

        char grade;
        if (avgpercent >= 90) {
            grade = 'A';
        } else if (avgpercent >= 80) {
            grade = 'B';
        } else if (avgpercent >= 70) {
            grade = 'C';
        } else if (avgpercent >= 60) {
            grade = 'D';
        } else if (avgpercent >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("total marks:" + totalmarks);
        System.out.println("average percentage:" + avgpercent + "%");

        System.out.println("Grade:" + grade);

    }
}