package PaymentObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Gas {
    public final static String name = "Gas";
    public static double prise;

    static Map gasMap = new TreeMap();

    public static Map initMap(){
        gasMap.clear();

        gasMap.put("name",name);
        gasMap.put("prise",prise);

        //System.out.println(gasMap);
        return gasMap;
    }
}
