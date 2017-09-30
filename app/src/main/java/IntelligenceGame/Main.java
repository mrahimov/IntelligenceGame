package IntelligenceGame;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by muridjonrahimov on 9/28/17.
 */

public class Main {

    public static void main(String[] args) {

        Score score = new Score();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n♪┏(・o･)┛♪┗ ( ･o･) ┓♪┏ ( ) ┛♪┗ (･o･ ) ┓♪┏(･o･)┛♪ \n\nWelcome to the Intelligence Game! \nPlease write your name to continue:");
        String name = scanner.nextLine();
        System.out.println("How many times would you like to play?");
        int gameTime = scanner.nextInt();

        for (int i = gameTime; i > 0; i--) {

            Random random = new Random();

            String M1 = "Math Quiz";
            String M2 = "Math Quiz: 2";
            String M3 = "Math Quiz: 3";
            String H1 = "History Quiz";
            String H2 = "History Quiz: 2";
            String H3 = "History Quiz: 3";
            String G1 = "Geography Quiz";
            String G2 = "Geography Quiz: 2";
            String G3 = "Geography Quiz: 3";

            String[] intellegence = {M1, M2, M3, H1, H2, H3, G1, G2, G3};

            String check = intellegence[random.nextInt(intellegence.length)];
            System.out.println(name + " let's play " + check + "\n");

            if (check.equals(M1)) {
                System.out.println("Which number will follow in the series:\n10, 5, 13,9, 18, 15, 25, ....\na: 16\nb: 19\nc: 23\nd: 35\n");
            } else if (check.equals(H1)) {
                System.out.println("How many republics made up the former Soviet Union?\na: 10\nb: 12\nc: 15\nd: 20");
            } else if (check.equals((G1))) {
                System.out.println("Which country borders with Tajikistan?\na: China\nb: Nepal\nc: Turkmenistan\nd: Myanmar");
            } else if (check.equals(M2)) {
                System.out.println("When asked how old she was, Beth replied “In two years I will be twice as old as\nI was five years ago”. How old is she? \na: 7\nb: 12\nc: 21\nd: 31");
            } else if (check.equals(H2)) {
                System.out.println("How many computer languages are in use?\na: 20\nb: 50\nc: 2000\nd: 5000");
            } else if (check.equals(G2)) {
                System.out.println("What is the approximate size of the Earth's equator?\na: 20,000km\nb: 30,000km\nc: 40,000km\nd: 50,000km");
            } else if (check.equals(H3)) {
                System.out.println("What does the Internet prefix WWW stand for?\na: World Wide Web\nb: Western Washington World\nc: Wide Width Wickets\nd: Worldwide Weather");
            } else if (check.equals(M3)) {
                System.out.println("4+5*6=?\na: 54\nb: 48\nc: 52\nd: 34");
            } else if (check.equals(G3)) {
                System.out.println("When did World War II start??\na: May 9, 1945\nb: Sep 1, 1939\nc: Sep 1, 1945\nd: May 9, 1939");
            }

            String c = scanner.next();
            score = checkAnswers(check, c, score);
            getAnswer(score);






        }
        System.out.println("How did You like the Intelligence Game?\na: Very Good!\nb:It's Ok!\nc:it's bad!\nd:Very Bad!");
        String b = scanner.next();


        switch (b) {
            case "a" :
                System.out.println("You are the BEST!!!\n✌(◕‿-)✌");
                break;
            case "b" :
                System.out.println("Thx◦°˚\n\\(*❛‿❛)/˚°◦");
                break;
            case "c" :
                System.out.println("You are BAD!!!");
                break;
            case "d" :
                System.out.println("You are VERY BAD!!!\n  ̿'̿'\\̵͇̿̿\\з=( ͠° ͟ʖ ͡°)=ε/̵͇̿̿/'̿̿ ̿ ̿");
                break;

        }



    }

    public static Score checkAnswers(String subject, String answers, Score score) {

        int currentCorrectAnswer = 0;
        int currenrWrongAnswer = 0;

        if (subject.equals("Math Quiz") && answers.equals("c")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else if (subject.equals("History Quiz") && answers.equals("c")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else if (subject.equals("Geography Quiz") && answers.equals("a")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else if (subject.equals("Math Quiz: 2") && answers.equals("a")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else if (subject.equals("History Quiz: 2") && answers.equals("c")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else if (subject.equals("Geography Quiz: 2") && answers.equals("c")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else if (subject.equals("History Quiz: 3") && answers.equals("a")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else if (subject.equals("Math Quiz: 3") && answers.equals("d")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else if (subject.equals("Geography Quiz: 3") && answers.equals("b")) {
            System.out.println("RIGHT ANSWER!!!\n");
            currentCorrectAnswer++;
        } else {
            System.out.println("WRONG ANSWER!!!\n");
            currenrWrongAnswer++;

        }

        int totalCorrect = score.getCoutCorrectAnswers();
        totalCorrect += currentCorrectAnswer;
        score.setCoutCorrectAnswers(totalCorrect);

        int totalWrong = score.getCountWrongAnswers();
        totalWrong += currenrWrongAnswer;
        score.setCountWrongAnswers(totalWrong);

        return score;
    }

    public static void getAnswer(Score score) {

        int totalCorrect = score.getCoutCorrectAnswers();
        int totalWrong = score.getCountWrongAnswers();

        if (totalCorrect > totalWrong) {
            System.out.println("You smarter than you look!\n(̿▀̿ ̿Ĺ̯̿̿▀̿ ̿)̄\nYour Right answers is: " + totalCorrect + "\nYour Wrong answers is: " + totalWrong + "\n");
        } else if (totalCorrect == totalWrong) {
            System.out.println("Maybe you are not as smart as you look!\n¯\\_(⊙︿⊙)_/¯\nYour Right answers is: " + totalCorrect + "\nYour Wrong answers is: " + totalWrong + "\n");
        } else {
            System.out.println("Maybe we need to send you back to school!\n¯\\_(ツ)_/¯\nYour Right answers is: " + totalCorrect + "\nYour Wrong answers is: " + totalWrong + "\n");

        }

    }
}






