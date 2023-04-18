import java.util.HashMap;
import java.util.Scanner;

public class HashMaps {
    // This program collects user's name and birth year
    // calculates the age using date of birth and the present year
    // populates the hashmap with names and age
    HashMap<String, Integer> people = new HashMap<>();
    HashMap<String, Integer> recordPeople = new HashMap<>();

    public int birthYear;
    public final int presentYear = 2023;
    public String name;

    public void collectingData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of people to be recorded: ");
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            System.out.print("Enter user "+ (i + 1) + " name: ");
            name = sc.next();
            System.out.print("Enter user "+ (i + 1) + " Birth Year: ");
            birthYear = sc.nextInt();

            //populating the map
            //// recordPeople map hold the person's name and birthYear
            recordPeople.put(name, birthYear);
            //// people map hold the person's name and age (presentYear - birthYear)
            people.put(name, presentYear - birthYear);
        }
    }
    // this method updates the user's age if the presentYear changes
    public void UpdateData() {
        // presentYear is now 2024
        // updating the age without changing the variable presentYear

        int newYear = 2024;

        for(String i : people.keySet())
            //- put(i) method will just update the available record
            //  because when using put() and the key already exists,
            //  it just updates the value
            //- get(i) retrieves the birthYear from the recordPeople and
            //  subtract the newYear to update the age
            people.put(i, newYear - recordPeople.get(i));
        System.out.println("The present year changed to " + newYear + "\nUpdated people HashMap:");

        for(String em : people.keySet()) {
            System.out.println("Name: "+ em + " ,  Birth Year: " + recordPeople.get(em) + " ,  Age: " + people.get(em));
        }
    }

}
