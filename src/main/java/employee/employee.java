package employee;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class employee {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");// load driver
	Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe2","root","root");//2. Create Connection
	Statement s=c.createStatement();
// 	// ---------------------------------------------------
	// CREATE DATABASE
	// ---------------------------------------------------
    
//	s.execute("Create database if not exists employe2 ");
//    System.out.println("database created succesfully");
	
	
//  s.execute("Create table if not exists emp_details2(id int primary key, name varchar(30), salary double)");
//  System.out.println(" Table Created Succesfully");

	// ---------------------------------------------------
	// INSERT OPERATION
	// ---------------------------------------------------
  

	Scanner sc = new Scanner(System.in);
//  CallableStatement insert = c.prepareCall("{call insertemploye2(?,?,?)}");
//
//	System.out.println("Enter Id");
//	int id = sc.nextInt();
//	insert.setInt(1, id);
//
//	System.out.println("Enter Name");
//	sc.nextLine();
//	String name = sc.nextLine();
//	insert.setString(2, name);
//
//	System.out.println("Enter Salary");
//	double salary = sc.nextDouble();
//	insert.setDouble(3, salary);
//
//	insert.execute();
//
//	System.out.println("Data Inserted Successfully");

	
//	delimiter //
//	create procedure insertemploye2(in eid int,in ename varchar(30),in esalary double) // in Input parameters.
	
//	begin
//		insert into emp_details2 values(eid,ename,esalary);
//	end //
//	delimiter ;
	
	
	
	
	
	
	// ---------------------------------------------------
	// UPDATE OPERATION
	// ---------------------------------------------------
//	
//	CallableStatement update =
//			c.prepareCall("{call updateemploye2(?,?,?)}");
//
//			System.out.println("Enter Update Id");
//			int uid = sc.nextInt();
//			update.setInt(1, uid);
//
//			System.out.println("Enter New Name");
//			sc.nextLine();
//			String uname = sc.nextLine();
//			update.setString(2, uname);
//
//			System.out.println("Enter New Salary");
//			double usalary = sc.nextDouble();
//			update.setDouble(3, usalary);
//
//			update.execute();
//
//			System.out.println("Data Updated Successfully");
//	
	
	
//	delimiter //
//
//	create procedure updateemploye2(in eid int,in ename varchar(30),in esalary double)
//
//	begin
//		update emp_details2
//		set name=ename, salary=esalary where id=eid;
//	end //
//	delimiter ;
	
	
	// ---------------------------------------------------
	// FETCH OPERATION
	// ---------------------------------------------------

//	CallableStatement fetch =c.prepareCall("{call fetchemploye2()}");
//
//			ResultSet rs = fetch.executeQuery();
//
//			System.out.println("--------------------------------");
//			System.out.println("ID\tNAME\tSALARY");
//			System.out.println("--------------------------------");
//
//			while(rs.next()) {
//
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				double salary = rs.getDouble("salary");
//
//				System.out.println(id + "\t" + name + "\t" + salary);
//			}
//
//			System.out.println("--------------------------------");

//	delimiter //
//	create procedure fetchEmployee()
//	
//	begin
//
//		select * from emp_details2;
//	end //
//	delimiter ;
	
	// ---------------------------------------------------
	// DELETE OPERATION
	// ---------------------------------------------------
	
	CallableStatement delete =
			c.prepareCall("{call deleteemploye2(?)}");

			System.out.println("Enter Id To Delete");
			int did = sc.nextInt();

			delete.setInt(1, did);

			delete.execute();

			System.out.println("Data Deleted Successfully");
//			
//			delimiter //
//			create procedure deleteemploye2(in eid int)
//
//			begin
//				delete from emp_details2 where id=eid;
//			end //
//			delimiter ;
}
}
