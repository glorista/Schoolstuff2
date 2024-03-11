package HAufgaben;
import java.util.Scanner;

public class HAufgabe4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte geben Sie die Anzahl der Fächer an: ");
        int anzahl = scanner.nextInt();

        double[][] grades = new double[anzahl][];

        for (int i = 0; i < anzahl; i++) {
            System.out.println("Bitte geben Sie die Anzahl der Noten für Fach " + (i + 1) + " an: ");
            int gradeCount = scanner.nextInt();
            grades[i] = new double[gradeCount];

            System.out.println("Bitte geben Sie die Noten für Fach " + (i + 1) + " ein:");
            for (int j = 0; j < gradeCount; j++) {
                grades[i][j] = scanner.nextDouble();
            }
        }

        System.out.println("Der Notendurchschnitt pro Fach ist: ");
        printAverageGradePerSubject(grades);

        System.out.println("Der Gesamtnotendurchschnitt ist: " + getOverallAverageGrade(grades));
    }

    public static void printAverageGradePerSubject(double[][] grades) {
        for (int i = 0; i < grades.length; i++) {
            double sum = 0;
            for (double grade : grades[i]) {
                sum += grade;
            }
            double average = sum / grades[i].length;
            System.out.println("Fach " + (i + 1) + ": " + average);
        }
    }

    public static double getOverallAverageGrade(double[][] grades) {
        int totalGradeCount = 0;
        double totalSum = 0;

        for (double[] subjectGrades : grades) {
            for (double grade : subjectGrades) {
                totalSum += grade;
                totalGradeCount++;
            }
        }

        return totalSum / totalGradeCount;
    }
}

