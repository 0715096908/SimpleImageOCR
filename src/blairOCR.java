//Tony Okoth
//blairt371.dev@gmail.com

//import the libraries
import java.io.File;
import javax.swing.JOptionPane;
import net.sourceforge.tess4j.*;

public class blairOCR {

    public static void main(String[] args) {
        //Set the path to the image to be recognized
        File imageFile = new File("C:/Users/BLAIRMAN/Desktop/tony.png");
         //Interface Mapping
        ITesseract instance = new Tesseract();
      
        //wrap the result within a try catch block
        try {
            String result = instance.doOCR(imageFile);
            JOptionPane.showMessageDialog(null, result);
            //System.out.println(result);
        } catch (TesseractException e) {
            System.err.println(e.getMessage());
        }
    }
}