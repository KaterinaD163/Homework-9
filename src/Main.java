public class Main {
    public static void main(String[] args) {
        Author author = new Author("Herman", "Hesse");
        Book book = new Book ("Bead game", author, 1943);
        System.out.println("«" + book.getTitle() + "»" + " " + author.getName() + " " + author.getSurname() + ", год публикации - " + book.getYearOfPublication());
        book.setYearOfPublication(1969);
        System.out.println("год публикации на руском языке - " + book.getYearOfPublication());
        Author author1 = new Author("Erich", "Remarque");
        Book book1 = new Book("Arch of Triumph", author1, 1945);
        System.out.println("«" + book1.getTitle() + "»" + " " + author1.getName() + " " + author1.getSurname() + ", год публикации - " + book1.getYearOfPublication());
    }
}
