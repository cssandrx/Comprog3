import java.util.Arrays;
public class Studentscore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 65, 90, 88, 76, 95};

        int target = 90;
        int Index = -1;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                Index = i;
                break;
            }
        }

        if (Index != -1) {
            System.out.println("Target " + target + " was found at index " + Index + ".");
        } else {
            System.out.println("Target " + target + " was not found in the array.");
        }

        int[] Sscores = Arrays.copyOf(scores, scores.length);
        Arrays.sort(Sscores);

        System.out.println("\nOriginal array: " + Arrays.toString(scores));
        System.out.println("Sorted copy:    " + Arrays.toString(Sscores));
    }
    
}
