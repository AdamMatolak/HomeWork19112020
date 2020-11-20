package sk.kosickaakademia.matolak.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ArrayNames {

    public static void main(String[] args) {
        int maxLength=0;
        String longestString = null;

        Set<String> set=new HashSet<>() ;
        set.add("Peter");
        set.add("Martina");
        set.add("David");
        set.add("Daniela");
        set.add("Ivan");
        set.add("Sebastian");
        set.add("Roman");
        set.add("Peter");
        set.add("Svetlana");
        set.add("Martin");
        set.add("Denis");
        set.add("Viliam");
        set.add("Daniel");
        set.add("Tomas");
        set.add("Frantisek");
        set.add("Dominik");
        set.add("Samuel");
        set.add("Sebastian");
        set.add("Rebeka");
        set.add("Rebeka");
        set.add("Rebeka");
        set.add("Slavomir");
        set.add("Richard");
        set.add("Daniela");
        set.add("Eva");
        set.add("Simona");
        set.add("Lenka");
        set.add("Robert");
        set.add("Milan");
        set.add("Peter");
        set.add("Erik");
        set.add("David");
        set.add("Samuel");
        set.add("Eva");
        set.add("Ema");
        set.add("Tomas");
        set.add("Erika");
        set.add("Damian");
        set.add("Dominik");
        set.add("Leo");
        set.add("Filip");
        set.add("Radomir");
        set.add("Andrea");
        set.add("Barbora");
        set.add("Kristina");
        set.add("Marek");
        set.add("Richard");
        set.add("Peter");
        set.add("Petra");
        set.add("Pavol");
        set.add("Pavlina");
        set.add("Jan");
        set.add("Daniela");
        set.add("Peter");
        set.add("Filip");
        set.add("Frantisek");
        set.add("Koloman");
        set.add("Kristian");
        set.add("Helena");
        set.add("Lukas");
        set.add("Lenka");
        set.add("Michal");
        set.add("Martin");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Homework *a*");
        System.out.println("count  "+set.size());
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Homework *b*");
        System.out.println("All names:");
        System.out.println("----");
        for (String allNames:set)
            System.out.println(allNames);

        System.out.println("\n");
        System.out.println("\n");

        TreeSet abeceda=new TreeSet();
        abeceda.addAll(set);
        System.out.println("Homework *c*");
        System.out.println("Order by alphabet:");
        System.out.println("----");
        for (Object Alpha:abeceda){
            System.out.println(Alpha);
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Homework *d*");
        System.out.println("Longest name:");
        System.out.println("----");

        for (String s : set) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        System.out.println(longestString);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Homework *e*");
        System.out.println("Most repeatedly name:");
        System.out.println("----");
        System.out.println("neviem ");
        for (String count : set) {
            for (String counted : set) {
            }
        }
    }
}
