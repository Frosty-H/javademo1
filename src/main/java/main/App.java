package main;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);

        University university =new University ();

        int choiceOfStudent = 0;
        String choiceOfCourse = "";
        int choiceOfGrade = 0;
        ArrayList<Student> students = new ArrayList<>();

        boolean exit =false;
        while(!exit) {
            
            System.out.println( "1) Lisää opiskelija, 2) Listaa opiskelijat, 3) Lisää opiskelijalle suorite, 4) Listaa opiskelijan suoritteet, 5) Laske opiskelijansuoritusten keskiarvo, 6) Laske opiskelijan suoritusten mediaani, 7) tallenna opiskelijat tiedostoon, 8) lataa opiskelijat tiedostosta, 0)lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        Student student =new Student();
                        System.out.println("Anna opiskelijan nimi?");
                        String name = sc.nextLine();
                        student.setName(name);
                        System.out.println("Anna opiskelijan opiskelijanumero:");
                        int number = Integer.parseInt(sc.nextLine());
                        student.setNumber(number);
                        university. addStudent(student);
                        break;
                    
                    case 2:
                        System.out.println("Opiskelijat:");
                        university.listStudent();
                        
                        break;
                    case 3:
                        students = university.getStudents();
                        for (int ii = 0; ii < students.size(); ii++) {
                            System.out.println(ii + ": " + students.get(ii).getName());
                        }
                        System.out.println("Mille opiskelijalle suorite lisätään?");
                        choiceOfStudent = Integer.parseInt(sc.nextLine());
                        System.out.println("Mille kurssille suorite lisätään?");
                        choiceOfCourse = sc.nextLine();
                        System.out.println("Mikä arvosana kurssille lisätään?");
                        choiceOfGrade = Integer.parseInt(sc.nextLine());
                        university.getStudent(choiceOfStudent).gradeCourse(choiceOfCourse, choiceOfGrade);
                        break;
                    case 4:
                        students = university.getStudents();
                        for (int ii = 0; ii < students.size(); ii++) {
                            System.out.println(ii + ": " + students.get(ii).getName());
                        }
                        System.out.println("Minkä opiskelijan suoritteet listataan?");
                        choiceOfStudent = Integer.parseInt(sc.nextLine());
                        Student stu = students.get(choiceOfStudent);
                        for (int j = 0; j < stu.getNumberOfCourses(); j++) {
                            System.out.println(stu.getCourseName(j) + ": " + stu.getCourseGrade(j));
                        }
                        /*HashMap<String,Integer> courses = students.get(choiceOfStudent).getCourses();
                        for (String courseName:courses.keySet()) {
                            System.out.println(courseName + ": " + courses.get(courseName));
                        }*/
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit =true;
                        break;
                    default:
                        System.out.println ("Syöte oli väärä");
                        break;
                        
            
                    
                    


                }

            }
        

        }

        /*System.out.println( "1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma" );*/

        //Hedgehog hedgehog = new Hedgehog ();
        
        //Zoo zoo = new Zoo();

        /*hedgehog.printSpecs();
        hedgehog.run();*/

        /*boolean exit =false;
        System.out.println( "Anna eläintarhalle nimi:" );
        String zooname = sc.nextLine();
        zoo.setName(zooname);
        /*  while(!exit) {
            
            System.out.println( "1) Luo uusi eläin, 2) Listaa kaikki eläimet, 3) Juoksuta eläimiä, 0) Lopeta ohjelma" );

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        Animal animal =new Animal();
                        System.out.println("Mikä laji?");
                        String species = sc.nextLine();
                        animal.setSpecies(species);
                        System.out.println("Anna eläimen nimi:");
                        String name = sc.nextLine();
                        animal.setName(name);
                        System.out.println("Anna eläimen ikä:");
                        int age = Integer.parseInt(sc.nextLine());
                        animal.setAge(age);
                        zoo.addAnimal(animal);
                        break;
                    
                    case 2:
                        System.out.println(zooname + " pitää sisällään seuraavat eläimet:");
                        zoo.listAnimals();
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int x = Integer.parseInt(sc.nextLine());
                        zoo.runAnimals(x);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit =true;
                        break;
                    default:
                        System.out.println ("Syöte oli väärä");
                        break;
                        
            
                    
                    


                }

            }
        

        }

        while(!exit) {
            System.out.println( "1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma" );

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Mitä siili sanoo:");
                        String speak = sc.nextLine();
                        hedgehog.setSpeak(speak);
                        hedgehog.speak();
                        break;
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        hedgehog.setName(name);
                        System.out.println("Anna siilin ikä:");
                        int age = Integer.parseInt(sc.nextLine());
                        hedgehog.setAge(age);
                        break;
                    case 3:
                        System.out.println("Kuinka monta kierrosta?");
                        int x = Integer.parseInt(sc.nextLine());
                        hedgehog.round(x-1);
                        break;
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit =true;
                        break;
                    default:
                        System.out.println ("Syöte oli väärä");
                        break;
                        
            
                    
                    


                }

            }
        

        }*/ 
        sc.close();
    }
}
