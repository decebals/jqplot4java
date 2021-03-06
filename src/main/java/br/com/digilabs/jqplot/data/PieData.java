/*
 *  Copyright 2011 Inaiat H. Moraes.
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  under the License.
 */
package br.com.digilabs.jqplot.data;

import br.com.digilabs.jqplot.data.item.LabeledItem;

import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;

/**
 * Representa os dados de um chart Pie
 * @author inaiat
 */
public class PieData<T extends Number> extends AbstractCollectionData<LabeledItem<T>> {

    private static final long serialVersionUID = 5789136755213249502L;
	
    private Collection<LabeledItem<T>> data = new ArrayList<LabeledItem<T>>();

    /**
     * Retorna o json
     * 
     * @return 
     */
    public String toJsonString() {
        JSONArray outerArray = new JSONArray();
        JSONArray jsonArray = new JSONArray();
        for (LabeledItem<T> item : data) {
            JSONArray itemArray = new JSONArray();
            itemArray.put(item.getLabel());
            itemArray.put(item.getValue());
            jsonArray.put(itemArray);
        }
        outerArray.put(jsonArray);
        return outerArray.toString();
    }

    /**
     * 
     * @return Collection
     */
    public Collection<LabeledItem<T>> getData() {
        return data;
    }
}
