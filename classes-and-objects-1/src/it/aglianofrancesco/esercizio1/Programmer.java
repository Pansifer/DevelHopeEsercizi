package it.aglianofrancesco.esercizio1;

public class Programmer {
    public String name;
    public int age;
    public boolean wearsGlasses;

    public void drinkCoffe(){
        System.out.println("Espresso is the secret!");
    }
    public void printDetails(){
        System.out.printf("%s is a %d-yo programmer\n",name,age);
    }
    public void hasGlasses(){
        System.out.printf("%s wearing glasses? %b\n",name,wearsGlasses);
    }
}
