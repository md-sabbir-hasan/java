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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EmployeeDao {

    DbUtil util = new DbUtil();
    PreparedStatement ps;
    ResultSet rs;
    String sql = null;

    public void saveUser(EmpData ed) {
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

//    public void showAllEmployee(JTable jt){
//        
//         String[] columnsName = {"id", "name", "salary", "email"};
//        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
//        jt.setModel(tableModel);
//    
//    }
    public List<EmpData> findAllEmp() {

//        String[] columnsName = {"id", "name", "salary", "email"};
//        DefaultTableModel tableModel = new DefaultTableModel(columnsName, 0);
//        jt.setModel(tableModel);
        sql = "select * from employee";

        List<EmpData> eList = new ArrayList<>();
        try {
            ps = util.getCon().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                EmpData e = new EmpData(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDouble("salary"),
                        rs.getString("email"));
                eList.add(e);

            }
            ps.close();
            rs.close();
            util.getCon().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return eList;
    }
}
