/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.90
 * Generated at: 2018-12-25 10:08:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jdbc.userDao;
import car.book;

public final class book_005fbata_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/menu_search.jsp", Long.valueOf(1545726529071L));
    _jspx_dependants.put("/head.jsp", Long.valueOf(1545732324836L));
    _jspx_dependants.put("/foot.jsp", Long.valueOf(1545726528978L));
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>图书详情</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/main.css\" type=\"text/css\" />\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/autoplay.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write(".s_main{\r\n");
      out.write("\twidth:400px;\r\n");
      out.write("\theight:400px;\r\n");
      out.write("\tborder:solid red;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tmargin:50px auto;\r\n");
      out.write("\tpadding:50px;\r\n");
      out.write("\tborder:10px double rgb(200,155,145);\r\n");
      out.write("\tborder-radius:35px;\r\n");
      out.write("\tbox-shadow:-5px 5px 5px 3px rgb(200,155,145);\r\n");
      out.write("}\r\n");
      out.write(".s_main span{\r\n");
      out.write("\tdisplay:block;\r\n");
      out.write("\tposition:relative;\r\n");
      out.write("\tmargin-top:10px ;\r\n");
      out.write("\tmargin-left:60px;\r\n");
      out.write("}\r\n");
      out.write(".s_number{\r\n");
      out.write("width:25px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- 1.网上书城顶部 start -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");

    	String username = (String)session.getAttribute("user");
    
      out.write("\r\n");
      out.write("    \r\n");
      out.write("<div id=\"divhead\">\r\n");
      out.write("\t<table cellspacing=\"0\" class=\"headtable\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>\r\n");
      out.write("\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/logo.png\" width=\"200\" height=\"60\" border=\"0\" /> \r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t<td style=\"text-align:right\">\r\n");
      out.write("\t\t\t\t<img src=\"images/cart.gif\" width=\"26\" height=\"23\" style=\"margin-bottom:-4px\" />&nbsp;<a href=\"#\">购物车</a> \r\n");
      out.write("\t\t\t\t| <a href=\"#\">帮助中心</a> \r\n");
      out.write("\t\t\t\t");
if(username == null){
					
      out.write("\r\n");
      out.write("\t\t\t\t| <a href=\"login.jsp\">登陆</a>\r\n");
      out.write("\t\t\t\t");
 }else{
				
      out.write("\r\n");
      out.write("\t\t\t\t\t<a href = \"#\">您已登录：");
      out.print(username );
      out.write("</a>\r\n");
      out.write("\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t| <a href=\"register.jsp\">新用户注册</a>\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t</td>\t\t\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t<!-- 网上书城顶部  end -->\r\n");
      out.write("\r\n");
      out.write("\t<!--2. 网上书城菜单列表  start -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<div id=\"divmenu\">\r\n");
      out.write("\t\t<a href=\"book_wx.jsp\">文学</a> \r\n");
      out.write("\t\t<a href=\"#\">生活</a> \r\n");
      out.write("\t\t<a href=\"#\">计算机</a> \r\n");
      out.write("\t\t<a href=\"#\">外语</a> \r\n");
      out.write("\t\t<a href=\"#\">经管</a>\r\n");
      out.write("\t\t<a href=\"#\">励志</a> \r\n");
      out.write("\t\t<a href=\"#\">社科</a> \r\n");
      out.write("\t\t<a href=\"#\">学术</a> \r\n");
      out.write("\t\t<a href=\"#\">少儿</a>\r\n");
      out.write("\t\t<a href=\"#\">艺术</a> \r\n");
      out.write("\t\t<a href=\"#\">原版</a> \r\n");
      out.write("\t\t<a href=\"#\">科技</a> \r\n");
      out.write("\t\t<a href=\"#\">考试</a> \r\n");
      out.write("\t\t<a href=\"#\">生活百科</a> \r\n");
      out.write("\t\t<a href=\"#\" style=\"color:#FFFF00\">全部商品目录</a>\t\t\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"divsearch\">\r\n");
      out.write("<form action=\"#\" id=\"searchform\">\r\n");
      out.write("\t<table width=\"100%\" border=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"text-align:right; padding-right:220px\">\r\n");
      out.write("\t\t\t\tSearch \r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"textfield\" class=\"inputtable\" id=\"textfield\" value=\"请输入书名\"\r\n");
      out.write("\t\t\t\tonmouseover=\"this.focus();\"\r\n");
      out.write("\t\t\t\tonclick=\"my_click(this, 'textfield');\"\r\n");
      out.write("\t\t\t\tonBlur=\"my_blur(this, 'textfield');\"/> \r\n");
      out.write("\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/serchbutton.gif\" border=\"0\" style=\"margin-bottom:-4px\" onclick=\"search()\"/> \r\n");
      out.write("\t\t\t\t</a>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("\t<!-- 网上书城菜单列表  end -->\r\n");
      out.write("\r\n");

	String book_id = request.getParameter("book_id");	//获得所选书籍ID
	userDao dao = new userDao();
	book new_book = dao.get_Book(book_id);	//从数据库获取所选书籍信息
	//临时存到session;
	
	session.setAttribute(book_id, new_book);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class = \"s_main\">\r\n");
      out.write("<span><img src = \"");
      out.print(new_book.getBook_img_path() );
      out.write("\" alt = \"封面\" width = \"200px\" height = \"200px\"/></br>\r\n");
      out.write("<span>书名:");
      out.print(new_book.getBook_name() );
      out.write("</span>\r\n");
      out.write("<span>作者:");
      out.print(new_book.getBook_writer() );
      out.write("</span>\r\n");
      out.write("<span>单价:");
      out.print(new_book.getBook_price() );
      out.write("</span>\r\n");
      out.write("<span>库存:");
      out.print(new_book.getBook_kucun() );
      out.write("</span>\r\n");
      out.write("<form action = \"Addcar\">\r\n");
      out.write("\t<span>购买数量:<input type = \"text\" name = \"number\" value = \"1\" class = \"s_number\" /></span>\r\n");
      out.write("\t<input type = \"hidden\" name = \"book_id\" value = \"");
      out.print(book_id );
      out.write("\"/>\r\n");
      out.write("\t<span><input type = \"submit\" value = \"添加购物车\"/></span>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\t<!--5. 网上书城底部 start -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<div id=\"divfoot\">\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" >\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td rowspan=\"2\" style=\"width:10%\">\r\n");
      out.write("\t\t\t\t\t<img src=\"images/logo.png\" width=\"195\" height=\"50\"\r\n");
      out.write("\t\t\t\t\tstyle=\"margin-left:175px\" />\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td style=\"padding-top:5px; padding-left:50px\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">\r\n");
      out.write("\t\t\t\t\t\t<font color=\"#747556\"><b>CONTACT US</b></font> \r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td style=\"padding-left:50px\">\r\n");
      out.write("\t\t\t\t\t<font color=\"#CCCCCC\">\r\n");
      out.write("\t\t\t\t\t\t<b>COPYRIGHT 2015 &copy; BookStore All Rights RESERVED.</b> \r\n");
      out.write("\t\t\t\t\t</font>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>");
      out.write("\r\n");
      out.write("\t<!-- 网上书城底部  end -->\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
