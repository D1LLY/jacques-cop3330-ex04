/*
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!
 */

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dilly Jacques
 */

package programming1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("Enter a noun: ");
        String noun=in.nextLine();//dog

        System.out.print("Enter a verb: ");
        String verb=in.nextLine();//walk

        System.out.print("Enter an adjective: ");
        String adj=in.nextLine();//blue

        System.out.print("Enter an adverb: ");
        String adverb=in.nextLine();//quickly

        String out= "Do you " + verb + " your " + adj + " " + noun +  " quickly? That's hilarious!";
        System.out.println(out);
    }
}
