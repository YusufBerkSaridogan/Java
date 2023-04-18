/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetinIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author FSMBLM1
 */
public class MyReader  {

    public MyReader() {

    }

    
    public String oku(String dosyaisim) throws FileNotFoundException {
        File file = new File(dosyaisim);
        
        
            Scanner data = new Scanner(file);
            String veri = "";         
            while(data.hasNext()){
                veri.concat(data.next());
//                System.out.print(data.next()+" ");                
            }            
            data.close();
          
        
        return veri;
    }

}
