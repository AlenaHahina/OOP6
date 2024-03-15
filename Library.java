import java.util.ArrayList;

public class Library<T, K> {
    ArrayList<Bibliomix<T>> bibliomixs = new ArrayList<>();
    ArrayList<LibraryCard<K, CardInfo<T>>> cards = new ArrayList<>();

    public ArrayList<Bibliomix<T>> getBibliomixs() {
        return bibliomixs;
    }

    public ArrayList<LibraryCard<K, CardInfo<T>>> getCards() { 
        return cards;
    }

    public void addBook(Book<T> book, K cardNum) { 
        bibliomixs.add(book);
        CardInfo<T> initCardInfo = new CardInfo<>(book.getTitle());
        cards.add(new LibraryCard<>(cardNum, initCardInfo));
    }

    public void provideBook(T title) {
        for (LibraryCard<K, CardInfo<T>> card : cards) {
            if (card.getInfoLog().getLast().getTitle().equals(title))
                     {
                card.addInfo(new CardInfo<>(title));
            } 
        }
    }

    private Bibliomix<T> getBookByTitle(T title) {
        for (Bibliomix<T> books : bibliomixs) {
            if (books.getTitle().equals(title)) {
                return books;
            }
        }
        return null;
    }

    public void showProvidedBooksAndCards() {
        for (LibraryCard<K, CardInfo<T>> card : cards) {
            {
                System.out.println(getBookByTitle(card.getInfoLog().getLast().getTitle()) + " --> " + card);
            }
        }
    }
}