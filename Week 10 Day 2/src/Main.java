import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File myfile = new File("data.txt");
        Scanner in = new Scanner(myfile);
        //Scanner in2 = new Scanner(myfile);
        String names;
        //int grade;
        int grades;
        int i = 0;
        int highestGrade = 0;
        int totalGrades = 0;
        String highestScoreStudent = "John Doe";


        System.out.println("Student List: ");
        while (in.hasNext()) {
            //String line = in.nextLine();
            //System.out.println(line);
            names = in.next();
            grades = in.nextInt();
            if (grades > highestGrade){
                highestGrade = grades;
                highestScoreStudent = names;
            }
            totalGrades = totalGrades + grades;
            System.out.println(names + ": " + grades);
            i++;
        }



        //System.out.println(totalGrades);
        double averageGrade = totalGrades / i;
        System.out.println("Average: " + averageGrade);
        System.out.println("Highest grade: " + highestScoreStudent + " " + highestGrade);
        System.out.println(i);

        //for (int i = 0; grades[i] != 0; i++)
        //{
           // names[i] = in.next();
         //   grades[i] = in.NextInt();
            //totalGrades = totalGrades + grade[i];
            //System.out.println(names[i] + ": " + grades[i]);
            //i++
        //}

        //System.out.println(totalGrades);
        //double averageGrade = totalGrades / grade.length;
        //System.out.println(averageGrade);
        //while (in.hasNextLine())


        //for (int i = 0; i < lineLength; i++)
        //while (in.hasNextInt())
        //{
          //  int grade = in2.nextInt();
            //System.out.println(grade);

        //}
        //int[] allGrade = {90, 85, 95};

        //while (in.hasNextInt()) {
        // =
        //while (in.next())

        //    grade = in.nextInt();
        //in.next();
        //in.nextLine();
            //int grade = in.nextInt();
            //double average = grade / allGrade.length;
        //    System.out.println(grade);
        //}

    }
}