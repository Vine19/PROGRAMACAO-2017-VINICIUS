package ex5;

public class Book {

    private String name;
    private Author author;
    private double price;
    private int qntInStock;

    public Book(String name, Author author, double price, int quantidadeStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qntInStock = quantidadeStock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantidadeStock() {
        return qntInStock;
    }

    public void setQntInStock(int qntInStock) {
        this.qntInStock = qntInStock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\nQuantidade: " + this.qntInStock + "\nPreço: " + this.price;
    }
}
