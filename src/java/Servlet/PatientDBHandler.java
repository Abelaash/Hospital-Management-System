package Servlet;


import Model.Patient;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PatientDBHandler {
    
public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
        
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
    public static int AddPat(Patient e){  
        int status=0;  
        try{  
            Connection con=PatientDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "insert into user905(name,email,address,city,doctorid,type) values (?,?,?,?,?,?)");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getEmail());  
            ps.setString(3,e.getAddress());  
            ps.setString(4,e.getCity());
            ps.setString(5,e.getDoctor()); 
            ps.setString(6,e.getType()); 
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int update(Patient e){  
        int status=0;  
        try{  
            Connection con=PatientDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement(  
                         "update user905 set name=?,email=?,address=?,city=?,doctorid=?,type=? where id=?");  
            ps.setString(1,e.getName());  
            ps.setString(2,e.getEmail());  
            ps.setString(3,e.getAddress());  
            ps.setString(4,e.getCity());
            ps.setString(5,e.getDoctor()); 
            ps.setString(6,e.getType());  
            ps.setInt(7,e.getId());  
              
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    }  
    public static int delete(int id){  
        int status=0;  
        try{  
            Connection con=PatientDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("delete from user905 where id=?");  
            ps.setInt(1,id);  
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return status;  
    }  
    public static Patient getPatientById(int id){  
        Patient e=new Patient();  
          
        try{  
            Connection con=PatientDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905 where id=?");  
            ps.setInt(1,id);  
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setEmail(rs.getString(3));  
                e.setAddress(rs.getString(4));  
                e.setCity(rs.getString(5));
                e.setDoctor(rs.getString(6));
                e.setType(rs.getString(7));
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return e;  
    }  
    public static List<Patient> getAllPatients(){  
        List<Patient> list=new ArrayList<Patient>();  
          
        try{  
            Connection con=PatientDBHandler.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from user905");  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Patient e=new Patient();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setEmail(rs.getString(3));  
                e.setAddress(rs.getString(4));  
                e.setCity(rs.getString(5));
                e.setDoctor(rs.getString(6));
                e.setType(rs.getString(7));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){e.printStackTrace();}  
          
        return list;  
    }  
}  