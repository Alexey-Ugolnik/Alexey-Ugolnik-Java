import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Book> listOfBookLLTask1 = Util.generateLinkedList(Util.LISTSIZE20);
        Util.printBooksLinkedList(listOfBookLLTask1);
        Util.removeElementFromLinkedList(listOfBookLLTask1);
        Util.printBooksLinkedList(listOfBookLLTask1);

        System.out.println("Task 2");
        HashSet<Book> listOfBookHS = Util.generateHashSet ();
        Util.printBooksHashSet(listOfBookHS);
        Util.printHashSetVowelslist(listOfBookHS);
        Util.printBooksHashSet(listOfBookHS);

        System.out.println("Task 3");
        List<Book> listOfBookLLTask3 = Util.generateLinkedList(Util.LISTSIZE25);
        Util.sort(listOfBookLLTask3, Util.authorSurname);
        Util.printBooksLinkedList(listOfBookLLTask3);
        Util.sort(listOfBookLLTask3, Util.authorName);
        Util.printBooksLinkedList(listOfBookLLTask3);
        Util.sort(listOfBookLLTask3, Util.authorPatronymic);
        Util.printBooksLinkedList(listOfBookLLTask3);

        System.out.println("Task 4");
        TreeSet<Student> listOfStudent = Util.generateTreeSetStudents(20);
        Util.printBooksLinkedListStudents(listOfStudent);
        Util.removeElementFromStudentList(listOfStudent);
        Util.printBooksLinkedListStudents(listOfStudent);
        System.out.println("Task 5");
    }
}