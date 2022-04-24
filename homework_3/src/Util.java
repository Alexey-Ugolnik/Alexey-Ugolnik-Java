import java.util.*;

public class Util implements TitleLists {

    public static final int LISTSIZE20 = 20;

    public static final int LISTSIZE25 = 25;

    public static final int NUMBERREMOVEELEMENT = 7;

    public static int INDEXBOOK = 0;
    public static int INDEXUSER = 0;

    public static String authorName;
    public static String authorSurname;
    public static String authorPatronymic;

    public static int getRandomIndexBook() {
        INDEXBOOK = (int) Math.floor(Math.random() * (TITLELIST.length));
        return INDEXBOOK;
    }

    public static int getRandomIndex() {
        INDEXUSER = (int) Math.floor(Math.random() * (USERNAME.length));
        return INDEXUSER;
    }

    public static String getBookTitle() {
        getRandomIndexBook();
        return TITLELIST[INDEXBOOK];
    }

    public static String getBookAuthorName() {
        return NAMEAUTHORLIST[INDEXBOOK];
    }

    public static String getBookAuthorSurname() {
        return SURNAMEAUTHORLIST[INDEXBOOK];
    }

    public static String getBookAuthorPatronymic() {
        return PATRONYMICAUTHORLIST[INDEXBOOK];
    }

    public static String getUserName() {
        getRandomIndex();
        return USERNAME[INDEXUSER];
    }

    public static String getUserSurname() {
        getRandomIndex();
        return USERSURNAME[INDEXUSER];
    }

    public static String getRandomString(int length) {
        String str = "ХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХХ";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = new Random().nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static List<Book> generateLinkedList(int LISTSIZE20) {
        List<Book> listOfBooks = new LinkedList<>();
        for (int i = 0; i < LISTSIZE20; i++) {
            Book book = new Book();
            listOfBooks.add(book);
        }
        return listOfBooks;
    }

    public static TreeSet<Student> generateTreeSetStudents(int count) {
        TreeSet<Student> listOfStudent = new TreeSet<>();
        for (int i = 1; i < count; i++) {
            listOfStudent.add(new Student(i));
        }
        return listOfStudent;
    }

    public static void printBooksLinkedList(List<Book> list) {
        System.out.println(list);
    }

    public static void printBooksLinkedListStudents(TreeSet<Student> list) {
        System.out.println(list);
    }

    public static void printBooksHashSet(Set<Book> set) {
        System.out.println(set);
    }

    public static void removeElementFromLinkedList(List<Book> list) {
        list.remove(NUMBERREMOVEELEMENT);
    }

    public static void removeElementFromStudentList(TreeSet<Student> list) {
        int listSize = list.size();
        for (int i = 1; i <= listSize;i++) {
            if (i % 2 != 0) {
                list.remove(new Student(i));
            }
        }
    }

    public static void printHashSetVowelslist(Set<Book> set) {
        String s = "ХХХХХХХХХХХХХХХХХХХХХХХХХХХХХ";
        for (int i = 0; i < s.length(); i++) {
            int k = s.indexOf(s.charAt(i));
            set.removeIf(element -> element.getTitle().charAt(0) == s.toUpperCase().charAt(k));
        }
    }

    public static HashSet<Book> generateHashSet() {
        HashSet<Book> listOfBooks = new HashSet<>();
        for (int i = 0; i < 19; i++) {
            Book book = new Book();
            listOfBooks.add(book);
        }

        for (int i = 0; i < 6; i++) {
            Book book = new Book("Без названия",
                    "Без автора",
                    "Без фамилии",
                    "Без отчества");
            listOfBooks.add(book);
        }
        return listOfBooks;
    }

    public static void sort(List<Book> book, String value) {
        if (value == authorName) {
            Collections.sort(book, new Book.ComparatorAuthorName());
        }
        if (value == authorSurname) {
            Collections.sort(book, new Book.ComparatorAuthorSurname());
        }
        if (value == authorPatronymic) {
            Collections.sort(book, new Book.ComparatorAuthorPatronymic());
        }
    }

}