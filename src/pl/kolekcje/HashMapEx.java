package pl.kolekcje;

import java.util.*;



public class HashMapEx implements GettingNames {
    Map<Integer, String> womanNames = new HashMap<>();
    Map<Integer, String> manNames = new HashMap<>();
    private int counter = 0;

    @Override
    public void values() {
        Scanner namesScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Podaj imię partnerki, albo wprowadź \" - \" aby wyjść");
            String womanName = namesScanner.next();
            if(womanName.equals("-")){
                break;
            }
            System.out.println("Podaj imię partnera, albo wprowadź \" - \" aby wyjść");
            String manName = namesScanner.next();
            if(manName.equals("-")){
                break;
            }
            womanNames.put(counter, womanName);
            manNames.put(counter, manName);
            counter++;
        }
        getValues();
    }

    private List<Integer> getKey(Map<Integer ,String > map, String value) {
        List<Integer> keys = new ArrayList<>();
        for (Map.Entry<Integer, String> entry : map.entrySet())
        {
            if(value.equals(entry.getValue()))
            {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }

    public void getValues() {
        Scanner nameScanner = new Scanner(System.in);
        while (true) {
            List keys;
            System.out.println("Podaj imię jednego partnera aby znaleźć drugiego");
            String name = nameScanner.nextLine();
            keys = getKey(womanNames, name);
            if(keys.size() == 0) {
                keys = getKey(manNames, name);
                if (keys.size() == 0) {
                    System.out.println("NIE MA TAKIEGO REKORDU!!!");
                } else {
                    for (int i = 0; 0 < keys.size(); i++) {
                        int number = (int) keys.get(i);
                        System.out.println(womanNames.get(number) + " ");
                    }
                }
            }
            else {
                for(int i = 0;  0 < keys.size(); i++) {
                    int number = (int)keys.get(i);
                    System.out.print(manNames.get(number) + " ");
                }
            }

        }
    }
}
