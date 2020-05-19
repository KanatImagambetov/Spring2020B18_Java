package day41_Inheritance;

public class BooksObj {

    public static void main(String[] args) {
        EBook book1=new EBook();
        book1.title="Island of Treasure";
        book1.author="Shakesh";
        book1.price=1000;
        book1.size="1.5GB";
        book1.pages=432;
        System.out.println(book1);
        System.out.println("Size is "+book1.size);
        System.out.println("Pages: "+book1.pages);

        book1.readbook();
        System.out.println("=====================================");

        AudioBook abook=new AudioBook();
        abook.title="Becoming";
        abook.author="Michele Obama";
        abook.price=30;
        abook.length="19 hours and 3 minutes";
        System.out.println(abook);
        System.out.println("Length is "+abook.length);
        abook.listen();
    }
}
