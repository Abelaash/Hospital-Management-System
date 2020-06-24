package Servlet;



import Model.Doctor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DoctorDBHandler {
    
public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int AddDoc(Doctor d){  
        int status=0;  
        try{  
            Connection con=DoctorDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into docuser(name,email,office,phone) values (?,?,?,?)");  
            ps.setString(1,d.getName());  
            ps.setString(2,d.getEmail());  
            ps.setString(3,d.getOffice());  
            ps.setString(4,d.getPhone()); 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Doctor d){  
        int status=0;  
        try{  
            Connection con=DoctorDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update docuser set name=?,email=?,office=?,phone=? where id=?");  
            ps.setString(1,d.getName());  
            ps.setString(2,d.getEmail());  
            ps.setString(3,d.getOffice());  
            ps.setString(4,d.getPhone()); 
            ps.setInt(5,d.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=DoctorDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from docuser where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Doctor getDoctorById(int id){  
        Doctor d=new Doctor();  
          
        try{  
            Connection con=DoctorDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from docuser where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                d.setId(rs.getInt(1));  
                d.setName(rs.getString(2));  
                d.setEmail(rs.getString(3));  
                d.setOffice(rs.getString(4));  
                d.setPhone(rs.getString(5));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return d;  
    }  
    public static List<Doctor> getAllDoctors(){  
        List<Doctor> list=new ArrayList<Doctor>();  
          
        try{  
            Connection con=DoctorDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from docuser");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Doctor d=new Doctor();  
                d.setId(rs.getInt(1));  
                d.setName(rs.getString(2));  
                d.setEmail(rs.getString(3));  
                d.setOffice(rs.getString(4));  
                d.setPhone(rs.getString(5)); 
                list.add(d);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  