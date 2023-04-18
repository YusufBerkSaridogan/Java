
package Exception_handling;

public class Example05 {
    public static void main(String[] args) {
        try{
            System.out.println("Hello");
            throwit();
        }
        catch(Exception ex){
            System.out.println("caught");
        }
        finally{
            System.out.println("finally");
        }
        System.out.println("finished");     
    }
    
    public static void throwit(){
        System.out.println("throwit");
        throw new RuntimeException();
        
    }
    
}
