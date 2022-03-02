package it.aglianofrancesco.esercizio1;

public class TestProgrammers {
    public static void main(String[] args) {

        Programmer p1 = new Programmer();
        Programmer p2 = new Programmer();

        p1.name = "Salvo";
        p1.age = 28;
        p1.wearsGlasses = false;

        p2.name = "Alessandra";
        p2.age = 34;
        p2.wearsGlasses = true;

        p1.drinkCoffe();
        p1.printDetails();

        p2.printDetails();
        p2.hasGlasses();

    }
}


