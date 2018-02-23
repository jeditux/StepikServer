import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Anatoly Gostev on 17.02.2018.
 */
public class Frontend extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> parameterMap = request.getParameterMap();
        String[] values = parameterMap.get("key");
        String result = (values != null && values.length > 0) ? values[0] : "";
        response.getWriter().print(result);
    }
}
