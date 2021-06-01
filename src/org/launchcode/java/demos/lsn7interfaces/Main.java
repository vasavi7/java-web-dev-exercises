package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        Collections.sort(flavors,new FlavorComparator() );
        System.out.println("Flavors List:");
           for(Flavor f : flavors){
               System.out.println(f);
            //System.out.println(f.getName());

        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("Cones List: ");
        Collections.sort(cones,new ConeComparator());
        for(Cone c : cones){
            //System.out.println(c.getName() + ":" + c.getCost());
            System.out.println(c);
        }

        Collections.sort(toppings,new ToppingComparator());
        for(Topping t : toppings){
            System.out.println(t.getName());
        }



        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
