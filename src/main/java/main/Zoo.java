package main;

public class Zoo {
    private String zooname; 
    
    public Zoo() {
        this.zooname = "Eläintarha";
        
    }
    public Zoo (String name) {
        this.zooname = name;
        
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
