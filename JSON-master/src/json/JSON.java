package json;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSON {

    private static final String filePathJours = "C:\\Users\\RHINDI-LAP\\Desktop\\INF2015-40\\LABO\\lab1\\JSON-master\\src\\json\\jourSemaine.json";
    private static final String filePathPersonne = "C:\\Users\\RHINDI-LAP\\Desktop\\INF2015-40\\LABO\\lab1\\JSON-master\\src\\json\\personne.json";
    public static void main(String[] args) throws FileNotFoundException, IOException {
        JSONArray tabJour = new JSONArray().fromObject(FileReader.loadFileIntoString(filePathJours, args[0]));
        JSONArray tabPersonne = new JSONArray().fromObject(FileReader.loadFileIntoString(filePathPersonne, args[0]));
        

        // affichage du fichier avec une boucle for normal
//        for(int i = 0 ; i < tableau.size(); ++i){
//            System.out.println(tableau.getString(i));
//        }   
        for (Object o : tabJour) {
            System.out.println(o);
        }
        
        //sous de ligne
        System.out.println();
        
        for (int i = 0 ; i < tabPersonne.size() ; ++i){
            // recuperation d'un object du tableau 
            JSONObject o = tabPersonne.getJSONObject(i);

            // recuperation des elements dans l'object
             JSONArray resultat = o.getJSONArray("personnages");
            
            // affichages du tableau
             for (Object l : resultat) {
            System.out.println(l);
        }
        }
    }
}
