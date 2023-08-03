package lambda;

import java.util.ArrayList;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Лев Николаевич Толстой", "Война и мир", "Роман", 900, 150);
        Book b2 = new Book("Николай Васильевич Гоголь", "Мертвые души", "Роман", 100, 100);
        Book b3 = new Book("Александр Сергеевич Пушкин", "Капитанская дочка", "Роман", 230, 200);
        Book b4 = new Book("Федор Михайлович Достаевский", "Преступление и наказание", "Филосовский роман", 190, 110);
        Book b5 = new Book("Иван Сергеевич Тургенев", "Отцы и дети", "Роман", 100, 130);
        Book b6 = new Book("Михаил Афанасьевич Булгаков", "Мастер и Маргарита", "Сатира", 270, 70);
        Book b7 = new Book("Михаил Александрович Шолохов", "Тихий Дон", "Роман", 560, 83);
        ArrayList<Book> library = new ArrayList<>();
        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);
        library.add(b5);
        library.add(b6);
        library.add(b7);

        TestBook testBook = new TestBook();
        testBook.printSortUnderNumberOfPages(library);
        System.out.println("---------------------------------------");

        //Создали анонимный класс, который выполняет сортировку по кол-ву страниц в книге
        testBook.testSort(library, bk -> bk.getNumberOfPages() > 500);
        System.out.println("---------------------------------------");
        //Сортировка с помощью лямбда выражения
        testBook.testSort(library, (Book bk) -> bk.getNumberOfPages() > 500);
        System.out.println("---------------------------------------");
        //более совершенная запись выражения
        testBook.testSort(library, bk -> bk.getNumberOfPages() < 500);
        System.out.println("---------------------------------------");
    }


    //Метод сортировки по номерам страниц
    void printSortUnderNumberOfPages(ArrayList<Book> al) {
        for (Book b : al) {
            if (b.getNumberOfPages() < 500) {
                System.out.println(b);
            }
        }
    }

    // метод сортировки по номерам страниц, который использут метод функционального интерфейса
    void testSort(ArrayList<Book> al, BookCheck bookCheck) {
        for (Book b : al) {
            if (bookCheck.check(b)) {
                System.out.println(b);
            }
        }
    }
}

interface BookCheck {
    boolean check(Book bk);
}
