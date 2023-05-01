package org.example;

import java.util.HashMap;
import java.util.Map;

public class Annuaire {

    private static Map<String, String> contacts;

    /**
     * Initialize the contacts map*/
    public boolean init(){
        contacts = new HashMap<>();
        return true;
    }


    /**
     * Add a new entry to the contacts*/
    public boolean ajouterEntree(String name, String numTel){
        this.contacts.put((String)name,(String) numTel);
        System.out.println("Adding Entry [" + name + ", " + numTel + " ]");
        return  true;
    }

    /**
     * Return the correspondent numTel of the given name*/
    public String trouverNumero(String name){
        System.out.println("Returning the 'numTel' of the name: " + name);
        return this.contacts.get(name);
    }

    /**
     * Return the number of contacts*/
    public int nbNumeros(){
        System.out.println("Returning the number of contacts: (" + this.contacts.size() + ")");
        return this.contacts.size();
    }

    /**
    Return the list of all contacts*/
    public String getAll(){
        String allEntries = "{[";
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            allEntries += entry.getKey() + ", " + entry.getValue() + "], [";
        }
        allEntries += "]}";
        return  allEntries;
    }

    /**
     * Return the list of methods that are implemented in this server*/
    public String listMethods(){
        String methods = "-init()\n" +
                "-ajouterEntree(string name, string numTel)\n"+
                "-trouverNumero(String name)\n" +
                "-nbNumeros()\n" +
                "-getAll()\n";
        return methods;
    }
}
