package it.develhope.aglianofrancesco.classesandobjects2;

public class CompetitionRules {
    private static CompetitionRules instance = null;

    private CompetitionRules(){}

    public static CompetitionRules getInstance() {
        return instance== null ? instance = new CompetitionRules() : instance;
    }

    private final String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private final String competitionRule2 = "Learn every day!";
    private final String competitionRule3 = "Be the best team!";

    public void printRules(){
        System.out.printf("---------------------------------\n" +
                          "Rule 1: %s\nRule 2: %s\nRule 3: %s\n" +
                          "---------------------------------\n",
                          competitionRule1, competitionRule2, competitionRule3);
    }
}
