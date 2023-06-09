package com.kimjieun99.cotroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FileUploadForm")
public class FileUploadForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public FileUploadForm() {
        super();
       
    }


	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		RequestDispatcher dispatcher = 
				request.getRequestDispatcher("/WEB-INF/board/file_upload.jsp");
		dispatcher.forward(request, response);

	}

}
