package com.testAutomationCoach.bVariables;

class Book {
    String title;
    String author;
    Book(String title, String author) { //la clase estaba mal definida. le hacia falta agegar el orden de los valores a agrear e inicializarlos
        this.title = title;
        this.author = author;
    }
}
//debugear

class BookTestDrive {
    public static void main(String [] args) {


        Book [] myBooks = new Book[3]; //arreglo de libros, hasta 3 posiciones de memoria.
        int x = 0; //inicializa x en cero
        myBooks[0] = new Book("The Grapes of Java","bob");
        myBooks[1] = new Book("The Java Gatsby","sue");
        myBooks[2] = new Book("The Java Cookbook","ian");
        /*myBooks[0].title = "The Grapes of Java"; //posicion 0 contiene el titulo
        myBooks[1].title = "The Java Gatsby";// posicion 1 contiene el titulo
        myBooks[2].title = "The Java Cookbook";  // posicion 2 contiene el titulo
        myBooks[0].author = "bob"; //posicion 0 contiene el autor
        myBooks[1].author = "sue"; //posicion 1 contiene el autor
        myBooks[2].author = "ian"; //posicion 2 contiene el autor*/


        while (x < 3) { //mientras x sea menor a 3, entra
            System.out.print(myBooks[x].title); //imprime el titulo del libro en la posicion de X
            System.out.print(" by ");
            System.out.println(myBooks[x].author);// imprime el autor del libro en la posicion de X
            x += 1;// le suma 1 a x
        }
    }
}
