package com.company;

public class Variables {
    public static void main(String[] args){
        int x = 214748;
        x = x + 10;
        byte y = 10;
        short i = 2;             // Побитовый "или"     //  0   0  |  0
        long z = 100000000;                             //  0   1  |  1
        double c = 2.45;                                //  1   0  |  1
        float t = 3.20f;                                //  1   1  |  1
        char v = 'd';
        boolean u = false;
        y = (byte)x;
        System.out.println(y);   // Побитовый "и"       //  0   0  |  1
                                                        //  0   1  |  0
                                                        //  1   0  |  0
                                                        //  1   1  |  1


                                 // Побитовый "xor"     //  0   0  |  0
                                                        //  0   1  |  1
                                                        //  1   0  |  1
                                                        //  1   1  |  1
    }
}

