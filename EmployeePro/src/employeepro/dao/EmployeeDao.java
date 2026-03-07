
package employeepro.dao;

import employeepro.model.EmpData;
import employeepro.util.DbUtil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EmployeeDao {
    
    
    DbUtil util = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;
    public void saveUser(EmpData ed){
        sql = "insert into user(name, salary, email) values(?,?,?)";
        try {
          
            ps = util.getCon().prepareStatement(sql);
            ps.setString(1, ed.getName());
            ps.setDouble(2, ed.getSalary());
            ps.setString(3, ed.getEmail());
             
            ps.close();
            util.getCon().close();
           


            JOptionPane.showMessageDialog(null, "Data Saved");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data not Save");
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
    public List<EmpData> findAllEmp(){
    sql = "select * from employee";
    
    List<EmpData> eList= new ArrayList<>();
    return eList;
    }
}
