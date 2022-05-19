package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Login</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            * {\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                background: #9999ff;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("               \n");
      out.write("                height: 100vh;\n");
      out.write("                margin: -20px 0 50px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1 {\n");
      out.write("                font-weight: bold;\n");
      out.write("                margin: 1rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p {\n");
      out.write("                font-size: 14px;\n");
      out.write("                font-weight: 100;\n");
      out.write("                line-height: 20px;\n");
      out.write("                letter-spacing: 0.5px;\n");
      out.write("                margin: 20px 0 30px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button {\n");
      out.write("                border-radius: 20px;\n");
      out.write("                border: 1px solid #FF4B2B;\n");
      out.write("                background-color: #0033ff;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("                font-size: 12px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                padding: 12px 45px;\n");
      out.write("                letter-spacing: 1px;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                transition: transform 80ms ease-in;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:active {\n");
      out.write("                transform: scale(0.95);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button:focus {\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            button.ghost {\n");
      out.write("                background-color: transparent;\n");
      out.write("                border-color: #FFFFFF;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            form {\n");
      out.write("                background-color: #FFFFFF;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                padding: 0 50px;\n");
      out.write("                height: 100%;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input {\n");
      out.write("                background-color: #eee;\n");
      out.write("                border: none;\n");
      out.write("                padding: 12px 15px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container {\n");
      out.write("                background-color: #fff;\n");
      out.write("                border-radius: 10px;\n");
      out.write("/*                box-shadow: 0 14px 28px rgba(0,0,0,0.25), \n");
      out.write("                    0 10px 10px rgba(0,0,0,0.22);*/\n");
      out.write("                position: relative;\n");
      out.write("                overflow: hidden;\n");
      out.write("                width: 768px;\n");
      out.write("                max-width: 100%;\n");
      out.write("                min-height: 480px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-container {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                height: 100%;\n");
      out.write("                transition: all 0.6s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sign-in-container {\n");
      out.write("                left: 0;\n");
      out.write("                width: 50%;\n");
      out.write("                z-index: 2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .sign-in-container {\n");
      out.write("                transform: translateX(100%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .sign-up-container {\n");
      out.write("                left: 0;\n");
      out.write("                width: 50%;\n");
      out.write("                opacity: 0;\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .sign-up-container {\n");
      out.write("                transform: translateX(100%);\n");
      out.write("                opacity: 1;\n");
      out.write("                z-index: 5;\n");
      out.write("                animation: show 0.6s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .overlay-container {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0;\n");
      out.write("                left: 50%;\n");
      out.write("                width: 50%;\n");
      out.write("                height: 100%;\n");
      out.write("                overflow: hidden;\n");
      out.write("                transition: transform 0.6s ease-in-out;\n");
      out.write("                z-index: 100;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .overlay-container{\n");
      out.write("                transform: translateX(-100%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay {\n");
      out.write("                background: #FF416C;\n");
      out.write("                background: -webkit-linear-gradient(to right, #FF4B2B, #FF416C);\n");
      out.write("                background: #6666ff;\n");
      out.write("                background-repeat:f no-repeat;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-position: 0 0;\n");
      out.write("                color: #FFFFFF;\n");
      out.write("                position: relative;\n");
      out.write("                left: -100%;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 200%;\n");
      out.write("                transform: translateX(0);\n");
      out.write("                transition: transform 0.6s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .overlay {\n");
      out.write("                transform: translateX(50%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay-panel {\n");
      out.write("                position: absolute;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                flex-direction: column;\n");
      out.write("                padding: 0 40px;\n");
      out.write("                text-align: center;\n");
      out.write("                top: 0;\n");
      out.write("                height: 100%;\n");
      out.write("                width: 50%;\n");
      out.write("                transform: translateX(0);\n");
      out.write("                transition: transform 0.6s ease-in-out;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay-left {\n");
      out.write("                transform: translateX(-20%);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .overlay-left {\n");
      out.write("                transform: translateX(0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .overlay-right {\n");
      out.write("                right: 0;\n");
      out.write("                transform: translateX(0);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container.right-panel-active .overlay-right {\n");
      out.write("                transform: translateX(20%);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" id=\"container\">\n");
      out.write("            <!-- sign in page -->\n");
      out.write("            <div class=\"form-container sign-in-container\">\n");
      out.write("                <form method=\"POST\" action=\"#\" class=\"form\" id=\"login\">\n");
      out.write("                    <h1 class=\"form__title\">Login</h1>\n");
      out.write("                   \n");
      out.write("                    <div class=\"form__input-group\">\n");
      out.write("                        <label for=\"username\">Username: </label>\n");
      out.write("                        <input type=\"text\" class=\"form__input\" name=\"username\" id=\"username\" maxlength=\"20\" required> \n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form__input-group\">\n");
      out.write("                        <label for=\"pass\">Password: </label>\n");
      out.write("                        <input type=\"password\" class=\"form__input\" name=\"pass\" id=\"pass\" maxlength=\"20\" required> \n");
      out.write("                    </div>\n");
      out.write("                    <p><input type=\"checkbox\" value=\"remember\" name=\"remember\"/> Remember Me! </p>\n");
      out.write("                    <div class=\"form__input-group\">\n");
      out.write("                        <button type=\"submit\" class=\"form__button\">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!--  create account page -->\n");
      out.write("            <div class=\"form-container sign-up-container\">\n");
      out.write("                <form method=\"post\" action=\"account/create\" class=\"form\" id=\"register\">\n");
      out.write("                    <h1 class=\"form__title\">Register</h1>\n");
      out.write("                    <div class=\"form__input-group\">\n");
      out.write("                        <label for=\"username\"> Your Name: </label>\n");
      out.write("                        <input type=\"text\" class=\"form__input\" name=\"displayname\" id=\"displayname\" maxlength=\"20\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form__input-group\">\n");
      out.write("                        <label for=\"username\"> Username: </label>\n");
      out.write("                        <input type=\"text\" class=\"form__input\" name=\"username\" id=\"username\" maxlength=\"20\" required>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form__input-group\">\n");
      out.write("                        <label for=\"pass\">Password: </label>\n");
      out.write("                        <input type=\"password\" class=\"form__input\" name=\"pass\" id=\"pass\" maxlength=\"20\" required> \n");
      out.write("                    </div>\n");
      out.write("                    <button class=\"form__button\" type=\"submit\">Submit</button>\n");
      out.write("                </form>\n");
      out.write("            </div> \n");
      out.write("\n");
      out.write("            <div class=\"overlay-container\">\n");
      out.write("                <div class=\"overlay\">\n");
      out.write("                    <div class=\"overlay-panel overlay-left\">\n");
      out.write("                        <h1>Welcome Back!</h1>\n");
      out.write("                        <p>Please login with your account </p>\n");
      out.write("                        <button class=\"ghost\" id=\"signIn\">Sign In</button>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"overlay-panel overlay-right\">\n");
      out.write("                        <h1> Wellcome FCOURSE </h1>\n");
      out.write("                        <p>EMPARK IN YOUR OWN ASPIRATIONS</p>\n");
      out.write("                        <button class=\"ghost\" id=\"signUp\">Sign Up</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script >\n");
      out.write("            const signUpButton = document.getElementById('signUp');\n");
      out.write("            const signInButton = document.getElementById('signIn');\n");
      out.write("            const container = document.getElementById('container');\n");
      out.write("\n");
      out.write("            signUpButton.addEventListener('click', () => {\n");
      out.write("                container.classList.add(\"right-panel-active\");\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            signInButton.addEventListener('click', () => {\n");
      out.write("                container.classList.remove(\"right-panel-active\");\n");
      out.write("            });</script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}