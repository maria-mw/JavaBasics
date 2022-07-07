package Java_Basics.Lesson_9.ITMO;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list.add(123);

        List<String> strings = new ArrayList<>();
        strings.add("123");
        strings.add("string");
        strings.add("false");

        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);

        Collections.reverse(strings);
        System.out.println(strings);

        List<Integer> integers2 = new ArrayList<>();
        integers2.add(1233);
        integers2.add(24244);
        integers2.add(9998);

        List<Integer> integers = Arrays.asList(221, 342, 345); //список не изменяется
        List<String> strings2 = List.of("221", "342", "345"); //список не изменяется

        Iterator<Integer> iterator = integers2.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() >= 9998) {
                iterator.remove();
            }
        }
        System.out.println(integers2);

        Set<String> set = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            set.add("Java");
        }

        set.add("777");
        set.add("Hello");
        set.add("String");

        Map<String, Integer> map = new HashMap<>();
        map.put("John", 12345);
        map.put("Alice", 67890);
        map.put("Bob", 24680);
        map.put("Mike", 13579);
        System.out.println(map);
        Set<String> keys = map.keySet();
        Collection<Integer> values = map.values();
        System.out.println(keys);
        System.out.println(values);

        System.out.println(map.get("Bob"));

        System.out.println(getKeyByValue(map, 13579));
    }

    public static String getKeyByValue(Map<String, Integer> map, Integer value) {
        String result = null;
        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer mapValue = pair.getValue();
            if (value.equals(mapValue)) {
                result = key;
            }
        }
        return result;
    }


}

