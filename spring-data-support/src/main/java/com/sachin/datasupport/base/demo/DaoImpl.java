package com.sachin.datasupport.base.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.rowset.SqlRowSet;

public class DaoImpl {
	
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	
	
	public Circle getCircle(int id)
	{
		Circle circle = null;
		Connection connection = null;
		try
		{
		connection = dataSource.getConnection();
		PreparedStatement stmt = connection.prepareStatement("SELECT * FROM circle WHERE id = ?");
		stmt.setInt(1, id);
		
		ResultSet result = stmt.executeQuery();
		if(result.next())
		{
			circle = new Circle();
			circle.setId(id);
			circle.setName(result.getString("circle_name"));
		}
		
	    	stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return circle;
	}
	
	public int getCircleCount()
	{
		String query = "SELECT COUNT(*) FROM circle";
		return jdbcTemplate.queryForObject(query, int.class);
	}

	public String getCircleNameForId(int id)
	{
		String query = "SELECT cl.circle_name FROM circle cl WHERE id = ?";
		return jdbcTemplate.queryForObject(query, new Object[] {id},String.class);
	}
	
	public Circle getCircleForId(int id)
	{
		String query = "SELECT * FROM circle cl WHERE id = ?";
		return jdbcTemplate.queryForObject(query, new Object[] {id}, new CircleMapper());
	}
	
	public List<Circle> getAllCircles()
	{
		String query = "SELECT * FROM circle";
		return jdbcTemplate.query(query, new CircleMapper());
	}
	
	private static final class CircleMapper implements RowMapper<Circle>
	{

		@Override
		public Circle mapRow(ResultSet result, int arg1) throws SQLException {
			
			Circle circle = new Circle();
			circle.setId(result.getInt("id"));
			circle.setName(result.getString("circle_name"));
			
			return circle;
		}
		
	}
	
	/*public void addCircle(Circle circle)
	{
		String query = "INSERT INTO circle VALUES(?,?)";
		jdbcTemplate.update(query, new Object[] {circle.getId(),circle.getName()});
	}
	*/
	
	public void addCircle(Circle circle)
	{
		String query = "INSERT INTO circle VALUES(:id,:name)";
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource("id", circle.getId())
				.addValue("name", circle.getName());
		
		namedParameterJdbcTemplate.update(query, sqlParameterSource);
	}
	
	public void createTriangle()
	{
		String query = "CREATE TABLE TRIANGLE (ID INT, NAME VARCHAR(100))";
		jdbcTemplate.execute(query);
	}

	public DataSource getDataSource() {
		return dataSource;
	}


	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
