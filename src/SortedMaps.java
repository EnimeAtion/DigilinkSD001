import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMaps {
    // using the SortMap to sort our hash maps

    //SortedMap that is going to collect data from the people hashmap in HashMaps class
    SortedMap<String, Integer> sortPeople = new TreeMap<>();

    //SortedMap that is going to collect data from the recordPeople hashmap in HashMaps class
    SortedMap<String, Integer> sortRecord = new TreeMap<>();
    HashMaps hm = new HashMaps();

    public void SortHash() {

        //This loop populate the SortedMap 'sortPeople' with the keys and
        // value from the HashMap 'people' in class HashMaps
        for( String i : hm.people.keySet()) {
            sortPeople.put(i, hm.people.get(i));
        }

        //This loop populate the SortedMap 'sortRecord' with the keys and
        // value from the HashMap 'recordPeople' in class HashMaps
        for( String i : hm.recordPeople.keySet()) {
            sortRecord.put(i, hm.recordPeople.get(i));
        }


    }
    public void DisplaySortedData() {
        System.out.print("Sorted people HashMap: " + sortPeople);
        System.out.print("Sorted recordPeople HashMap: " + sortRecord);
    }
}
