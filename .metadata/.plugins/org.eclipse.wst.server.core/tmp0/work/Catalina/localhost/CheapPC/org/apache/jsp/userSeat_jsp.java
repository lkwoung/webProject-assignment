/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-12-13 13:58:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userSeat_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <title>사용자 자리 view</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"css/userView.css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/earlyaccess/hanna.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"nav-header\">\r\n");
      out.write("    <div class=\"nav-brand\">\r\n");
      out.write("    <i class=\"fa fa-bars fa-3x\"></i>\r\n");
      out.write("    <div class=\"header-links\">\r\n");
      out.write("      <ul>\r\n");
      out.write("        <li data-menuanchor=\"thirdPage\"><a href=\"index.jsp\">LOGOUT</a></li>\r\n");
      out.write("        <li data-menuanchor=\"secondPage\"><a href=\"menu.jsp\">MENU</a></li>\r\n");
      out.write("        <li data-menuanchor=\"firstPage\"><a href=\"memberList.jsp\">USER INFO</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  </div>\r\n");
      out.write("<!-- partial:index.partial.html -->\r\n");
      out.write("<div id=\"app-cover\">\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"toggle-button-cover\">\r\n");
      out.write("      <div class=\"button-cover\">\r\n");
      out.write("        <div class=\"button r\" id=\"button-1\" >\r\n");
      out.write("          <div class=\"knobs\"></div>\r\n");
      out.write("          <div class=\"layer\">\r\n");
      out.write("         <div class=\"0\" style=\"text-align:center;padding-top:3px;\">00:00:00</div>\r\n");
      out.write("         <div id=\"0-state\" style=\"text-align:center;padding-top:3px;padding-bottom:10px;\">사용중</div>\r\n");
      out.write("         <div id=\"0-user\" style=\"padding-left:5px; font-size:20px; color:#708090; padding-bottom:20px;\"> </div>\r\n");
      out.write("         <div class=\"0buttons\" style=\"top:20%; padding-left:10px; \">         \r\n");
      out.write("         <input type=\"button\" style=\"background:#80C4DE; margin:5px;color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\"onclick=\"fncAddTime(0,3600);\" value=\"한시간추가\"/>   \r\n");
      out.write("         <input type=\"button\" style=\"background:#80C4DE; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\"onclick=\"fncAddTime(0,7200);\" value=\"두시간추가\"/>\r\n");
      out.write("         <input type=\"button\" style=\"background:#EA575B; margin-left:50px; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:10px;\"onclick=\"fucEndTimer(0);\" value=\"사용종료\"/>\r\n");
      out.write("         </div>\r\n");
      out.write("          </div>\r\n");
      out.write("             \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"toggle-button-cover\">\r\n");
      out.write("      <div class=\"button-cover\">\r\n");
      out.write("        <div class=\"button r\" id=\"button-2\">\r\n");
      out.write("          <div class=\"knobs\"></div>\r\n");
      out.write("             <div class=\"layer\">\r\n");
      out.write("                <div class=\"1\" style=\"text-align:center;padding-top:3px;\">00:00:00</div>\r\n");
      out.write("                <div id=\"1-state\" style=\"text-align:center;padding-top:3px;padding-bottom:10px;\">사용중</div>\r\n");
      out.write("                <div id=\"1-user\" style=\"padding-left:5px; font-size:20px; color:#708090; padding-bottom:20px;\"> </div>\r\n");
      out.write("                <div class=\"1buttons\" style=\"top:20%; padding-left:10px; \">      \r\n");
      out.write("            <input type=\"button\" style=\"background:#80C4DE; margin:5px;color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\"onclick=\"fncAddTime(1,3600);\" value=\"한시간추가\"/>\r\n");
      out.write("            <input type=\"button\" style=\"background:#80C4DE; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\" onclick=\"fncAddTime(1,7200);\" value=\"두시간추가\"/>\r\n");
      out.write("            <input type=\"button\" style=\"background:#EA575B; margin-left:50px; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:10px;\" onclick=\"fucEndTimer(1);\" value=\"사용종료\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"toggle-button-cover\">\r\n");
      out.write("      <div class=\"button-cover\">\r\n");
      out.write("        <div class=\"button r\" id=\"button-3\">\r\n");
      out.write("          <div class=\"knobs\"></div>\r\n");
      out.write("          <div class=\"layer\">\r\n");
      out.write("             <div class=\"2\" style=\"text-align:center;padding-top:3px;\">00:00:00</div>\r\n");
      out.write("                <div id=\"2-state\" style=\"text-align:center;padding-top:3px;padding-bottom:10px;\">사용중</div>\r\n");
      out.write("                <div id=\"2-user\" style=\"padding-left:5px; font-size:20px; color:#708090; padding-bottom:20px;\"> </div>\r\n");
      out.write("                <div class=\"2buttons\" style=\"top:20%; padding-left:10px; \">      \r\n");
      out.write("            <input type=\"button\" style=\"background:#80C4DE; margin:5px;color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\"onclick=\"fncAddTime(2,3600);\" value=\"한시간추가\"/>\r\n");
      out.write("            <input type=\"button\" style=\"background:#80C4DE; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\" onclick=\"fncAddTime(2,7200);\" value=\"두시간추가\"/>\r\n");
      out.write("            <input type=\"button\" style=\"background:#EA575B; margin-left:50px; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:10px;\" onclick=\"fucEndTimer(2);\" value=\"사용종료\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"toggle-button-cover\">\r\n");
      out.write("      <div class=\"button-cover\">\r\n");
      out.write("        <div class=\"button r\" id=\"button-4\">\r\n");
      out.write("          <div class=\"knobs\"></div>\r\n");
      out.write("          <div class=\"layer\">\r\n");
      out.write("          <div class=\"3\" style=\"text-align:center;padding-top:3px;\">00:00:00</div>\r\n");
      out.write("                <div id=\"3-state\" style=\"text-align:center;padding-top:3px;padding-bottom:10px;\">사용중</div>\r\n");
      out.write("                <div id=\"3-user\" style=\"padding-left:5px; font-size:20px; color:#708090; padding-bottom:20px;\"> </div>\r\n");
      out.write("                <div class=\"3buttons\" style=\"top:20%; padding-left:10px; \">      \r\n");
      out.write("            <input type=\"button\" style=\"background:#80C4DE; margin:5px;color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\"onclick=\"fncAddTime(3,3600);\" value=\"한시간추가\"/>\r\n");
      out.write("            <input type=\"button\" style=\"background:#80C4DE; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\" onclick=\"fncAddTime(3,7200);\" value=\"두시간추가\"/>\r\n");
      out.write("            <input type=\"button\" style=\"background:#EA575B; margin-left:50px; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:10px;\" onclick=\"fucEndTimer(3);\" value=\"사용종료\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"toggle-button-cover\">\r\n");
      out.write("      <div class=\"button-cover\">\r\n");
      out.write("        <div class=\"button r\" id=\"button-5\">\r\n");
      out.write("          <div class=\"knobs\"></div>\r\n");
      out.write("          <div class=\"layer\">\r\n");
      out.write("             <div class=\"4\" style=\"text-align:center;padding-top:3px;\">00:00:00</div>\r\n");
      out.write("                <div id=\"4-state\" style=\"text-align:center;padding-top:3px;padding-bottom:10px;\">사용중</div>\r\n");
      out.write("                <div id=\"4-user\" style=\"padding-left:5px; font-size:20px; color:#708090; padding-bottom:20px;\"> </div>\r\n");
      out.write("                <div class=\"1buttons\" style=\"top:20%; padding-left:10px; \">      \r\n");
      out.write("            <input type=\"button\" style=\"background:#80C4DE; margin:5px;color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\"onclick=\"fncAddTime(4,3600);\" value=\"한시간추가\"/>\r\n");
      out.write("            <input type=\"button\" style=\"background:#80C4DE; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:9px;\" onclick=\"fncAddTime(4,7200);\" value=\"두시간추가\"/>\r\n");
      out.write("            <input type=\"button\" style=\"background:#EA575B; margin-left:50px; color:#fff;border:none; font-family:'Hanna', sans-serif;padding:10px;\" onclick=\"fucEndTimer(4);\" value=\"사용종료\"/>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- partial -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("       var handler = new Array();\r\n");
      out.write("       var leftT = new Array();\r\n");
      out.write("       /* Timer */\r\n");
      out.write("       function countdown(className, seconds,user){\r\n");
      out.write("          var tnum = className; //타이머 번호\r\n");
      out.write("          var element,stateName,userName,endTime, hours, mins, secs, msLeft, time;\r\n");
      out.write("          \r\n");
      out.write("          stateName = className.concat(\"-state\");\r\n");
      out.write("          userName = className.concat(\"-user\");\r\n");
      out.write("         var sUser = String(user);\r\n");
      out.write("          function updateTimer(){\r\n");
      out.write("                      msLeft = endTime - (+new Date);\r\n");
      out.write("                      if ( msLeft < 0 ) { // 시간 초과시 이벤트 영역\r\n");
      out.write("                         stateName = className.concat(\"-state\");\r\n");
      out.write("                         document.getElementById(stateName).innerHTML = '빈좌석';\r\n");
      out.write("                         document.getElementById(userName).innerHTML = ' ';\r\n");
      out.write("                      }\r\n");
      out.write("                      else {\r\n");
      out.write("                         document.getElementById(stateName).innerHTML = '사용중';//빈좌석을 사용중으로 변경 후 \r\n");
      out.write("                         document.getElementById(userName).innerHTML = sUser ; //사용자 이름을 표기\r\n");
      out.write("                              time = new Date( msLeft );\r\n");
      out.write("                              leftT[tnum] = msLeft; //현재 남은 시간을 전역으로 추가\r\n");
      out.write("                              hours = ('0' + time.getUTCHours()).slice(-2);\r\n");
      out.write("                              mins  = ('0' + time.getUTCMinutes()).slice(-2);\r\n");
      out.write("                              secs  = ('0' + time.getUTCSeconds()).slice(-2);\r\n");
      out.write("                              element.innerHTML = hours + ':' + mins + ':' + secs;\r\n");
      out.write("                              handler[tnum] = setTimeout(updateTimer, time.getUTCMilliseconds());\r\n");
      out.write("                      }\r\n");
      out.write("               }\r\n");
      out.write("               element = document.getElementsByClassName(className);\r\n");
      out.write("               if(element.length!=0) {// 해당 타이머가 맞는지 확인\r\n");
      out.write("                      element = element[0];\r\n");
      out.write("                      endTime = (+new Date) + 1000 * seconds;\r\n");
      out.write("                      updateTimer(); // 타이머 실행\r\n");
      out.write("                      \r\n");
      out.write("               } else { //해당 타이머가 아니면...\r\n");
      out.write("                      //alert(\"no timer\");\r\n");
      out.write("               }\r\n");
      out.write("       }\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("       fncLoadTimer();\r\n");
      out.write("  //     countdown('0', 3600);  // seconds 로 생성\r\n");
      out.write("    //   countdown('1', 1234);  // seconds 로 생성\r\n");
      out.write("      // countdown('2', 5055);  // seconds 로 생성\r\n");
      out.write("       //countdown('3', 0);  // seconds 로 생성\r\n");
      out.write("       //countdown('4', 3);  // seconds 로 생성\r\n");
      out.write("  // countdown('5', 0);  // seconds 로 생성\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("function fncAddTime(tableNum,time) { //버튼 클릭\r\n");
      out.write("         clearTimeout(handler[tableNum]);\r\n");
      out.write("            tleft = leftT[tableNum] / 1000;\r\n");
      out.write("            timerName = String(tableNum);\r\n");
      out.write("            countdown(timerName,tleft + time,\"a\");\r\n");
      out.write("}\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("function fncLoadTimer() { //페이지 최초 실행시 db에서 불러오기\r\n");
      out.write("   for (i = 0; i < 5 ; i ++ ){ // 좌석수 만큼 반복\r\n");
      out.write("      var clssI = String(i); //i순서를 문자열(클래스명이 문자열임)로 바꾼 클레스i 변수\r\n");
      out.write("      countdown(clssI,10,\"철수\");  // seconds 로 생성\r\n");
      out.write("   }\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function fncMakeTimer(tableNum) { //사용자 새로 등록하기\r\n");
      out.write("   var user = \"갑수\"\r\n");
      out.write("   var clss = String(tableNum);\r\n");
      out.write("   countdown(clss, 3600,\"갑수\");   // seconds 로 생성\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function fucEndTimer(timernum){ //사용종료\r\n");
      out.write("   clearTimeout(handler[timernum]);\r\n");
      out.write("   timerName = String(timernum);\r\n");
      out.write("   countdown(timerName,0);\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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