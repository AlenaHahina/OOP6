
public class CardInfo<T> {
    private final T title;
    
   

    public CardInfo(T title) {
        this.title = title;
        
    }

    public T getTitle() {
        return title;
    }



    @Override
    public String toString() {
        return 
                "Наименование=" + title;
                
    }
}




