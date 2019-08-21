package json_readwrite;

import java.io.IOException;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Json_ReadWrite {

    public static void main(String[] args) throws IOException {
        
        int[] ids = {10,20,30,40,50};
        String[] names = {"Khushal","Monu","Ami","Parag","Yash","Farhin"};
        double[] salaries = {1000,2000,3000,4000,5000};
        
        JSONArray mainArray = new JSONArray();
        JSONObject singleObject = new JSONObject();
        
        for(int i = 0; i < ids.length; i++){
            
            singleObject.accumulate("id", ids[i]);
            singleObject.accumulate("name", names[i]);
            singleObject.accumulate("salary", salaries[i]);
            
            mainArray.add(singleObject);
            
            singleObject.clear();
        }
        
        System.out.println(mainArray);
        
        FileWriter.saveStringIntoFile("json/employee.json", mainArray.toString());
        
    }
    
}
