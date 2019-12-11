/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcpclient;

/**
 *
 * @author Enrico Marchi
 */
public class Message {
    private String sourceAlias;
    private String text;

    public Message(String sourceAlias, String text) {
        this.sourceAlias = sourceAlias;
        this.text = text;
    }

    public String getSourceAlias() {
        return sourceAlias;
    }

    public void setSourceAlias(String sourceAlias) {
        this.sourceAlias = sourceAlias;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return sourceAlias + ":  " + text + '\n';
    }
    
}
