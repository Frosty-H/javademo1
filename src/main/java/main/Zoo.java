package main;

import java.util.ArrayList;


public class Zoo {
    private String zooname;
    private ArrayList<Animal> animals; 
    
    public Zoo () {
        this.zooname ="Korkeasaari" ;
        animals = new ArrayList<>();   
    }

    public Zoo (String name) {
        this.zooname = name;   
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        
    }

    public void listAnimals() {
        for(Animal animal : animals) {
            animal.printSpecs();
        }
    }

    public void runAnimals(int x) {
        for(Animal animal : animals) {
            for (int i = 0; i < x; i++) {
                //eläin juoksee
                System.out.println(animal.getName() + " juoksee kovaa vauhtia!");
            }
        }
    }


    /*public Zoo(String speak) {
        this.zooname = "Pikseli";
        this.age = 5;
        this.speak =speak;
        
    }*/

    public String getName() {
        return this.zooname;
    }

    public void setName(String name) {
        this.zooname = name;
    }
    

    /*public void setAge(int age) {
        this.age = age;
    }
    
    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public void round (int x) {
        if (x<0){
            return;
        }
        System.out.println(zooname + " juoksee kovaa vauhtia!");
        round(x-1);
        }
    

    /*public void run () {
        System.out.println( name + " juoksee kovaa vauhtia!");
    }*/

    /*public void speak () {
        System.out.println( this.zooname +": "+ this.speak);
    }
    

    */public void printSpecs() {
        System.out.println( zooname);
        
    }
}
