/*in the program use Arraylist<> and Arraylist<> method like this add remove etc....
 * and create mini libarary */

package cfw;

import java.util.ArrayList;

class note {
    public String name, author;

    public note(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String toString() {
        return name + " " + author;
    }
}

class library1 {

    public ArrayList<note> book;

    public library1(ArrayList<note> book) {
        this.book = book;
    }


    public void addbook(note book) {
        System.out.println(book + " : this book is added");
        this.book.add(book);
    }

    public void issueBook(note book, String issued_to) {
        System.out.println(book + " : The book has been issued from the library to " + issued_to);
        this.book.remove(book);
    }

    public void returnbook(note bk) {
        System.out.println(book + " : this book is returned");
        this.book.add(bk);
    }
}

public class book_labrary_03 {
    public static void main(String[] args) {

        ArrayList<note> bok = new ArrayList<>();

        note b1 = new note("Algorithms", "CLRS\n");
        bok.add(b1);

        note b2 = new note("ramayan", "valmiki\n");
        bok.add(b2);

        note b3 = new note("mahabharat", "Ved Vyasa\n");
        bok.add(b3);

        note b4 = new note("gita", "krushna\n");
        bok.add(b4);

        note b5 = new note("java", "ram patil\n");
        bok.add(b5);

        library1 l = new library1(bok);
        l.issueBook(b2, " : Amol");

        l.addbook(new note("c++", "kantekar\n"));

        l.returnbook(b2);


        System.out.println("\n");
        System.out.println(l.book);


    }


}
