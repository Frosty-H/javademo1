package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class University {
    final private String FILENAME;
    private ArrayList<Student> students;

    
    
    public University() {
        students = new ArrayList<>();
        FILENAME = "students.data";   
    }

    public void addStudent(Student student) {
        students.add(student);
        
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public Student getStudent(int i) {
        return this.students.get(i);
    }

    public void listStudent() {
        for(Student student : students) {
            student.printSpecs();
        }
    }

    public void saveStudents(){
        try {
            ObjectOutputStream studentWriter = new ObjectOutputStream (new FileOutputStream (FILENAME));
            studentWriter.writeObject(students);
            studentWriter.close();

        } catch (IOException e) {
            System.out.println("Virhetilanne");
            e.printStackTrace();
        }

    }

    public void loadStudents(){
        try {
            ObjectInputStream studentsReader = new ObjectInputStream (new FileInputStream (FILENAME));
            students =  (ArrayList<Student>) studentsReader.readObject();
            studentsReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Virhetilanne");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Virhetilanne");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Virhetilanne");
            e.printStackTrace();
        }

    }

}
