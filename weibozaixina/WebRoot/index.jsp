
<%@ page language="java" pageEncoding="UTF-8"%>
<%

   // String url = request.getHeader("Referer");
    String path =request.getQueryString();
    String code = path.substring(path.lastIndexOf("=")+1,path.length());
    out.write(code);
    
    request.setCharacterEncoding("UTF-8");
    
    request.setAttribute("code",code);
    
  //  response.sendRedirect("servlet/update");
          ServletContext sc = getServletContext();
         RequestDispatcher rd = null;
       //  rd = sc.getRequestDispatcher("/servlet/update");      //定向的页面
         rd = sc.getRequestDispatcher("/send.jsp"); 
         rd.forward(request, response);






%>
