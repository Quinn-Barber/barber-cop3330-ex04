package org.example;
import java.util.*;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Quinn Barber
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter a noun:" );
        Scanner input = new Scanner(System.in);
        String noun = input.nextLine();
        System.out.println("Enter a verb:");
        String verb = input.nextLine();
        System.out.println("Enter an adjective:");
        String adjective = input.nextLine();
        System.out.println("Enter an adverb:");
        String adverb = input.nextLine();
        System.out.println("Do you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
    }
}
