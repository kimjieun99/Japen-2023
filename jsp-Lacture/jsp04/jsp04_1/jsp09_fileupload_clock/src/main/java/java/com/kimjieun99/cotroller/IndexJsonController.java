package com.kimjieun99.cotroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.kimjieun99.model.ClockDao;
import com.kimjieun99.model.ClockDto;


@WebServlet("/index/clockJson")
public class IndexJsonController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public IndexJsonController() {
        super();
   
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		ArrayList<ClockDto> clockList = null;
		ClockDao clockDao = new ClockDao();
		clockDao.getAllClock();
		
		Gson gson = new Gson();
		String clockJsonList = gson.toJson(clockList);
		
		request.setAttribute("clockJosnList", gson);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/index_json.jsp");
        dispatcher.forward(request, response);
	}

}
