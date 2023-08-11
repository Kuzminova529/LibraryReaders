import java.util.HashMap;

public class Main {
    private HashMap<Integer, Reader> usrMap;
    private static int userID;

    public Main() {
        usrMap = new HashMap<>();//инициализаия нового HashMap
    }

    public boolean addReader(Reader user) {
        if (!usrMap.containsValue(user)) {// если user нет в списке
            usrMap.put(++userID, user);// то его добавляет под новым ID
            return true;
        } else {
            return false;
        }
    }

    public Reader getUser(int id) {
        if (usrMap.containsKey(id)) {// если в usrMap усть ID
            return usrMap.get(id);// то возвращает наше ID
        } else {
            return null;
        }
    }
}