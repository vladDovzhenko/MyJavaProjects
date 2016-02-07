package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main  {
    ArrayList<String> LastName = new ArrayList<String>();
    ArrayList<String> Name = new ArrayList<String>();
    ArrayList<String> Profession = new ArrayList<String>();
    ArrayList<Double> Weight = new ArrayList<Double>();
    int number,i;
    Scanner sc=new Scanner(System.in);
    boolean winner=false;
    String error="Try again";
    public static void main(String[] args) {
        Main m=new Main();
        OutPut op=new OutPut();
        AdditionalFunctionality ad=new AdditionalFunctionality();
        DataInput dI=new DataInput();
        dI.enter(m.LastName,m.Name,m.Profession,m.Weight);
        op.output(m.LastName,m.Name,m.Profession,m.Weight);
        ad.Select(m.LastName,m.Name,m.Profession,m.Weight);
    }
}
