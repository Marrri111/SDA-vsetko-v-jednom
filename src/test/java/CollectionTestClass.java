import colections.CollectionClass;
import colections.DataClass;
import org.junit.jupiter.api.Test;

import java.util.*;

public class CollectionTestClass {


    @Test
    public void colTst() {

        Set<String> set = CollectionClass.getStrSet();
        for (String setitem : set) {
            System.out.println(setitem);
        }
        if (set.contains("bbb")) {
            System.out.println("obsahuje becka");
        }
        if (!set.contains("xxx")) {
            System.out.println("neobsahuje x-ka");
        }
    }

    @Test
    public void colListTst() {
        List<String> list = CollectionClass.getStrList();
        for (String setitem : list) {
            System.out.println(setitem);
        }
    }

    @Test
    public void colQTst() {
        Queue<String> queue = CollectionClass.getQueueString();

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll()); // vraci null
        /*
        // vyhazuje exception
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());*/
    }

    @Test
    public void colDeQTst() {
        Deque<String> queue = CollectionClass.getDeQueueString();
        System.out.println(queue.poll());
        System.out.println(queue.pollLast());

        System.out.println(queue.poll());
        System.out.println(queue.pollLast());
    }

    @Test
    public void colMapTst() {
        Map<String, DataClass> map = CollectionClass.getMap();

        // pomoci get ziskame hodnotu podle klice
        System.out.println("----------------------------------------");
        System.out.println(map.get("tri"));
        System.out.println(map.get("dve"));

        System.out.println("----------------------------------------");
        // vypis vsech klicu
        for (String key : map.keySet()) {
            System.out.println("map key : " + key);
        }
        System.out.println("----------------------------------------");
        // vypis vsech klicu+hodnot
        for (Map.Entry<String, DataClass> keyvaluePair : map.entrySet()) {
            System.out.println("map key+value : " + keyvaluePair);
        }
        System.out.println("----------------------------------------");
        // vypis vsech hodnot
        for (String key : map.keySet()) {
            System.out.println("map value : " + map.get(key));
        }
        System.out.println("----------------------------------------");
        // smazani 2. + vypis vsech klicu+hodnot
        map.remove("dve");
        for (Map.Entry<String, DataClass> keyvaluePair : map.entrySet()) {
            System.out.println("map key+value : " + keyvaluePair);
        }
        // dotaz na klic
        if (map.containsKey("pet")) {
            System.out.println("petka existuje");
        }


    }

    @Test
    public void setDataTest() {
        // pretizili jsme DataClass.equals ktery porovnava objekt podle veku
        DataClass ds1 = new DataClass("pepa", 55);
        DataClass ds2 = new DataClass("mirek", 55);
        if (ds1.equals(ds2)) {
            System.out.println("jsou stejne");
        } else {
            System.out.println("NEJSOU stejne");
        }
    }

    @Test
    public void setDataTestEqual() {

        // prepsali jsme funkci DataClass.hashCode, pocita podle veku
        // proto nepuje vlozit dva se stejnym vekem

        Set<DataClass> set = new HashSet<>();
        set.add(new DataClass("a", 11));
        set.add(new DataClass("b", 11));
        set.add(new DataClass("c", 22));
        for (DataClass ds : set) {
            System.out.println(ds);
        }
    }

    @Test
    public void colArrays() {
        int[] poleInt = new int[]{1, 2, 4, 5, 6};

        // trida Arrays poskytuje funkce na poli

        int result = Arrays.binarySearch(poleInt, 5); // hlednani hodnoty 5
        System.out.println(result); // 3

        // lze vyrobit novy list z argumentu funkce
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);

        // porovnani poli
        //int result1 = Arrays.compare(new int[]{1, 2, 3}, new int[]{1, 2, 3});
        //System.out.println(result1); // 0

        // Staticke metody Collections poskytuji funkce nad kolekcemi

        List<String> list = Collections.emptyList();
        Map<String, Integer> map = Collections.emptyMap();
        Set<Object> set = Collections.emptySet();

        // vraci minimalni hodnotu
        String min = Collections.min(CollectionClass.getStrList());
        // obrati oporadi prvku
        Collections.reverse(CollectionClass.getStrList());
        // trideni
        Collections.sort(CollectionClass.getStrList(), Collections.reverseOrder());

    }

}