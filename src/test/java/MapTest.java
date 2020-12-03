import bstu.map.Map;
import bstu.map.treemap.TreeMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapTest {

    @Test
    @DisplayName("size() empty")
    public void sizeTest() {
        Map<Integer, Integer> a = new TreeMap<>();
        Assertions.assertEquals(0, a.size());
    }

    @Test
    @DisplayName("size() not empty")
    public void sizeTest5() {
        Map<Integer, Integer> a = new TreeMap<>();
        a.put(10, 100);
        a.put(11, 100);
        a.put(10, 99);
        a.put(101, 99);
        Assertions.assertEquals(3, a.size());
    }

    @Test
    @DisplayName("put()/get()")
    public void putTest() {
        Map<Integer, Integer> a = new TreeMap<>();
        a.put(10, 100);
        Assertions.assertEquals(100, a.get(10));
    }

    @Test
    @DisplayName("isEmpty()")
    public void isEmptyTest() {
        Map<Integer, Integer> a = new TreeMap<>();
        Assertions.assertTrue(a.isEmpty());
        a.put(10, 100);
        Assertions.assertFalse(a.isEmpty());
    }

}
