package org.apache.jsp._0905;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _07sum_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("\t<head><title>for 구문 사용 예</title></head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t");

		int sum = 0;
		for(int i = 1; i<=100; i++)
		{
			sum += i;
			//out.println("1부터 100까지의 합" + sum);
		}
	
      out.write("\r\n");
      out.write("\t1부터 100까지의 합 = ");
      out.print(sum );
      out.write("<br/>\r\n");
      out.write("\t");

		sum = 0;
		for(int i = 1; i<=100; i += 2)
		{
			sum += i;
			//out.println("1부터 100까지의 합" + sum);
		}
	
      out.write("\r\n");
      out.write("\t1부터 100까지 홀수의 합 = ");
      out.print(sum );
      out.write("<br/>\r\n");
      out.write("\t");

		sum = 0;	
		for(int i = 2; i<=100; i += 2)
		{
			sum += i;
			//out.println("1부터 100까지의 합" + sum);
		}
	
      out.write("\r\n");
      out.write("\t1부터 100까지 짝수의 합 = ");
      out.print(sum );
      out.write("<br/>\r\n");
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
