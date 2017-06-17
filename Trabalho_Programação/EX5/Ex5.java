package ex5;

public class Ex5 {

    public static void main(String[] args) {

        Author author = new Author("Vinicius de Moraes", "Viniciusdemoraes123@hotmail.com", 'M');
        Book book = new Book("O poeta aprendiz", author, 20, 70);

        System.out.println(book.toString());
        System.out.println(book.getAuthor().toString());
    }
}
