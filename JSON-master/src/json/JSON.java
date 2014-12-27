package json;

import java.io.FileNotFoundException;
import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class JSON {

    private static final String filePath = "C:\\Users\\RHINDI-LAP\\Desktop\\INF2015-40\\LABO\\lab1\\JSON-master\\src\\json\\jourSemaine.json";

    public static void main(String[] args) throws FileNotFoundException, IOException {
        JSONArray tableau = new JSONArray().fromObject(FileReader.loadFileIntoString(filePath, args[0]));

        // affichage du fichier avec une boucle for normal
//        for(int i = 0 ; i < tableau.size(); ++i){
//            System.out.println(tableau.getString(i));
//        }   
        for (Object o : tableau) {
            System.out.println(o);
        }
    }
}
