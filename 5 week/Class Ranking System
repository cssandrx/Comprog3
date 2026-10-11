import java.util.Arrays;

class Student {
    String name;
    int[] quizzes;
    double average;
    int rank;

    public Student(String name, int[] quizzes) {
        this.name = name;
        this.quizzes = quizzes;
        int sum = 0;
        for (int score : quizzes) {
            sum += score;
        }
        this.average = (double) sum / quizzes.length;
    }
}

public class Ranking {
    public static void main(String[] args) {
        String[] names = {"Esther", "Janlorenz", "Althea", "Patrick", "Marco"};
        int[][] rawQuizData = {
            {85, 90, 92, 88},
            {70, 75, 72, 78},
            {95, 92, 96, 94},
            {85, 90, 92, 88}, 
            {60, 65, 70, 68}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], rawQuizData[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1 - i; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        int currentRank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average == students[i - 1].average) {
                students[i].rank = students[i - 1].rank;
            } else {
                students[i].rank = currentRank;
            }
            currentRank++;
        }

        System.out.printf("%-6s %-10s %-10s %-25s\n", "Rank", "Name", "Average", "Quizzes");
        for (Student s : students) {
            System.out.printf("%-6d %-10s %-10.2f %-25s\n", s.rank, s.name, s.average, Arrays.toString(s.quizzes));
        }

        String searchTarget = "Diana";
        int searchedRank = linearSearchRank(students, searchTarget);
        if (searchedRank != -1) {
            System.out.println("\nStudent " + searchTarget + " was found at rank " + searchedRank + ".");
        } else {
            System.out.println("\nStudent " + searchTarget + " was not found.");
        }
    }

    public static int linearSearchRank(Student[] students, String targetName) {
        for (Student s : students) {
            if (s.name.equalsIgnoreCase(targetName)) {
                return s.rank;
            }
        }
        return -1;
    }
}
