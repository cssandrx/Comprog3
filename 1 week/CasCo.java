public class CasCo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        double centimeters = 275.5;
        
        int whoMet = (int) (centimeters / 100);
        double rem = centimeters % 100;
        
        System.out.println(centimeters + " cm is equivalent to " + whoMet + 
                " whole meter(s) and " + rem + " cm.");
        
        int baseInt = 45;
        double widDou = baseInt;
        System.out.println("Implicit widening (int to double): " + widDou);
        
        double baseDouble = 99.75;
        int narrowedInt = (int) baseDouble;
        System.out.println("Explicit narrowing (double to int): " + narrowedInt);
    }
}
    

