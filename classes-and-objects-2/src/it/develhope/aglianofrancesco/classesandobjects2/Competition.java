package it.develhope.aglianofrancesco.classesandobjects2;

public class Competition {
    public static void main(String[] args) {
        Team teamA = new Team();
        Team teamB = new Team();

        CompetitionRules.getInstance().printRules();
        teamA.printTeamDetails();
        teamB.printTeamDetails();

    }
}
