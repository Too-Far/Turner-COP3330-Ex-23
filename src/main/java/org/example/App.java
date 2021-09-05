/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Turner
 */
package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App
{
    public static void decisionTree() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please use either y or n for yes or no");
        System.out.println("Is the car silent when you turn the key (y, n)? ");
        if (reader.readLine().toLowerCase().contains("y")) {
            System.out.println("Are the battery terminals corroded? (y, n)");
            if (reader.readLine().toLowerCase().contains("y")) {
                System.out.println("Clean the terminals and try again.");
            } else {
                System.out.println("Replace the cables and try again.");
            }
        } else{
            System.out.println("Does the car make a slicking noise? (y, n)");
            if (reader.readLine().toLowerCase().contains("y")) {
                System.out.println("Replace the battery");
            } else {
                System.out.println("Does the car crank up but fail to start? (y, n)");
                if (reader.readLine().toLowerCase().contains("y")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.println("Does the engine start, then die? (y, n)");
                    if (reader.readLine().toLowerCase().contains("y")) {
                        System.out.println("Does your car have fuel injection? (y, n)");
                        if (reader.readLine().toLowerCase().contains("y")) {
                            System.out.println("Get your car in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
    public static void main( String[] args ) throws IOException
    {
        decisionTree();
    }
}
