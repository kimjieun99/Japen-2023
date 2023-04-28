/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-03-17 07:36:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/./include/footer.jsp", Long.valueOf(1678152619122L));
    _jspx_dependants.put("/./include/header.jsp", Long.valueOf(1678153610392L));
  }

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
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

String loggeduserName = (String)session.getAttribute("userName");
String loggeduserID = (String)session.getAttribute("userId");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"UTF-8\" />\r\n");
      out.write("    <title>회원가입</title>\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/reset.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/common.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/layout.css\">\r\n");
      out.write("\r\n");
      out.write("    <script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("    <script src=\"./js/jquery-3.6.3.min.js\"></script>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <header id=\"header\" class=\"header\">\r\n");
      out.write("      <h1 id=\"logo\">\r\n");
      out.write("        <a href=\"\">KIMJIEUN'S MEDIA LAB</a>\r\n");
      out.write("      </h1>\r\n");
      out.write("      <nav id=\"gnb\">\r\n");
      out.write("        <h2 class=\"blind\">global navigation</h2>\r\n");
      out.write("        ");
 if(loggeduserID==null) {
      out.write("\r\n");
      out.write("        <ul class=\"list\">\r\n");
      out.write("          <li><a href=\"join.jsp\">회원가입</a></li>\r\n");
      out.write("          <li><a href=\"login.jsp\">로그인</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("        ");
} else {
      out.write("\r\n");
      out.write("          <ul class=\"list\">\r\n");
      out.write("          <li><a href=\"info.jsp\">");
      out.print(loggeduserName );
      out.write("님</a></li>\r\n");
      out.write("          <li><a href=\"logout.jsp\">로그아웃</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("       ");
 }
      out.write("\r\n");
      out.write("      </nav>\r\n");
      out.write("    </header>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<form action=\"joinProcess.jsp\" method=\"POST\">\r\n");
      out.write("\r\n");
      out.write("	<table>\r\n");
      out.write("\r\n");
      out.write("		<colgroup>\r\n");
      out.write("\r\n");
      out.write("			<col style=\"width: 20%\" />\r\n");
      out.write("\r\n");
      out.write("			<col style=\"width: 80%\" />\r\n");
      out.write("\r\n");
      out.write("		</colgroup>\r\n");
      out.write("\r\n");
      out.write("		<tbody>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("				<th>아이디</th>\r\n");
      out.write("\r\n");
      out.write("				<td><input type=\"text\" name=\"userID\" id=\"userID\"\r\n");
      out.write("					placeholder=\"아이디를 입력하세요.\" />\r\n");
      out.write("				<button class=\"btn idCheck\">아이디 중복확인</button>\r\n");
      out.write("				</td>\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("				<th>패스워드</th>\r\n");
      out.write("\r\n");
      out.write("				<td><input type=\"password\" name=\"userPW\" id=\"userPW\"\r\n");
      out.write("					placeholder=\"패스워드를 입력하세요.\" /></td>\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("				<th>패스워드확인</th>\r\n");
      out.write("\r\n");
      out.write("				<td><input type=\"password\" name=\"userPWConfirm\"\r\n");
      out.write("					id=\"userPWConfirm\" placeholder=\"패스워드를 입력하세요.\" /></td>\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("				<th>이름</th>\r\n");
      out.write("\r\n");
      out.write("				<td><input type=\"text\" name=\"userName\" id=\"userName\"\r\n");
      out.write("					placeholder=\"이름을 입력하세요.\" /></td>\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("				<th>이메일</th>\r\n");
      out.write("\r\n");
      out.write("				<td><input type=\"text\" name=\"userEmail\" id=\"userEmail\"\r\n");
      out.write("					placeholder=\"메일을 입력하세요.\" /></td>\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("				<th>전화번호</th>\r\n");
      out.write("\r\n");
      out.write("				<td><input type=\"text\" name=\"userHp\" id=\"userHp\"\r\n");
      out.write("					placeholder=\"전화번호를 입력하세요.\" /></td>\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("			<tr>\r\n");
      out.write("\r\n");
      out.write("				<th>주소</th>\r\n");
      out.write("\r\n");
      out.write("				<td>\r\n");
      out.write("\r\n");
      out.write("					<div>\r\n");
      out.write("\r\n");
      out.write("						<input type=\"text\" name=\"userZipcode\" id=\"userZipcode\"\r\n");
      out.write("							placeholder=\"우편번호를 입력하세요.\" readonly />\r\n");
      out.write("\r\n");
      out.write("						<button class=\"btn zipCode\">우편번호</button>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div>\r\n");
      out.write("\r\n");
      out.write("						<input type=\"text\" name=\"userAddr01\" id=\"userAddr01\"\r\n");
      out.write("							placeholder=\"기본주소\" readonly /> <span>기본주소</span>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("					<div>\r\n");
      out.write("\r\n");
      out.write("						<input type=\"text\" name=\"userAddr02\" id=\"userAddr02\"\r\n");
      out.write("							placeholder=\"상세주소\" /> <input type=\"text\" name=\"userAddr03\"\r\n");
      out.write("							id=\"userAddr03\" placeholder=\"참고사항\" />\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				</td>\r\n");
      out.write("\r\n");
      out.write("			</tr>\r\n");
      out.write("\r\n");
      out.write("		</tbody>\r\n");
      out.write("\r\n");
      out.write("	</table>\r\n");
      out.write("\r\n");
      out.write("	<div>\r\n");
      out.write("\r\n");
      out.write("		<button class=\"btn confirm\">회원가입</button>\r\n");
      out.write("\r\n");
      out.write("		<button type=\"reset\">취소</button>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("	//jQuery alias $\r\n");
      out.write("	$(\".idCheck\").on(\"click\",function(){\r\n");
      out.write("		const sendUserID = $(\"#userID\").val();\r\n");
      out.write("		if(sendUserID !== \"\"){\r\n");
      out.write("		$.ajax({\r\n");
      out.write("			url:\"idCheck.jsp\",\r\n");
      out.write("			data:{userID:sendUserID},\r\n");
      out.write("			success:function(response){\r\n");
      out.write("				console.log(response);\r\n");
      out.write("				if(parseInt(response.trim())===0){\r\n");
      out.write("					alert(\"쓸 수 있는 아이디입니다.\");\r\n");
      out.write("					$(\"#userID\").attr(\"readonly\",true);\r\n");
      out.write("				} else {\r\n");
      out.write("					alert(\"쓸 수 없는 아이디입니다.\");\r\n");
      out.write("					$(\"#userID\").val(\"\");\r\n");
      out.write("					$(\"#userID\").focus();\r\n");
      out.write("				}\r\n");
      out.write("			},\r\n");
      out.write("			fail:function(error){\r\n");
      out.write("				console.log(error);\r\n");
      out.write("			}\r\n");
      out.write("		});\r\n");
      out.write("		} else {\r\n");
      out.write("			alert(\"아이디를 입력해 주세요.\");\r\n");
      out.write("			$(\"#userID\").focus();\r\n");
      out.write("		}\r\n");
      out.write("		return false;\r\n");
      out.write("	})\r\n");
      out.write("\r\n");
      out.write("	$(\".zipCode\").on(\"click\",function() {\r\n");
      out.write("\r\n");
      out.write("    new daum.Postcode({\r\n");
      out.write("            oncomplete: function(data) {\r\n");
      out.write("                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("\r\n");
      out.write("                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("                let addr = ''; // 주소 변수\r\n");
      out.write("                let extraAddr = ''; // 참고항목 변수\r\n");
      out.write("\r\n");
      out.write("                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("                    addr = data.roadAddress;\r\n");
      out.write("                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("                    addr = data.jibunAddress;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("                if(data.userSelectedType === 'R'){\r\n");
      out.write("                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("                        extraAddr += data.bname;\r\n");
      out.write("                    }\r\n");
      out.write("                    // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("                    if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("                    }\r\n");
      out.write("                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("                    if(extraAddr !== ''){\r\n");
      out.write("                        extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("                    }\r\n");
      out.write("                    // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("                   $(\"#userAddr03\").val(extraAddr);\r\n");
      out.write("                \r\n");
      out.write("                } else {\r\n");
      out.write("                  $(\"#userAddr03\").val(\"\");\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("                $(\"#userZipcode\").val(data.zonecode);\r\n");
      out.write("                $(\"#userAddr01\").val(addr);\r\n");
      out.write("                // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("                $(\"#userAddr02\").focus();\r\n");
      out.write("            }\r\n");
      out.write("        }).open();\r\n");
      out.write("        return false;\r\n");
      out.write("  })\r\n");
      out.write("\r\n");
      out.write("	$(\".confirm\").on(\"click\", function() {\r\n");
      out.write("\r\n");
      out.write("		if ($(\"#userID\").val() === \"\") {\r\n");
      out.write("\r\n");
      out.write("			alert(\"아이디를 입력해주세요.\");\r\n");
      out.write("\r\n");
      out.write("			$(\"#userID\").focus();\r\n");
      out.write("\r\n");
      out.write("			return false;\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		if ($(\"#userPW\").val() === \"\") {\r\n");
      out.write("\r\n");
      out.write("			alert(\"패스워드를 입력해주세요.\");\r\n");
      out.write("\r\n");
      out.write("			$(\"#userPW\").focus();\r\n");
      out.write("\r\n");
      out.write("			return false;\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		if ($(\"#userPWConfirm\").val() === \"\") {\r\n");
      out.write("\r\n");
      out.write("			alert(\"패스워드 확인을 해주세요.\");\r\n");
      out.write("\r\n");
      out.write("			$(\"#userPWConfirm\").focus();\r\n");
      out.write("\r\n");
      out.write("			return false;\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("		if ($(\"#userPWConfirm\").val() !== $(\"#userPW\").val()) {\r\n");
      out.write("\r\n");
      out.write("			alert(\"패스워드가 같지 않습니다.\");\r\n");
      out.write("\r\n");
      out.write("			$(\"#userPWConfirm\").focus();\r\n");
      out.write("\r\n");
      out.write("			return false;\r\n");
      out.write("\r\n");
      out.write("		}\r\n");
      out.write("\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<footer class=\"footer\">\r\n");
      out.write("    <address>\r\n");
      out.write("        <p>all copyrights reserved by KIMJIEUN99</p>\r\n");
      out.write("    </address>\r\n");
      out.write("</footer>\r\n");
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
