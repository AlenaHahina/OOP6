public class Book<T> implements Bibliomix<T> {  //реализуем DIP имплементируя интерфейс Bibliomix<T>
    
    private final T title;

    public Book(T title) {
        this.title = title;
    }

    public T getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Книга{" +
                "Наименование = " + title +
                '}';
    }
}