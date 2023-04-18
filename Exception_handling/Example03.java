package Exception_handling;

public class Example03 {

    public static void main(String[] args) {
        String[] s = {"1", "6", "1g", "10", "d"};
        for (int i = 0; i < s.length; i++) {
        try {            
                int sayi = Integer.parseInt(s[i]);
                System.out.print(sayi + " ");
            
        } catch (NumberFormatException ex) {
            System.out.println("\nHata meydana geldi: " + ex.getMessage());
        }
        }

    }

}
