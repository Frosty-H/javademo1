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

        Hedgehog hedgehog = new Hedgehog ();

        /*hedgehog.printSpecs();
        hedgehog.run();*/

        boolean exit =false;

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
                        
                        hedgehog = new Hedgehog(speak);
                        hedgehog.printSpecs();
                        hedgehog.speak();
                        break;
                    case 2:
                        System.out.println("Anna siilin nimi:");
                        String name = sc.nextLine();
                        hedgehog.setName(name);
                        System.out.println("Anna siilin ikä:");
                        int age = Integer.parseInt(sc.nextLine());

                        hedgehog = new Hedgehog(name, age);
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
        sc.close();

        } 

    }
}
