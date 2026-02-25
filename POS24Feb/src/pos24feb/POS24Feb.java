
package pos24feb;

import pos24feb.dao.UserDao;
import pos24feb.model.User;

public class POS24Feb {

    public static void main(String[] args) {
        User u = new User("sabbir", "1234");
        UserDao ud= new UserDao();
        ud.saveUser(u);
    }
    
}
