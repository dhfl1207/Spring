package co.hw.spex.border.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import co.hw.spex.border.vo.BorderVo;

public class BorderDao implements BorderService {
	private DataSource dataSource;  //setter 주입방법으로 만듬
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	private final String SELECTLIST = "SELECT * FROM BORDER";
	private final String INSERT = "INSERT INTO BORDER(BORDERID, BORDERWRITER, BORDERTITLE, BORDERCONTENT) VALUES(?,?,?,?)";

	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public ArrayList<BorderVo> selectList() {
		ArrayList<BorderVo> list = new ArrayList<BorderVo>();
		BorderVo vo;
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(SELECTLIST);
			rs = psmt.executeQuery();
			while(rs.next()) {
				vo = new BorderVo();
				vo.setBorderId(rs.getInt("borderid"));
				vo.setBorderWriter(rs.getString("borderwriter"));
				vo.setBorderTitle(rs.getString("bordertitle"));
				vo.setBorderContent(rs.getString("bordercontent"));
				vo.setDate(rs.getDate("borderdate"));
				vo.setBorderHit(rs.getInt("borderhit"));
				list.add(vo);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return list;
	}

	@Override
	public BorderVo select(BorderVo vo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(BorderVo vo) {
		int n = 0;
		try {
			conn = dataSource.getConnection();
			psmt = conn.prepareStatement(INSERT);
			psmt.setInt(1, vo.getBorderId());
			psmt.setString(2, vo.getBorderWriter());
			psmt.setString(3, vo.getBorderTitle());
			psmt.setString(4, vo.getBorderContent());
			n = psmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		return n;
	}

	@Override
	public int delete(BorderVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BorderVo vo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private void close() {
		try {
			if(rs != null) rs.close();
			if(psmt != null) psmt.close();
			if(conn != null) conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
