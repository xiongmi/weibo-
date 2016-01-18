<%

   // String url = request.getHeader("Referer");
String path =request.getQueryString();
    String code = path.substring(path.lastIndexOf("=")+1,path.length());
out.write(code);
   // out.write("[code] "+
   //code);

%>