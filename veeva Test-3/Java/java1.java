package seleniumwebdriver;
import java.util.*;

public class java1 {

    static HashMap<String, HashMap<String, String>> h = new HashMap<>();

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of countries");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String country = sc.nextLine();
            int c = sc.nextInt();
            sc.nextLine();

            h.put(country, new HashMap<>());

            for (int j = 0; j < c; j++) {
                String capital = sc.nextLine();
                String season = sc.nextLine();
                h.get(country).put(capital, season);
            }
        }

        while (true) {

            System.out.println("1. Print all countries and capitals");
            System.out.println("2. Get capitals of a country");
            System.out.println("3. Countries having 2 capitals");
            System.out.println("4. Countries having 3 capitals");
            System.out.println("5. Countries without summer capital");
            System.out.println("6. Capitals of countries starting with vowel");
            System.out.println("7. Summer capitals of countries starting with vowel");
            System.out.println("8. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    printAll();
                    break;

                case 2:
                    String name = sc.nextLine();
                    printCountry(name);
                    break;

                case 3:
                    countriesWithCapitals(2);
                    break;

                case 4:
                    countriesWithCapitals(3);
                    break;

                case 5:
                    countriesWithoutSummer();
                    break;

                case 6:
                    capitalsStartingWithVowel();
                    break;

                case 7:
                    summercapitalsStartingWithVowel();
                    break;

                case 8:
                    return;
            }
        }
    }

    static void printAll() {
        for (String country : h.keySet()) {
            HashMap<String, String> capitals = h.get(country);
            System.out.println(country + " " + capitals.size());
            for (Map.Entry<String, String> entry : capitals.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
    }

    static void printCountry(String country) {
        if (!h.containsKey(country)) {
            System.out.println("Country not found");
            return;
        }
        HashMap<String, String> capitals = h.get(country);
        System.out.println(country + " " + capitals.size());
        for (Map.Entry<String, String> entry : capitals.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    static void countriesWithCapitals(int count) {
        for (String country : h.keySet()) {
            if (h.get(country).size() == count) {
                System.out.println(country);
            }
        }
    }

    static void countriesWithoutSummer() {
        for (String country : h.keySet()) {
            int flag = 0;
            for (String season : h.get(country).values()) {
                if (season.equalsIgnoreCase("Summer")) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                System.out.println(country);
            }
        }
    }

    static void capitalsStartingWithVowel() {
        for (String country : h.keySet()) {
            char ch = Character.toUpperCase(country.charAt(0));
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                for (Map.Entry<String, String> entry : h.get(country).entrySet()) {
                    System.out.println(entry.getKey());
                }
            }
        }
    }

    static void summercapitalsStartingWithVowel() {
        for (String country : h.keySet()) {
            char ch = Character.toUpperCase(country.charAt(0));
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                for (Map.Entry<String, String> entry : h.get(country).entrySet()) {
                    if (entry.getValue().equalsIgnoreCase("Summer")) {
                        System.out.println(entry.getKey());
                    }
                }
            }
        }
    }
}