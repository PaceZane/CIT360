import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

import com.javaguides.strings.StringUtility;

public class AssertNotNullExample {
    public static String[] toStringArray(final Collection<?> collection) {
        if (collection == null) {
             return null;
        }
       return collection.toArray(new String[collection.size()]);
    }

 @Test
 public void toStringArrayTest() {
      final String[] strArray = StringUtility.toStringArray(Arrays.asList("a", "b", "c"));
      for (final String element : strArray) {
           assertNotNull(element);
      }
   }
}