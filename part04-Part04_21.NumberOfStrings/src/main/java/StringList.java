/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Antonio Leonardo
 */
public class StringList {
    
    private String word;
    
    public StringList(String word){
        this.word = word;
    }
    
    public String getWord(){
        return word;
    }
    
    @Override
    
    public String toString(){
        return this.word;
    }
    
}
