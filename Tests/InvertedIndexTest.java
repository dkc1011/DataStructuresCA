import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvertedIndexTest {

    @Test
    void search() {
        JOptionPane.showMessageDialog(null, "Hit return to continue");//To give time for VisualVM to open

        InvertedIndex index = new InvertedIndex();

        File f = new File("C:\\Users\\t00201097\\Desktop\\DS A CA\\Test1");
        List<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
    }
}