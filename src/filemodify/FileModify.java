/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filemodify;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
        
        try(BufferedReader myReader = new BufferedReader(new FileReader(new File("/Users/ivasquez/NetBeansProjects/Filereader/FileModify/src/filemodify/BoyNames.txt"))))
        {
            BufferedWriter myWriter = new BufferedWriter(new FileWriter(new File("/Users/ivasquez/NetBeansProjects/Filereader/FileModify/src/filemodify/BoyList.txt")));
            StringBuilder fileContent = new StringBuilder();
            String line = myReader.readLine();
            
            
            while(line != null) 
            {
                Mylist.add(line);
                fileContent.append(line);
                fileContent.append(System.lineSeparator());
                line = myReader.readLine();
                
                
            }
            Collections.sort(Mylist);
            
            for (Object element : Mylist){
                System.out.println(element);
            }
            myWriter.write(Mylist.toString());
                myWriter.close();
        }
        catch(IOException ioe)
        {
            
            System.out.println("not readable");
            System.out.println(ioe.toString());
            System.exit(0);
        }
        
    }
    
}
