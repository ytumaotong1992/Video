package com.weibomovie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.weibomovie.db.DBUtil;
import com.weibomovie.model.ActorMovie;

public class ActorMovieDao {

	public void addActor(List<ActorMovie> actorList) throws SQLException {

		Connection conn = DBUtil.getConnection();
		int movie_id = actorList.get(0).getMovie_id();
		String sql = "select *from actormovie where movie_id=? ";
		PreparedStatement ptmtSelect = conn.prepareStatement(sql);
		ptmtSelect.setInt(1, movie_id);
		ResultSet rs = ptmtSelect.executeQuery();

		rs.last();
		int rawCount = rs.getRow();
		if (rawCount == 0) {
			for (ActorMovie actor : actorList) {
				sql = "insert into actormovie (name , movie_id) values(?,?)";
				PreparedStatement ptmt = conn.prepareStatement(sql);
				ptmt.setString(1, actor.getName());
				ptmt.setInt(2, actor.getMovie_id());
				ptmt.execute();
			}
		}
	}

	public String getActorByMovie(int movie_id) throws SQLException {
		String actors = "";
		Connection conn = DBUtil.getConnection();
		String sql = "select *from actormovie where movie_id=? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setInt(1, movie_id);
		ResultSet rs = ptmt.executeQuery();

		while (rs.next()) {
			actors += rs.getString("name");
			actors += "/";
		}
		return actors;
	}

}