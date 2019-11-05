import javax.swing.*;
import java.io.File;
import java.util.*;

public class IndexMain {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hit return to continue");//To give time for VisualVM to open

        InvertedIndex index = new InvertedIndex();

        File f = new File("C:\\Users\\t00201097\\Desktop\\DS A CA\\Test");
        List<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));

        index.buildIndex(files);
        
        index.print();  //output index
        index.printIndexHeight(); //outputs the height of the tree

        long sTime =System.currentTimeMillis();
        index.searchAllWords();
        long eTime =System.currentTimeMillis();
        long duration = eTime-sTime;
        System.out.println("Time: " + duration);
    }
}
