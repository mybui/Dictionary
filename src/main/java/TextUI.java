/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MimiHMB
 */

import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dict;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.dict = dict;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command:");
            String word = scanner.nextLine();
            
            if (word.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (word.equals("add")) {
                System.out.println("Word:");
                String a = scanner.nextLine();
                System.out.println("Translation:");
                String b = scanner.nextLine();
                dict.add(a, b);
            }
            
            
            if (word.equals("search")) {
                System.out.println("To be translated:");
                String c = scanner.nextLine();
                String d = dict.translate(c);
                if (d == null) {
                    System.out.println("Word " + c + " was not found");
                } else {
                    System.out.println("Translation: " + d);
                }
            }
            
            System.out.println("Unknown command");
        }
    }
}
