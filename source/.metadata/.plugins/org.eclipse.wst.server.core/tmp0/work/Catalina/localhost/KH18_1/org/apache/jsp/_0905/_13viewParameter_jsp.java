package org.apache.jsp._0905;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Enumeration;
import java.util.Map;

public final class _13viewParameter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=euc-kr");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	request.setCharacterEncoding("euc-kr");

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("\t<head><title>요청 파라미터 출력</title></head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<b>request.getParameter() 메소드 사용</b><br/>\r\n");
      out.write("\t\tname 파라미터 = ");
      out.print(request.getParameter("name") );
      out.write("<br/>\r\n");
      out.write("\t\taddress 파라미터 = ");
      out.print(request.getParameter("address") );
      out.write("<br/>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<b>request.getParameterValues() 메소드 사용</b><br>\r\n");
      out.write("\t\t\t");

				String[] values = request.getParameterValues("pet");
				if(values != null)
				{
					for(int i = 0; i< values.length; i++)
					{
			
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(values[i]);
      out.write("\r\n");
      out.write("\t\t\t");

					}
				}
			
      out.write("\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<b>request.getParameterNames() 메소드 사용</b><br/>\r\n");
      out.write("\t\t\t");

				Enumeration paramEnum = request.getParameterNames();
				while(paramEnum.hasMoreElements())
				{
					String name = (String)paramEnum.nextElement();
			
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      out.print(name);
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t\t<p>\r\n");
      out.write("\t\t\t<b>request.getParameterMap() 메소드 사용</b><br/>\r\n");
      out.write("\t\t\t");

				Map parameterMap = request.getParameterMap();
				String[] nameParam = (String[])parameterMap.get("name");
				if(nameParam != null)
				{
			
      out.write("\r\n");
      out.write("\t\t\t\t\tname = ");
      out.print(nameParam[0] );
      out.write("\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</p>\r\n");
      out.write("\t</body>\r\n");
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
