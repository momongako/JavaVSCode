
package Buoi06.collections;

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
        Employee2 a2 = new Employee2(2, "H", "A", dateFormat.parse("2009-01-31")); // key1

        System.out.println(a1);
        Map<Employee2, String> map = new HashMap<>();
        map.put(a1, "1");
        map.put(a2, "HE");
        for (Employee2 print : map.keySet()) {
            System.out.println(map.get(print).toString());
        }
        boolean check = map.containsKey(a1);
        System.out.println(check);
        // System.out.println(a1);
        // System.out.println(a2);
    }
}
