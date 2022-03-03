package it.develhope.aglianofrancesco.classesandobjects2;

import java.util.Random;

public class Programmer {
    public String name;
    public String programmingLanguage;
    public int yearsOfExperience;

    private final String[] names = {"Salvo","Giuseppe","Sara","Angela","Mario","Chiara"};
    private final String[] programmingLanguages = {"c++","c#","c","java","javascript","php"};

    private void initializeProgrammerValue(){
        Random ran = new Random();
        name = names[ran.nextInt(names.length)];
        programmingLanguage = programmingLanguages[ran.nextInt(programmingLanguages.length)];
        yearsOfExperience = ran.nextInt(40);
    }

    public Programmer(){
        initializeProgrammerValue();
    }

    public void printProgrammerDetails(){
        System.out.printf(""" 
                        Name of programmer: %s, known programming language: %s, years of experience: %d
                        """
                          ,name,programmingLanguage,yearsOfExperience);
    }
}
