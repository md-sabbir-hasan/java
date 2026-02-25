package pos24feb.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos24feb.model.User;
import pos24feb.util.Dbutil;

public class UserDao {

    Dbutil util = new Dbutil();
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    
    public void saveUser(User user){
    sql = "insert into user(userName, password) values(?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            
            System.out.println("Data Saved");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
