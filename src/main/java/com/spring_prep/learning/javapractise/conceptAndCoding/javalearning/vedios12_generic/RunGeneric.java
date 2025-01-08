package com.spring_prep.learning.javapractise.conceptAndCoding.javalearning.vedios12_generic;

public class RunGeneric {

    public static void main(String[] args) {
        Print print = new Print();
        print.setValue(4);
        Object val = print.getValue();
        if((int) val == 4){

        }


        PrintGeneric<Integer, String> printGeneric = new PrintGeneric();
        printGeneric.setValue(4);
        String val2 = printGeneric.getValue();
        if(val2.equals("4")){
            System.out.println("Value are equals");
        }


        ColorPrint colorPrint = new ColorPrint();
        colorPrint.setValue(1);
        String val3 = colorPrint.getValue();
    }
}
