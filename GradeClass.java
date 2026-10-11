public class GradeClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int score = 75;
        
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
        
        score = 45;
        
        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
    
}
