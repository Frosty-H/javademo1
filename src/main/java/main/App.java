package main;


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

        /*System.out.println( "1) Pistä siili puhumaan, 2) Luo uusi siili, 3) Juoksuta siiliä, 0) Lopeta ohjelma" );*/

        //Hedgehog hedgehog = new Hedgehog ();
        
        Zoo zoo = new Zoo();

        /*hedgehog.printSpecs();
        hedgehog.run();*/

        boolean exit =false;
        System.out.println( "Anna eläintarhalle nimi:" );
        String zooname = sc.nextLine();
        zoo.setName(zooname);
        while(!exit) {
            
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

        /*while(!exit) {
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
