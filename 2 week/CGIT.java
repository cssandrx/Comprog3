public class CGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        double balance = 1000.0;
        balance += 250.0;
        System.out.println(balance);
        balance *= 1.05;
        System.out.println(balance);
        balance += 500.0;
        System.out.println(balance);

        int count = 5;
        System.out.println(count++);
        System.out.println(count);

        count = 5;
        System.out.println(++count);
        System.out.println(count);
    }
}
