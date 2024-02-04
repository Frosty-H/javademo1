package main;

import java.util.HashMap;

public class Student {
    
    private String name; 
    private int number;
    private HashMap<String,Integer> courses;
    
    
      
    
    public Student() {
        this.name = "Pikseli";
        this.number = 5;
        this.courses = new HashMap<>();
         
        
        //System.out.println(this.name);
    }
    public Student (String name, int number) {
        this.name = name;
        this.number = number;
        this.courses = new HashMap<>();
    }
    

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void gradeCourse(String course, int grade) {
        this.courses.put(course, grade);
    }

    public HashMap<String,Integer> getCourses() {
        return this.courses;
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
