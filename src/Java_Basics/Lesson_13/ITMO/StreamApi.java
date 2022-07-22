package Java_Basics.Lesson_13.ITMO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<PromoCode> promos = new ArrayList<>();
        promos.add(new PromoCode("SKIDKA200",false));
        promos.add(new PromoCode("SKIDKA300",true));
        promos.add(new PromoCode("SKIDKA400",false));
        promos.add(new PromoCode("SKIDKA500",true));
        promos.add(new PromoCode("SKIDKA200",true));
        promos.add(new PromoCode("SKIDKA600",false));
        promos.add(new PromoCode("SKIDKA300",false));
        promos.add(new PromoCode("SKIDKA100",true));
        promos.add(new PromoCode("SKIDKA100",true));
        promos.add(new PromoCode("SKIDKA200",false));

//        promos.stream()
//                .filter(PromoCode::getExpired)
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        promos.stream()
//                .filter((promoCode -> !promoCode.getExpired()))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

//        promos.stream()
//                .filter((promoCode -> promoCode.getCode().equals("SKIDKA200")))
//                .collect(Collectors.toList())
//                .forEach(System.out::println);

        promos.sort(Comparator.comparing(PromoCode::getCode));
//        promos.forEach(System.out::println);

        Map<String, List<PromoCode>> collect = promos.stream()
                .collect(Collectors.groupingBy(PromoCode::getCode));
//        collect.get("SKIDKA200").forEach(System.out::println);
        System.out.println(collect);
        promos.stream()
                .map(promoCode -> promoCode.getCode().equals("SKIDKA200"))
                .collect(Collectors.toList());

        AtomicInteger counter = new AtomicInteger();
        promos.forEach(promoCode -> {
            if (!promoCode.getCode().equals("SKIDKA200")) {
                counter.getAndIncrement();
            }
        });
        System.out.println(counter.get());
    }
}
