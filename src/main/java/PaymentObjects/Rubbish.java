package PaymentObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Rubbish {
    public final static String name = "Rubbish";
    public static double prise;

    static Map rubbishMap = new TreeMap();

    public static Map initMap(){
        rubbishMap.clear();

        rubbishMap.put("name",name);
        rubbishMap.put("prise",prise);

        //System.out.println(rubbishMap);
        return rubbishMap;
    }

}
