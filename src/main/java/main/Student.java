package main;

import java.io.Serializable;
//import java.util.HashMap;
import java.util.Vector;

public class Student implements Serializable{
    
    private String name; 
    private int number;
    //private HashMap<String,Integer> courses;
    Vector<String> kurssienNimet;
    Vector<Integer> kurssienArvosanat;
    private static final long serialVersionUID = 24234298L;
    
    
      
    
    public Student() {
        this.name = "Pikseli";
        this.number = 5;
        //this.courses = new HashMap<>();
        this.kurssienNimet = new Vector<String>();
        this.kurssienArvosanat = new Vector<Integer>(); 
        
        //System.out.println(this.name);
    }
    public Student (String name, int number) {
        this.name = name;
        this.number = number;
        //this.courses = new HashMap<>();
        this.kurssienNimet = new Vector<String>();
        this.kurssienArvosanat = new Vector<Integer>(); 
        
    }
    

    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void gradeCourse(String course, int grade) {
        //this.courses.put(course, grade);
        this.kurssienNimet.add(course);
        this.kurssienArvosanat.add(Integer.valueOf(grade));
    }

    public String getCourseName(int i) {
        return this.kurssienNimet.get(i);
    }

    public int getCourseGrade(int i) {
        return this.kurssienArvosanat.get(i).intValue();
    }

    public int getNumberOfCourses() {
        return this.kurssienArvosanat.size();
    }

    //public HashMap<String,Integer> getCourses() {
    //    return this.courses;
    //}

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
