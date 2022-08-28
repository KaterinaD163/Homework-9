public class Main {
    public static void main(String[] args) {
        Book book = new Book("Bead game", "H.Hesse", 1943);
        System.out.println("book.title - " + book.getTitle());
        System.out.println("book.authorName - " + book.getAuthorName());
        System.out.println("book.yearOfPublication - " + book.getYearOfPublication());
        book.setYearOfPublication(1969);
        System.out.println("book.getYearOfPublication() - " + book.getYearOfPublication());
        Author author = new Author("Herman", "Hesse");
        System.out.println("author.name - " + author.getName());
        System.out.println("author.surname - " + author.getSurname());
        Book book1 = new Book("Arch of Triumph", "E.Remarque", 1945);
        System.out.println("book1.title - " + book1.getTitle());
        System.out.println("book1.authorName - " + book1.getAuthorName());
        System.out.println("book1.yearOfPublication - " + book1.getYearOfPublication());
        Author author1 = new Author("Erich", "Remark");
        System.out.println("author1.name - " + author1.getName());
        System.out.println("author1.surname - " + author1.getSurname());
    }
}