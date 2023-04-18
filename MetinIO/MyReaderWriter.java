/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetinIO;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author FSMBLM1
 */
public class MyReaderWriter implements IReader, IWriter {

    public MyReaderWriter() {

    }

     @Override
    public void oku(String dosyaisim) {
        File file = new File(dosyaisim);
        
        try{
            Scanner data = new Scanner(file);
            
            while(data.hasNext()){
                System.out.print(data.next()+" ");                
            }
            data.close();
        }
        catch(Exception ex){
            System.out.println("Dosya bulunamad? hatas? meydana geldi!!!");
        }
        
        
    }

    @Override
    public void yaz(String dosyaisim, String veri) {
        File file =new File(dosyaisim);
        
        try{
            PrintWriter output = new PrintWriter(file);
            
            output.print(veri);
            output.close();
        }
        catch(Exception ex){
            System.out.println("MyWriter kisminda hata meydana geldi.");
        }
        
    }

}
