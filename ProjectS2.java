import java.util.Scanner;
public class ProjectS2 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String[] nameStudent = new String[5];
            int[] greadStudent = new int[5];
            AddStudent(input, nameStudent, greadStudent);
            Student(nameStudent, greadStudent);
            System.out.println("Average student grades : " + AverageGreadStudent(greadStudent));

        } catch (ArithmeticException error) {
            System.out.println("error divid by 0");
        }
    }

    public static void AddStudent(Scanner input, String[] nameStudent, int[] greadStudent) {
        System.out.println("Welcome");

        System.out.println("Please enter 5 student names: ");
        for (int i = 0; i < nameStudent.length; i++) {
            nameStudent[i] = input.next();
        }
        System.out.println("Please enter 5 student greads: ");
        for (int i = 0; i < greadStudent.length; i++) {
            greadStudent[i] = input.nextInt();
        }
    }

    public static void Student(String[] nameStudent, int[] greadStudent) {
        System.out.println("=================> Students <=================");
        System.out.println("======== name ============== gread ============");
        for (int i = 0; i < nameStudent.length; i++) {
            System.out.println("======== " + nameStudent[i] + "============== " + greadStudent[i] + " ============");
        }
    }

    public static double AverageGreadStudent(int[] greadStudent) {
        int total = 0;
        for (int i = 0; i < greadStudent.length; i++) {
            total += greadStudent[i];
        }
        double Avg = total / greadStudent.length;
        
        return Avg;
    }
}
