package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Component;

import Entity.Employee;
@Component
public class EmployeeRepository {

	private DataSource dataSource;

	public Employee save(Employee emp) {

		Connection con = getConnection();
		String que = "insert into emp (id,name,sal,address) values(?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(que);

			ps.setInt(1, emp.getId());
			ps.setString(2, emp.getName());
			ps.setDouble(3, emp.getSal());
			ps.setString(4, emp.getBranch());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}

	private Connection getConnection() {

		Connection con = null;
		try {
			con = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return con;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
