package Assignment2.Q2;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random r = new Random();
        int grade = r.nextInt(100) + 1;
        int grade2 = r.nextInt(100) + 1;
        int grade3 = r.nextInt(100) + 1;
        GradeManagement parent1 = new GradeManagement();


        //Run for Good Mood
        Mood m1 = new goodMood("good", grade);
        if(m1.getCondition() == "good" && grade < 100 && grade >= 85){
            System.out.println("Your midterm score is " + grade + ", in your final.");
            parent1.callUpon(m1);
        } else if(m1.getCondition() == "good" && grade < 85 && grade >= 75){
            System.out.println("Your midterm score is " + grade + ", in your final.");
            parent1.callUpon2(m1);
        } else if(m1.getCondition() == "good" && grade < 75 && grade >= 65){
            System.out.println("Your midterm score is " + grade + ", in your final.");
            parent1.callUpon3(m1);
        } else if(m1.getCondition() == "good" && grade < 65){
            System.out.println("Your midterm score is " + grade + ", in your final.");
            parent1.callUpon4(m1);
        }

        System.out.println();

        //Run for Medium Mood
        Mood m2 = new mediumMood("medium", grade2);
        if(m2.getCondition() == "medium" && grade2 < 100 && grade2 >= 85){
            System.out.println("Your midterm score is " + grade2 + ", in your final.");
            parent1.callUpon(m2);
        } else if(m2.getCondition() == "medium" && grade2 < 85 && grade2 >= 75){
            System.out.println("Your midterm score is " + grade2 + ", in your final.");
            parent1.callUpon2(m2);
        } else if(m2.getCondition() == "medium" && grade2 < 75 && grade2 >= 65){
            System.out.println("Your midterm score is " + grade2 + ", in your final.");
            parent1.callUpon3(m2);
        } else if(m2.getCondition() == "medium" && grade2 < 65){
            System.out.println("Your midterm score is " + grade2 + ", in your final.");
            parent1.callUpon4(m2);
        }

        System.out.println();

        //Run for Bad Mood
        Mood m3 = new badMood("bad", grade3);
        if(m3.getCondition() == "bad" && grade3 < 100 && grade3 >= 85){
            System.out.println("Your midterm score is " + grade3 + ", in your final.");
            parent1.callUpon(m3);
        } else if(m3.getCondition() == "bad" && grade3 < 85 && grade3 >= 75){
            System.out.println("Your midterm score is " + grade3 + ", in your final.");
            parent1.callUpon2(m3);
        } else if(m3.getCondition() == "bad" && grade3 < 75 && grade3 >= 65){
            System.out.println("Your midterm score is " + grade3 + ", in your final.");
            parent1.callUpon3(m3);
        } else if(m3.getCondition() == "bad" && grade3 < 65){
            System.out.println("Your midterm score is " + grade3 + ", in your final.");
            parent1.callUpon4(m3);
        }

    }
}
