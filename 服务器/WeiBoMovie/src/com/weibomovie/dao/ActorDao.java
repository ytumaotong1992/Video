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

public class ActorDao {

	public void addActor(List<Actor> actors) throws SQLException {

		Connection conn = DBUtil.getConnection(); 
		
 
		
		for(int i = 0; i < actors.size(); ++i){
			Actor actor = actors.get(i); 
			String sql = "insert into actor (name , url) values(?, ?) ";
			PreparedStatement ptmt = conn.prepareStatement(sql);
			ptmt.setString(1 , actor.getName());
			ptmt.setString(2, actor.getUrl());
			ptmt.execute();
		} 
	}

	public Actor getActor(String actorStr) throws SQLException { 
		Connection conn = DBUtil.getConnection();
		Actor actor = null;

		String sql = "select *from actor where name=? ";
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, actorStr);
		ResultSet rs = ptmt.executeQuery();
		while (rs.next()) {
			actor = new Actor(rs.getInt("id") , rs.getString("name") , rs.getString("url"));
		}
		return actor;
	} 
}
