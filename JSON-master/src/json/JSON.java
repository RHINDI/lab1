package json;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.*;

import java.io.FileWriter;
import net.sf.json.groovy.JsonGroovyBuilder;
import net.sf.json.util.JSONBuilder;


public class JSON {

    private static final String filePathJours = "C:\\Users\\RHINDI-LAP\\Desktop\\INF2015-40\\LABO\\lab1\\JSON-master\\src\\json\\jourSemaine.json";
    private static final String filePathPersonne = "C:\\Users\\RHINDI-LAP\\Desktop\\INF2015-40\\LABO\\lab1\\JSON-master\\src\\json\\personne.json";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        JSONArray tabJour = new JSONArray().fromObject(FileReader.loadFileIntoString(filePathJours, args[0]));

        // Boucle for normal
//        for(int i = 0 ; i < tableau.size(); ++i){
//            System.out.println(tableau.getString(i));
//        }   
        // Boucle for each
        for (Object o : tabJour) {
            System.out.println(o);
        }

        //sous de ligne
        System.out.println();

        //
        //Lecture d'un objet JSON imbriquant plusieurs tableaux
        //
        JSONArray tabPersonne = new JSONArray().fromObject(FileReader.loadFileIntoString(filePathPersonne, args[0]));

        for (int i = 0; i < tabPersonne.size(); ++i) {
            // recuperation d'un object du tableau 
            JSONObject o = tabPersonne.getJSONObject(i);

            // recuperation des elements dans l'object
            JSONArray resultat = o.getJSONArray("personnages");

            // Affichages du tableau avec for each
            for (Object l : resultat) {
                System.out.println(l);
            }
        }

        //
        //Ajout d'un nouvel objet dans un objet JSON
        //
        //Creation d'un objet JSON
        JSONObject obj = new JSONObject();
        
        //Creation du tableau personnages
        JSONArray per = new JSONArray();
        
        // Remplire le tableau
        per.add("jd");
        per.add("turk");
        per.add("elliott");
        
        //Ajouter Tableau dans l'objet JSON
        obj.put("personnages", per);
        
        System.out.println(obj);

        
        
        String fileJSON = "C:\\Users\\RHINDI-LAP\\Desktop\\INF2015-40\\LABO\\lab1\\JSON-master\\src\\json\\personne1.json";
       FileWriter file = new FileWriter(fileJSON);
        file.write(obj.toString());
        file.flush();
        file.close();
        
        // la nouvell methode a faire
    }
}
