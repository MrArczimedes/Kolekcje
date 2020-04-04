package pl.kolekcje;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetEx implements GettingNames {
    private Set<String> namesSet = new HashSet<String>();
    @Override
    public void values() {
        Scanner namesScanner = new Scanner(System.in);
        System.out.println("Podaj imie do dodadania, albo wprowadz \" - \" aby wyjsc i wyswietlic zbior");
        while(true) {
            if(!namesScanner.hasNext("-"))
            {
                System.out.println("Podaj imie do dodania: ");
                names(namesScanner.nextLine());
            }
            else {
                for (String e : namesSet)
                {
                    System.out.println(e);
                }
                break;
            }
        }
    }
    private void names(String name){
        namesSet.add(name);
    }
}

