
package collections;

import java.util.HashMap;
import java.util.Map;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HashMap_code {

    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Employee2 a1 = new Employee2(1, "H", "A", dateFormat.parse("2009-01-31")); // key1

        System.out.println(a1);
        Map<Employee2, String> map = new HashMap<Employee2, String>();
        map.put(a1, "CH");

        for (Employee2 print : map.keySet()) {
            System.out.println(map.get(print).toString());
        }
        System.out.println(a1);
    }
}
