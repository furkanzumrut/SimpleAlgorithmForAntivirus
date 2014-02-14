
import com.sun.org.apache.xalan.internal.xsltc.dom.BitArray;
import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import sun.misc.ASCIICaseInsensitiveComparator;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author furkanzumrut
 */
public class antiVirus {

    /**
     * @param args the command line arguments
     */
   

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Boolean found;
        String word = "Controls";
        Path path = Paths.get("/Users/furkanzumrut/Desktop/SetupF.exe");
        //Path path1 = Paths.get("/Users/furkanzumrut/Desktop/d.png");
        byte[] data = Files.readAllBytes(path);
    
        //System.out.print(data.length+"//"); 
        for (int i=0;i<data.length;i++) {
            //data[i] =(byte)( data[i]);
           // System.out.print(data[i]+" " );
            
        }
        String delta = new String(data);
        //System.out.println(delta);
        found = delta.contains(word);
        if(found){
        System.out.println("Virus Var!!");
        }else{System.out.println("Virus Yok!!");}
        

        
        //System.out.println(HexBin.encode(data));
       // Files.write(path1, data, StandardOpenOption.CREATE_NEW);
        
    }
}
