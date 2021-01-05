package co.hw.ex03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

public class DaoTest {
	
	private DataSource dataSource;
	
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	String sql = "select membername from member where memberid='hong'";
	
	public void run() {
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString("membername"));
			}
			System.out.println("DB 연결 성공!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
