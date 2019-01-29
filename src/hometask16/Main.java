package hometask16;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book();
        Author author1 = new Author();


        book1.setTitle("The Picture Of Dorian Gray");
        System.out.println(book1.getTitle());
        book1.setPages(250);
        System.out.println(book1.getPages());
        book1.setAuthorInfo("Oscar Wilde 1854-1900");
        System.out.println(book1.getAuthorInfo());


        author1.setNameSurname("Oscar Wilde");
        System.out.println(author1.getNameSurname());
        author1.setBirthYear(1854);
        System.out.println(author1.getBirthYear());

    }
}
