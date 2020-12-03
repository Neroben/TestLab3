import bstu.map.Map;
import bstu.map.treemap.TreeMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapTest {

    @Test
    @DisplayName("size()")
    public void sizeTest() {
        Map<Integer, Integer> a = new TreeMap<>();
        Assertions.assertEquals(0, a.size());
    }

    @Test
    @DisplayName("put()/get()")
    public void putTest() {
        Map<Integer, Integer> a = new TreeMap<>();
        a.put(10, 100);
        Assertions.assertEquals(100, a.get(10));
    }

}
