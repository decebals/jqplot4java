package br.com.digilabs.jqplot.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;



/**
 *
 * @author inaiat
 */
public class LinedData<T extends Number> extends AbstractCollectionData<T> {
    
    private List<T> data = new ArrayList<T>();

    public LinedData() {
    }
    
    public LinedData(T... values) {
        addValues(values);
    }    

    public Collection<T> getData() {
        return data;
    }

    public String toJsonString() {
        JSONArray jsonArray = new JSONArray();
        jsonArray.put(data);
        return jsonArray.toString();
    }    

    
}