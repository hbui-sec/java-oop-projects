# Java Class & OOP Programming

## About This Repository

I am committing all my classwork to this repository for future references. This is my first time coding in Java. I have done Udemy for a few weeks in HTML, CSS, and JavaScript, but this is my first formal setting.

## Motivations for Coding

Before this, I was an automotive tech. I wanted to do something much more impactful and be in a field that's in demand, constantly challenging, and rewarding. One day, stumbling on ChatGPT, I gave it everything I am interested in (such as math, logic, puzzles, chess, reasoning, computers, IT, working remote, etc.) and it suggested me a few careers. One that stood out to me was cybersecurity. Before I chose this path, I made sure to take a good look at every other path, and nothing seems to be as interesting. I gave it prompts such as "tell me what a day in the life in each of these jobs feel like". While I don't remember the exact answers it gave me, I just remembered they all sounded so boring! Well, except for cybersecurity, obviously. Of course, another driving factor for me to pick this was for my future family. I needed a reasonable career—meaning something good for my work-life balance and has good job security and demands. I also want something that will reward me for my hard work and intelligence.

## The Transition: How I Use These Codes

These codes are very useful when I move forward with my Java Two course. It's easy to forget everything when you have a whole 4 months break—I am talking about my summer break. These codes will be extremely useful to skim to a few weeks before the start of my Java Two course. I might or might not create a new repository for my second Java course, but I will definitely come back time and time again in the future to remember the foundations and how far I've come in Java, such as when I am attending SDSU (pursuing a degree in C.S.) or on the job, since after all, we are humans, and we do forget. We're not perfect like AI _sarcasm_.

## Current Projects

*(More modules to be added as the semester progresses)*

## Tech Stack

Although it's been 6 years since I've touched HTML, CSS, and JavaScript, I do remember picking it up extremely easily. I think I remember completing the basic CSS in Udemy in 1 or 2 days. At the moment, I am still learning the fundamentals of Java, but I am picking it up quite quickly—likely because I am extremely interested and motivated in anything logic or coding related that I can use in my future cybersecurity or tech career, or maybe just building my own life calculator (yes, I know this is vague, because it is. Life calculator could be finance, electricity usage, amount of exercise done per month, etc.)

//Added note and signed edit – Joshua Hoagland

//Sample Code using what we've learnt in class:



import java.util.Scanner;
import java.util.InputMismatchException;

class VehicleReport {

    String model;
    int[] cylinderCompression = new int[4]; // Array built for a 4-cylinder engine


    VehicleReport(String m) {
        model = m;
    }


    void printDiagnostic() {
        System.out.println("\n--- Diagnostic Results for " + model + " ---");
        double totalCompression = 0;


        for (int i = 0; i < cylinderCompression.length; i++) {
            System.out.println("Cylinder " + (i + 1) + ": " + cylinderCompression[i] + " PSI");
            totalCompression = totalCompression + cylinderCompression[i];
        }

        double average = totalCompression / cylinderCompression.length;
        System.out.println("Average Compression: " + average + " PSI");


        if (average >= 150) {
            System.out.println("Status: PASS. Engine is healthy.");
        } else {
            System.out.println("Status: FAIL. Check for blown head gasket or worn rings.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vehiclesToTest = 0;

        System.out.print("How many vehicles are in the bay today? ");


        try {

            vehiclesToTest = sc.nextInt();
            sc.nextLine();
        } catch (Exception e) {
            System.out.println("Error: Please enter a number. Defaulting to 1 vehicle.");
            vehiclesToTest = 1;
        }

        int v = 1;


        while (v <= vehiclesToTest) {
            System.out.print("\nEnter model for vehicle #" + v + " (e.g., Accord): ");
            String currentModel = sc.nextLine();


            VehicleReport report = new VehicleReport(currentModel);

            System.out.println("Enter compression (PSI) for all 4 cylinders.");

            for (int i = 0; i < report.cylinderCompression.length; i++) {
                System.out.print("Cyl " + (i + 1) + ": ");
                try {
                    report.cylinderCompression[i] = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Invalid sensor data. Logging as 0 PSI.");
                    report.cylinderCompression[i] = 0;
                }

                sc.nextLine();
            }


            report.printDiagnostic();


            v++;
        }

        System.out.println("\nGood job guys. We're done today. Clean up your stuff and go home.");
    }
}
