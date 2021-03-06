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
package br.com.digilabs.jqplot.data.item;


/**
 * Representa um item do bubble chart
 * @author inaiat
 */
public class BubbleItem implements BaseItem {

	private static final long serialVersionUID = 8361687784430405282L;

	private Float x;
    private Float y;
    private Float radius;
    private String label;

    /**
     * Construtor
     */
    public BubbleItem() {
    }

    /**
     * Construtor
     * 
     * @param x
     * @param y
     * @param radius
     * @param label 
     */
    public BubbleItem(Float x, Float y, Float radius, String label) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.label = label;
    }

    /**
     * Construtor
     * 
     * @param x
     * @param y
     * @param radius
     * @param label 
     */
    public BubbleItem(Integer x, Integer y, Integer radius, String label) {
        this.x = x.floatValue();
        this.y = y.floatValue();
        this.radius = radius.floatValue();
        this.label = label;
    }

    /**
     * 
     * @return label
     */
    public String getLabel() {
        return label;
    }

    /**
     * 
     * @param label 
     */
    public void setLabel(String label) {
        this.label = label;
    }
    /**
     * 
     * @return radius
     */
    public Float getRadius() {
        return radius;
    }

    /**
     * 
     * @param radius 
     */
    public void setRadius(Float radius) {
        this.radius = radius;
    }

    /**
     * 
     * @return x
     */
    public Float getX() {
        return x;
    }

    /**
     * 
     * @param x 
     */
    public void setX(Float x) {
        this.x = x;
    }

    /**
     * 
     * @return y
     */
    public Float getY() {
        return y;
    }

    /**
     * 
     * @param y 
     */
    public void setY(Float y) {
        this.y = y;
    }
}
