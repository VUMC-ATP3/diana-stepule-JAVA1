package classroomFive.pirmaisUzdevums;

import classroomFive.encapsulation.Wheather;

public class Main {
    public static void main(String[] args) {
        Wheather weather = new Wheather();
        Author JKRowling = new Author(" JK Rowling", "JK@gmail.com", 'F');
        Author Rainis = new Author("Jānis Rainis", "JR@gmail.com", 'M');

        Book bookOne = new Book("Harry Potter", JKRowling, new Cena(15.99, '$'));
        Book bookTwo = new Book("Vasaras dārzs", Rainis, new Cena(9.99, 'E'));
        System.out.println(bookTwo.toString());
        bookTwo.price.discount(30);
        System.out.println(bookTwo.toString());

        System.out.println(bookOne.author.toString());


    }
}

