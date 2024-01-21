package main;

public class Hedgehog {
    private String name; 
    private int age;
    private String speak;
    

    public Hedgehog() {
        this.name = "Pikseli";
        this.age = 5;
        this.speak = "";
        //System.out.println(this.name);
    }
    public Hedgehog(String name, int age) {
        this.name = name;
        this.age = age;
        this.speak = "";
    }

    public Hedgehog(String speak) {
        this.name = "Pikseli";
        this.age = 5;
        this.speak =speak;
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void round (int x) {
        if (x<0){
            return;
        }
        System.out.println(name + " juoksee kovaa vauhtia!");
        round(x-1);
        }
    

    public void run () {
        System.out.println( name + " juoksee kovaa vauhtia!");
    }

    public void speak () {
        System.out.println( this.name +": "+ this.speak);
    }
    

    public void printSpecs() {
        System.out.println( name);
        System.out.println(age);
        System.out.println(speak);
    }
}
