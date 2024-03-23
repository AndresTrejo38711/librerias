import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> availableBooks;

    public Library() {
        availableBooks = new ArrayList<>();
    }
    public List<Book> getAllBooks() {
        return availableBooks;
    }

    public void addBook(Book book) {
        availableBooks.add(book);
    }

    public void removeBook(Book book) {
        boolean removed = availableBooks.remove(book);
        if (removed) {
            System.out.println("Libro eliminado con éxito: " + book.getTitle());
        } else {
            System.out.println("El libro no está en la biblioteca.");
        }
    }

    public void borrowBook(Book book) {
        if (availableBooks.contains(book)) {
            availableBooks.remove(book);
            System.out.println("Libro prestado con éxito: " + book.getTitle());
        } else {
            System.out.println("El libro no está disponible en la biblioteca.");
        }
    }

    public void returnBook(Book book) {
        if (!availableBooks.contains(book)) {
            availableBooks.add(book);
            System.out.println("Libro devuelto con éxito: " + book.getTitle());
        } else {
            System.out.println("El libro ya está disponible en la biblioteca.");
        }
    }

    public void displayAvailableBooks() {
        if (availableBooks.isEmpty()) {
            System.out.println("No hay libros disponibles en la biblioteca.");
        } else {
            System.out.println("Libros disponibles en la biblioteca:");
            for (Book book : availableBooks) {
                System.out.println("- " + book.getTitle() + " por " + book.getAuthor());
            }
        }
    }
}
