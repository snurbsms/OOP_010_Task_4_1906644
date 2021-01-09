package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    String [] myArray1 = {"*","*","*","*","*","*","*","*","*","*","*",}; // Characters in an Array. Each array changes the amount of
    String [] myArray2 = {"*","*","*","*","*"," ","*","*","*","*","*",}; // characters on each row to correlate to the shape.
    String [] myArray3 = {"*","*","*","*"," "," "," ","*","*","*","*",};
    String [] myArray4 = {"*","*","*"," "," "," "," "," ","*","*","*",};
    String [] myArray5 = {"*","*"," "," "," "," "," "," "," ","*","*",};
    String [] myArray6 = {"*"," "," "," "," "," "," "," "," "," ","*",};


// prints out each line of the array here. replaces the commas and square brackets with blank space. this is so the intended shape can be shown.

    System.out.println(Arrays.toString(myArray1).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray2).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray3).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray4).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray5).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray6).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray5).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray4).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray3).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray2).replace("[", "").replace("]", "").replace(",", ""));
    System.out.println(Arrays.toString(myArray1).replace("[", "").replace("]", "").replace(",", ""));

} }
