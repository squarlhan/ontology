import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FindPassAction extends ActionSupport {
	private String username;
	private String surname;
	private String tip;
	private String question;
	private String answer;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getSurname() {
		return surname;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getTip() {
		return tip;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getQuestion() {
		return question;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getAnswer() {
		return answer;
	}

	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("username", getUsername());

		if (getUsername().equals("ykwolf@163.com")
				&& getSurname().equals("ykwolf")) {

			ctx.put("tip", "ÇëÌîÐ´ÐÂµÄÃÜÂë");
			return SUCCESS;
		}

		else {
			ctx.put("tip", "µÇÂ¼Ê§°Ü");
			return ERROR;
		}
	}


}
