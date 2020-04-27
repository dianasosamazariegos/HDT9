/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

import java.util.*;

public class Factory<K,V> {
    
    public Factory(){
    }
    
    public Map<K,V> getMap(int tipo){
    // seleccioin de la implementacion a usar
        if (tipo == 1){
            return new HashMap<K,V>();//regresa un HashMap
        }
        else if (tipo == 2){
            return new TreeMap<K,V>(); //regresa un TreeMap
        }
        else{
            return new LinkedHashMap<K,V>();//regresa un LinkedHashMap
        }
    }
}
    

