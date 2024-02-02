package main;

import java.util.ArrayList;

public class University {
    private ArrayList<Student> students;
    
    public University() {
        students = new ArrayList<>();   
    }

    public void addStudent(Student student) {
        students.add(student);
        
    }

    public void listStudent() {
        for(Student student : students) {
            student.printSpecs();
        }
    }

}
