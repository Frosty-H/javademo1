package main;


public class Animal {
    
    private String name; 
    private int age;
    private String species;
      
    
    public Animal() {
        this.name = "Pikseli";
        this.age = 5;
        this.species = "";
        //System.out.println(this.name);
        }
    public Animal(String name, int age, String species) {
        this.name = name;
         this.age = age;
         this.species = species;
        }
    
    /*public Animal(String speak) {
        this.name = "Pikseli";
        this.age = 5;
        this.speak =speak;
            
        }*/
    
    public String getName() {
        return this.name;
        }
    
    public void setName(String name) {
        this.name = name;
        }
    public void setSpecies(String species) {
        this.species = species;
        }
        
    
    public void setAge(int age) {
        this.age = age;
        }

    public String getSpecies() {
        return this.species;
            }
        
    
        
    /*public void setSpeak(String speak) {
        this.speak = speak;
        }*/
    
     public void round (int x) {
         if (x<0){
             return;
        }
        System.out.println(name + " juoksee kovaa vauhtia!");
         round(x-1);
         }
        
    
    /*public void run () {
        System.out.println( name + " juoksee kovaa vauhtia!");
    }*/
    
    /*public void speak () {
        System.out.println( this.name +": "+ this.speak);
     }
        
    
    */public void printSpecs() {
        System.out.println(species +": "+ name +", " + age +" vuotta" );
        
        
    }
}
