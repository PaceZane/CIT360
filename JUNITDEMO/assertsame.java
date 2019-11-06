import static org.junit.Assert.assertSame;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class AssertSameExample {
    private String processMap(final String key){
        final Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");
        map.put("key4", "value4");
        map.put("key5", "value5");
        map.put("key6", "value6");
        map.put("key7", "value7");
        map.put("key8", "value8");
        return map.get(key);
   }
 
 @Test
    public void checkSameReferenceTest(){
        final AssertSameExample example = new AssertSameExample(); 
        assertSame(example.processMap("key1"), example.processMap("key1"));
    }
}