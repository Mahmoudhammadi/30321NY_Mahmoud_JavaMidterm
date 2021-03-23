package codelab.status;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CsvReader {

    public static void main(String[] args) {
        /*
         Comma-Separated Value(CSV) of CodeLab status is downloaded and it parsed.
         Based on number of solution you solved, message is generated for you.
         You need to find the average score of the class.
         */

        String csvFilePath = System.getProperty("user.dir") + "/src/codelab/status/roster.csv";
        String line = "";
        String csvSplitBy = ",";
        BufferedReader br = null;
        Trainee tr1 = new Trainee("abdedou","krimo",7);
        Trainee tr2 = new Trainee("Acosta","Taylor",116);
        Trainee tr3 = new Trainee("Asihaer","Maraba",13);
        Trainee tr4 = new Trainee("Aslam","Muniba",0);
        Trainee tr5 = new Trainee("Baileche","Amel",0);
        Trainee tr6 = new Trainee("Baileche","Neila",0);
        Trainee tr7 = new Trainee("bedjou","lamia",5);
        Trainee tr8 = new Trainee("Begum","Anjuman",16);
        Trainee tr9 = new Trainee("benbahmed","Ouarda",127);
        Trainee tr10 = new Trainee("Chowdhury","Tahamina",1);
        Trainee tr11= new Trainee("El Boubou","Mariam",0);
        Trainee tr12= new Trainee("Erdely","Alexandra",197);
        Trainee tr13= new Trainee("Essalhi","Kamal",18);
        Trainee tr14= new Trainee ("haddache","ahmed",0);
        Trainee tr15= new Trainee ("hammafi","mahmoud",2);

        List<Trainee> roster = new ArrayList<>();
        roster.add(tr1);
        roster.add(tr2);
        roster.add(tr3);
        roster.add(tr4);
        roster.add(tr5);
        roster.add(tr6);
        roster.add(tr7);
        roster.add(tr8);
        roster.add(tr9);
        roster.add(tr10);
        roster.add(tr11);
        roster.add(tr12);
        roster.add(tr13);
        roster.add(tr14);
        roster.add(tr15);

//        try {
//            br = new BufferedReader(new FileReader(csvFilePath));
//            int lineNumber = 0;
//            while ((line = br.readLine()) != null) {
//                if (lineNumber == 0) {
//                    lineNumber++;
//                    continue;
//                }
//                String[] name = line.split(csvSplitBy);
//                roster.add(new Trainee(name[5].replace("\"", ""), name[5].replace("\"",
//                        ""), Integer.parseInt(name[10])));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        Collections.sort(roster);

        for (Trainee student : roster) {
            if (student.getNumberOfExercisesSolved() >= 500) {
                System.out.print("You did pretty good-->                    ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            } else if (student.getNumberOfExercisesSolved() >= 400 && student.getNumberOfExercisesSolved() < 500) {
                System.out.print("You could do better-->                    ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            } else if (student.getNumberOfExercisesSolved() >= 300 && student.getNumberOfExercisesSolved() < 400) {
                System.out.print("You should have done more-->              ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            } else if (student.getNumberOfExercisesSolved() >= 200 && student.getNumberOfExercisesSolved() < 300) {
                System.out.print("You haven't done enough-->                 ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            } else if (student.getNumberOfExercisesSolved() >= 100 && student.getNumberOfExercisesSolved() < 200) {
                System.out.print("You did not take this exercise seriously-->   ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            } else if (student.getNumberOfExercisesSolved() < 100) {
                System.out.print("You are in bad shape !-->                           ");
                System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getNumberOfExercisesSolved());
            }
        }
    }
}
