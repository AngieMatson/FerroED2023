
package com.upb.edu.FerroUPBP1.Lista;

public class NewMain {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("hola");
        list.add(4.55);
        list.add(1);
        LinkedListNode nodoPrueba1 = list.head;
        
        
        
        Integer[] arrPruebaInt = {1,2,3};
        
        list.add(nodoPrueba1,arrPruebaInt);
        
        
        LinkedList clon = (LinkedList) list.clone();
        clon.add(arrPruebaInt);
        list.print();
        clon.print();
        System.out.println(list.size());
        System.out.println(clon.size());
    }
    
}
