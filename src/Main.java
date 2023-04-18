public class Main {
    public static void main(String[] args) {
        HashMaps hm = new HashMaps();
        SortedMaps sm = new SortedMaps();

        hm.collectingData();
        System.out.println("people HashMap Before sort: " + hm.people);
        System.out.println("recordPeople HashMap before sort: " + hm.recordPeople);

        System.out.println("======================================================");

        sm.SortHash();
        sm.DisplaySortedData();

    }
}