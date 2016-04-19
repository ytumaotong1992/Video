package com.weibomovie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.weibomovie.db.DBUtil;
import com.weibomovie.model.Actor;
import com.weibomovie.model.ActorMovie;
import com.weibomovie.model.Director;

public class DirectorDao {

	public void addDirector(List<Director> directors) throws SQLException {

		Connection conn = DBUtil.getConnection();

		for (int i = 0; i < directors.size(); ++i) {
			Director director = directors.get(i);
			String sql = "insert into director (name , url) values(?, ?) ";
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, director.getName());
			ptmt.setString(2, director.getUrl());
			ptmt.execute();
		}
	}

	public Director getDirector(String directorStr) throws SQLException {
		Connection conn = DBUtil.getConnection();
		Director director = null;

		String sql = "select *from director where name=? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, directorStr);
		ResultSet rs = ptmt.executeQuery();
		while (rs.next()) {
			director = new Director(rs.getInt("id") , rs.getString("name") , rs.getString("url"));
		}
		return director;
	}
}