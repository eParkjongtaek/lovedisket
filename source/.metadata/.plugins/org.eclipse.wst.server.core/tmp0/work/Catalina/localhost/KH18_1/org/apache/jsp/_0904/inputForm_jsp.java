package org.apache.jsp._0904;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inputForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>회원가입</title>\r\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("function checkIt() \r\n");
      out.write("{\r\n");
      out.write("\t\r\n");
      out.write("\tvar userinput = eval(\"document.userinput\");\r\n");
      out.write("\tif(!userinput.id.value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"ID를 입력하세요!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(!userinput.passwd.value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"비밀번호를 입력하세요!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(userinput.passwd.value != userinput.passwd2.value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"비밀번호가 같아요~\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(!userinput.name.value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"이름을 입력하세요!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\tif(!userinput.jumin1.value || !userinput.jumin2.value)\r\n");
      out.write("\t{\r\n");
      out.write("\t\talert(\"주민등록번호를 입력하세요!\");\r\n");
      out.write("\t\treturn false;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"wrap\">\r\n");
      out.write("\t<form action=\"inputPro.jsp\" name=\"userinput\" onsubmit=\"return checkIt();\" method=\"post\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<h1>★회원가입★</h1>\r\n");
      out.write("\t\t<div id=\"body\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<table width=\"500px;\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t\t<col width=\"20%\"/>\r\n");
      out.write("\t\t\t\t\t<col width=\"*\"/>\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</colgroup>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\" class=\"subTitle\">*아이디 입력</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>사용자 ID</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"id\" maxlength=\"12\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" name=\"confirm_id\" value=\"ID 중복확인\" class=\"inputBtn\" onclick=\"javascript:openConfirmid(this.form);\" />\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>비밀번호</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"passwd\" maxlength=\"12\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>비밀번호 확인</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"passwd2\" maxlength=\"12\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th colspan=\"2\" class=\"subTitle\">*개인정보 입력</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>사용자 이름</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"name\" maxlength=\"10\" />\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>주민등록 번호</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"jumin1\" maxlength=\"6\" /> -\r\n");
      out.write("\t\t\t\t\t\t<input type=\"password\" name=\"jumin2\" maxlength=\"7\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>E-MAIL</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"email\" class=\"w300\" maxlength=\"30\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>Blog</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"blog\" class=\"w300\" maxlength=\"50\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>우편번호</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"zipcode\" /><input type=\"button\" value=\"우편번호 검색\" class=\"inputBtn\" onclick=\"javascript:zipCheck();\" />\r\n");
      out.write("\t\t\t\t\t\t<span>우편번호를 입력하세요.</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>주소</th>\r\n");
      out.write("\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"address\" class=\"w380\" />\r\n");
      out.write("\t\t\t\t\t\t<span class=\"descB\">주소를 입력하세요.</span>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"footer\">\r\n");
      out.write("\t\t\t<input type=\"submit\" name=\"confirm\" class=\"inputBtn\" value=\"등 록\" />\r\n");
      out.write("\t\t\t<input type=\"reset\" name=\"reset\" class=\"inputBtn\" value=\"다시입력\" />\t\t\t\r\n");
      out.write("\t\t\t<input type=\"button\" class=\"inputBtn\" onclick=\"javascript:window.location='main.jsp'\" value=\"취 소\" />\r\n");
      out.write("\t\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("</div>\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
