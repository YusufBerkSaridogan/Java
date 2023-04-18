
package Exception_handling;

public class Example06 {
    public static void main(String[] args) {
        try{
            aMethod();
        }
        catch(Exception ex){
            System.out.println("Exception");
        }
        System.out.println("finished");
    }
    
    public static void aMethod() throws Exception{
        try{
            throw new Exception();
        }
        finally{
            System.out.println("finally");
        }
    }
    
    
}
