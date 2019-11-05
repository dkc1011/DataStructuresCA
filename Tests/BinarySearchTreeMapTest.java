import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeMapTest {

    @Test
    void keySet1()
    {
        BinarySearchTreeMap<String, Integer> nameAndAge = new BinarySearchTreeMap<>();

        Set<String> keys = nameAndAge.keySet();

        assertTrue(keys.isEmpty());
    }

    @Test
    void keySet2()
    {
        BinarySearchTreeMap<String, Integer> nameAndAge = new BinarySearchTreeMap<>();

        nameAndAge.put("Wilhelm", 45);

        Set<String> keys = nameAndAge.keySet();

        String name = "Wilhelm";

        assertTrue(keys.contains(name));
    }

    @Test
    void height1() {
        BinarySearchTreeMap<String, Integer> nameAndAge = new BinarySearchTreeMap<>();

        //Checks height against an empty tree
        int expected = 0;
        int actual = nameAndAge.height();

        assertEquals(expected, actual);
    }

    @Test
    void height2() {
        BinarySearchTreeMap<String, Integer> nameAndAge = new BinarySearchTreeMap<>();

        nameAndAge.put("Wilhelm", 45);
        nameAndAge.put("Cassidy", 22);
        nameAndAge.put("Jacky", 19);

        int expected = 3;
        int actual = nameAndAge.height();

        assertEquals(expected, actual);
    }

    @Test
    void height3() {
        BinarySearchTreeMap<String, Integer> nameAndAge = new BinarySearchTreeMap<>();

        nameAndAge.put("Wilhelm", 45);
        nameAndAge.put("Cassidy", 22);
        nameAndAge.put("Jacky", 19);
        nameAndAge.put("Mike", 45);
        nameAndAge.put("Allen", 26);
        nameAndAge.put("Stacy", 12);
        nameAndAge.put("Andre", 17);
        nameAndAge.put("Sean", 74);
        nameAndAge.put("Philip", 31);

        int expected = 7;
        int actual = nameAndAge.height();

        assertEquals(expected, actual);
    }




}