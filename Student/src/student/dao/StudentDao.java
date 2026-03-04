package student.dao;

import com.mysql.cj.protocol.Resultset;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import student.Student;
import student.model.StuData;
import student.util.Dbutil;

public class StudentDao {

    Dbutil util = new Dbutil();
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;

    public void save(StuData studata) {
        sql = "insert into studata(name, course, mobile, bloodGroup) values(?,?,?,?)";
        try {
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, studata.getName());
            ps.setString(2, studata.getCourse());
            ps.setString(3, studata.getMobile());
            ps.setString(4, studata.getBloodGroup());
            ps.executeUpdate();
            
            ps.close();
            util.getCon().close();
            JOptionPane.showMessageDialog(null, "Data Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data not Save");
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
