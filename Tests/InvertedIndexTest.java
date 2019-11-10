import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvertedIndexTest {

    @Test
    void search() {
        InvertedIndex index = new InvertedIndex();

        File f = new File("C:\\Users\\Daragh\\Desktop\\DataStructuresCA\\Test1");
        List<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));

        index.buildIndex(files);

        List<File> results = new ArrayList<>();

        List<File> actual;
        File file1 = new File("C:\\Test\\20ThousandLeagues.txt");
        File file2 = new File ("C:\\Test\\Dracula.txt");
        File file3 = new File ("C:\\Test\\WarOfTheWorlds.txt");
        actual = index.search("Nautilus");

        assertEquals("[C:\\Test\\20ThousandLeagues.txt]", actual.toString());

        results.add(file1);
        results.add(file2);
        results.add(file3);

        actual = index.search("the");

        assertEquals(results,actual);

    }
}