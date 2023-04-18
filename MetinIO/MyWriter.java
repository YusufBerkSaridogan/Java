/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetinIO;

import java.io.File;
import java.io.PrintWriter;

/**
 *
 * @author FSMBLM1
 */
public class MyWriter{

    public MyWriter() {

    }

   
    public void write(String dosyaisim, String veri) {
        File file =new File(dosyaisim);
        
        try{
            PrintWriter output = new PrintWriter(file);
            
            output.print(veri);
            output.flush();
            output.close();
        }
        catch(Exception ex){
            System.out.println("MyWriter kisminda hata meydana geldi.");
        }
        
    }

}
