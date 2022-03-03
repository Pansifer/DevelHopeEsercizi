package it.develhope.aglianofrancesco.classesandobjects2;

import java.util.Random;

public class Team {
    public String teamName;
    Programmer p1, p2;

    private final String[] teamNames =
            {"Team red","Team black","Team green","Team purple","Team yellow","Team gray"};

    public Team(){
        Random ran = new Random();
        teamName = teamNames[ran.nextInt(teamNames.length)];
        p1= new Programmer();
        p2 = new Programmer();
    }

    public void printTeamDetails(){
        System.out.printf("--------%s--------\n",teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }
}
