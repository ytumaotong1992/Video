package com.weibomovie.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.weibomovie.dao.ActorMovieDao;
import com.weibomovie.dao.DirectorMovieDao;
import com.weibomovie.dao.MovieDao;
import com.weibomovie.db.Constant;
import com.weibomovie.model.Movie;
import com.weibomovie.weiboapi.MovieDetailData;

public class MovieSearchServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public MovieSearchServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String name =  request.getParameter("name") ;
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();

		/*
		 * if(Constant.isOpenDownloadData()){
		 * 
		 * }
		 */
		/*String result = null;
		result = new MovieDetailData().getMovieDetail(movie_id);
		if (Constant.isOpenSyso()) {
			System.out.println(result);
		}*/
		JSONObject jsonObject = new JSONObject();
		JSONObject dataObject = new JSONObject();

		MovieDao movieDao = new MovieDao();
		Movie movie = new Movie();

		ActorMovieDao actorDao = new ActorMovieDao();
		String actors = null;

		DirectorMovieDao directorDao = new DirectorMovieDao();
		String director = "";
		try {
			movie = movieDao.getMovieSearch(name);
			actors = actorDao.getActorByMovie(movie.getId());
			director = directorDao.getDirectorByMovie(movie.getId());
			dataObject.put("movie", movie);
			dataObject.put("actors", actors);
			dataObject.put("director", director);
			jsonObject.put("ret", "success");
			jsonObject.put("data", dataObject);
		} catch (SQLException e) {
			e.printStackTrace();
			dataObject.put("movie", "");
			dataObject.put("actors", "");
			dataObject.put("director", "");
			jsonObject.put("ret", "error");
			jsonObject.put("data", dataObject);
		}

		out.println(jsonObject);
		if (Constant.isOpenSyso()) {
			System.out.println(jsonObject.toString());
		}

		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
