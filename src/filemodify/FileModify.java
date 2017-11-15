/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemodify;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author ivasquez
 */
public class FileModify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList Mylist = new ArrayList();
        
        try(BufferedReader myReader = new BufferedReader(new FileReader(new File("/Users/ivasquez/Documents/BoyNames.txt"))))
        {
            StringBuilder fileContent = new StringBuilder();
            String line = myReader.readLine();
            
            while(line != null) 
            {
                fileContent.append(line);
                fileContent.append(System.lineSeparator());
                line = myReader.readLine();
            }
           //fileContent.toString();
           Mylist.add(fileContent);
           Collections.sort(Mylist);
           System.out.println(Mylist);
        }
        catch(IOException ioe)
        {
            
            System.out.println("not readable");
            System.exit(0);
        }
        
    }
    
}
