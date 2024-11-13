import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Random;
public class PoncianoBookStore {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        String [] books = {
            "A Tale of Two Cities",
            "Don Quixote",
            "Dream of the Red Chamber",
            "Harry Potter and the Sorcerer's Stone",
            "Harry Potter and the Deathly Hallows",
            "Harry Potter and the Chamber of Secrets",
            "Harry Potter and the Half-Blood Prince",
            "Harry Potter and the Goblet of Fire",
            "She, a History of Adventure",
            "The Little Prince",
            "The Da Vinci Code",
            "The Hobbit",
            "The Lion, the Witch and the Wardrobe",
            "The Alchemist",
            "The Bible",
            "Atomic Habits",
            "Justine Cooks",
            "Good Energy",
            "The Book of Bill",
            "Soups, Salad, Sandwiches",
            "The Grey Wolf",
            "In Too Deep",
            "The Boyfriend",
            "The Waiting",
            "Fourth Wing",
            "Melania",
            "Framed",
            "War",
            "Be Ready When the Luck Happens",
            "Revenge of the Tipping Point"
        };

        double [] prices = {
            221.40,
            205.00,
            254.20,
            225.50,
            258.89,
            247.18,
            334.45,
            229.60,
            274.70,
            202.08,
            205.00,
            202.08,
            205.00,
            199.15,
            193.29,
            356.98,
            256.08,
            299.99,
            233.05,
            399.99,
            500.04,
            287.34,
            259.99,
            299.99,
            279.99,
            387.55,
            488.05,
            300.99,
            299.99,
            599.99
        };  

        System.out.println("Welcome to the Ponciano BookStore!");

    }
}