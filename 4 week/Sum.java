public class Sum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] inputSequence = {10, -5, 20, -1, 15};
        int total = 0;
        int index = 0;

        while (inputSequence[index] != -1) {
            total += inputSequence[index];
            index++;
        }

        System.out.println("Final Total: " + total);
    }
}
