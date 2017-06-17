package ex5;

public class Author {

    private String name;
    private String email;
    private char genero;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.genero = genero;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Nome: " + this.name + "\nEmail: " + this.email + "\nSexo: " + this.genero;
    }
}
