package mypackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mypackage.business.Survey;
import mypackage.business.User;
import mypackage.dto.SurveyDTO;

import java.io.IOException;

/**
 * Servlet implementation class SurveyServlet
 */
@WebServlet("/SurveyServlet")
public class SurveyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SurveyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/index.html";
		String action = request.getParameter("action");
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String dateOfBirth = request.getParameter("dateOfBirth");
		String hearFrom = request.getParameter("hearFrom");
		boolean likeReceiveAnnoucement = Boolean.parseBoolean(request.getParameter("likeReceiveAnnoucement"));
		boolean sendAnnouncement = Boolean.parseBoolean(request.getParameter("sendAnnouncement"));
		String contactMethod = request.getParameter("contactMethod");
		if(action == null) {
			action = "join";
		}
		if(action.equals("add")) {
			url = "/thanks.jsp";
			SurveyDTO dto = new SurveyDTO();
			dto.setEmail(email);
			dto.setFirstName(firstName);
			dto.setLastName(lastName);
			dto.setDateOfBirth(dateOfBirth);
			dto.setHearFrom(hearFrom);
			dto.setLikeReceiveAnnoucement(likeReceiveAnnoucement);
			dto.setSendAnnouncement(sendAnnouncement);
			dto.setContactMethod(contactMethod);
			User user = new User(email, firstName, lastName, dateOfBirth);
			Survey survey = new Survey(user, dto.getHearFrom(), dto.getLikeReceiveAnnoucement(), dto.getSendAnnouncement(), dto.getContactMethod());
			request.setAttribute("survey", survey);
		}
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

}
