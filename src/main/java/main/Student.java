package main;



public class Student {
    
    private String name; 
    private int number;
    
    
      
    
    public Student() {
        this.name = "Pikseli";
        this.number = 5;
         
        
        //System.out.println(this.name);
    }
    public Student (String name, int number) {
        this.name = name;
         this.number = number;
         
    }
    

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
   
        

    public void setNumber(int number) {
        this.number = number;
    }
    
         
    public void round (int x) {
         if (x<0){
             return;
        }
        System.out.println(name + " juoksee kovaa vauhtia!");
         round(x-1);
    }
        
    
    
    public void printSpecs() {
        System.out.println(number +": " +name);
     
    }
}
