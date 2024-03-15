import java.util.LinkedList;

public class LibraryCard<K, V> {
    K cardNum;
    LinkedList<V> infoLog = new LinkedList<>();

    public LibraryCard(K cardNum, V initialInfo) {
        this.cardNum = cardNum;
       infoLog.add(initialInfo);
    }

    public K getCardNum() {
        return cardNum;
    }

    public LinkedList<V> getInfoLog() {
        return infoLog;
    }

    public void addInfo(V info) {
        infoLog.add(info);
    }

    @Override
    public String toString() {
        return "Библиотечная карточка{" +
                "Номер = " + cardNum +
                "," + infoLog +
                '}';
    }
}