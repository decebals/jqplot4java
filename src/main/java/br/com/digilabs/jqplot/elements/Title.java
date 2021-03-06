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
package br.com.digilabs.jqplot.elements;

/**
 * @author inaiat
 */
public class Title implements Element {

    private static final long serialVersionUID = -277067293084389272L;
    private String text;
    private Boolean show;
    private String fontFamily;
    private String fontSize;
    private String textAlign;
    private String textColor;
    private String renderer;
    private String rendererOptions;
    private String escapeHtml;

    /**
     * Construtor
     */
    public Title() {
    }

    /**
     * 
     * @param text 
     */
    public Title(String text) {
        this.text = text;
    }

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param show the show to set
     */
    public void setShow(boolean show) {
        this.setShow((Boolean) show);
    }

    /**
     * @return the fontFamily
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * @param fontFamily the fontFamily to set
     */
    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    /**
     * @return the fontSize
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * @param fontSize the fontSize to set
     */
    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    /**
     * @return the textAlign
     */
    public String getTextAlign() {
        return textAlign;
    }

    /**
     * @param textAlign the textAlign to set
     */
    public void setTextAlign(String textAlign) {
        this.textAlign = textAlign;
    }

    /**
     * @return the textColor
     */
    public String getTextColor() {
        return textColor;
    }

    /**
     * @param textColor the textColor to set
     */
    public void setTextColor(String textColor) {
        this.textColor = textColor;
    }

    /**
     * @return the renderer
     */
    public String getRenderer() {
        return renderer;
    }

    /**get'
     * @param renderer the renderer to set
     */
    public void setRenderer(String renderer) {
        this.renderer = renderer;
    }

    /**
     * @return the rendererOptions
     */
    public String getRendererOptions() {
        return rendererOptions;
    }

    /**
     * @param rendererOptions the rendererOptions to set
     */
    public void setRendererOptions(String rendererOptions) {
        this.rendererOptions = rendererOptions;
    }

    /**
     * @return the escapeHtml
     */
    public String getEscapeHtml() {
        return escapeHtml;
    }

    /**
     * @param escapeHtml the escapeHtml to set
     */
    public void setEscapeHtml(String escapeHtml) {
        this.escapeHtml = escapeHtml;
    }

    /**
     * @return the show
     */
    public Boolean getShow() {
        return show;
    }

    /**
     * @param show the show to set
     */
    public void setShow(Boolean show) {
        this.show = show;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }
}
