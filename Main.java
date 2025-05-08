/*
 * Rhett Brink - RBrin0551
 * CIT 4423 01
 * Sep 23, 2022
 * Windows 10
 */

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame();
        ArrayList<Double> arrList = new ArrayList<>(0);// an array list which holds how much money was spent each day
        fillArrList(arrList, getSize(arrList, window), window);// fills the array list from return of a method that gets
                                                               // num of days from user
        String printAvg = String.format("An average of how much mon mons you spent per day is $%,.2f",
                fillAvg(arrList, window));
        JOptionPane showAvg = new JOptionPane();// joptionpane to show user their average
        showAvg.showMessageDialog(window, printAvg);// sets average joptionpane type
        window.add(showAvg);// adds average joptionpane to window
        System.exit(0);
    }// end of main

    public static double fillAvg(ArrayList<Double> arrList, JFrame window) {
        try {
            double total = 0;
            for (int i = 0; i < arrList.size(); i++) {
                total += arrList.get(i).doubleValue();
            }
            if (!Double.isNaN(total / arrList.size())) {
                return total / arrList.size();
            } else {
                return 0;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(window, "An error has occurred", "Error", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }// method that takes user input as doubles and and indexes that number as days
     // in the array list

    public static void fillArrList(ArrayList<Double> arrList, int size, JFrame window) {
        for (int i = 0; i < size; i++) {
            arrList.add(getMonMons(window, i));
        }
    }// method adds values to each index of the array list

    public static int getSize(ArrayList<Double> arrList, JFrame window) {
        try {
            return Integer
                    .parseInt(JOptionPane.showInputDialog(window, "How many days were you on vacation?"));
        } catch (NumberFormatException e) {
            return getSize(arrList, window,
                    "Inncorrect, please enter a whole number with no letters or special characters.\n\nHow many days were you on vacation?");
        } catch (Exception e) {
            System.exit(1);
            return 0;
        }
    }// method prompts user for num of days for the array list and calls an
     // overloaded method if an error is encountered

    public static int getSize(ArrayList<Double> arrList, JFrame window, String message) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(window, message));
        } catch (NumberFormatException e) {
            return getSize(arrList, window,
                    "Please follow instructions. Input a number with no letters or special characters.\n\nHow many days were you on vacation?");
        } catch (Exception e) {
            System.exit(1);
            return 0;
        }
    }// overloaded method thats called recursively if enough errors are encountered

    public static double getMonMons(JFrame window, int VacadayNum) {
        try {
            return Double.parseDouble(
                    JOptionPane.showInputDialog(window,
                            "How much mon mons did you spend on day " + (VacadayNum + 1) + "?"));
        } catch (NumberFormatException e) {
            return getMonMons(window, VacadayNum,
                    "Incorrect, please enter a decimal number with no letters or special characters.\n\nHow much mon mons did you spend on day "
                            + (VacadayNum + 1) + "?");
        } catch (Exception e) {
            System.exit(1);
            return 0;
        }
    }// method prompts user for an amount of money for each day they were on
     // 'vacation' and calls an overloaded method if an error is encountered

    public static double getMonMons(JFrame window, int VacadayNum, String message) {
        try {
            return Double.parseDouble(JOptionPane.showInputDialog(window, message));
        } catch (NumberFormatException e) {
            return getMonMons(window, VacadayNum,
                    "Please follow instructions. Input a number with no letters or special characters.\n\nHow much mon mons did you spend on day "
                            + (VacadayNum + 1) + "?");
        } catch (Exception e) {
            System.exit(1);
            return 0;
        }
    }// overloaded method thats called recursively if enough errors are encountered

}// end of Main class