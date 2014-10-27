package net.adamsmolnik;

import java.util.Locale;
import java.util.ResourceBundle;

public class Test {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("pl", "PL"));
        System.out.println("locale: " + Locale.getDefault());
        ResourceBundle resources = ResourceBundle.getBundle("resources");
        System.out.println("resources: " + resources.getClass());
        System.out.println("value for key1: " + resources.getString("key1"));
        ResourceBundle resourcesDeDE = ResourceBundle.getBundle("resources", new Locale("de", "DE"));
     // remove file resources_de_DE.properties to check out
        System.out.println("value for key1 (de/DE): " + resourcesDeDE.getString("key1"));

        ResourceBundle resourcesDe = ResourceBundle.getBundle("resources", new Locale("de"));
        // remove file resources_de.properties to check out
        System.out.println("value for key1 (de): " + resourcesDe.getString("key1"));
        
    }
}
