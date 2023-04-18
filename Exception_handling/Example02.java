
package Exception_handling;



public class Example02 {
    public static void main(String[] args) {
          int[] d1 = {1, 2, 3, 4, 5};
        int[] d2 = {5, 2, 1};

        diziToplama(d1, d2);
        
    }
    public static void diziToplama(int[] dizi1, int[] dizi2) {
        int[] toplam = new int[dizi1.length];
        try {
            for (int i = 0; i < dizi1.length; i++) {
                toplam[i] = (dizi1[i] + dizi2[i]);
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exeption: " + ex);

        }
        for (int i = 0; i < toplam.length; i++) {
            System.out.print(toplam[i]+" ");
        }
    }
    
}
