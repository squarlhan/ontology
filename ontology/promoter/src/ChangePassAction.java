//import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class ChangePassAction extends ActionSupport{
	private static final String CHANGE = "change";
	private String password;
	private String repassword;
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	public String getRepassword() {
		return repassword;
	}
	public String change(){
		return CHANGE;
	}
	public String execute() throws Exception {
		/*ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("password", getPassword());

		if (getRepassword().equals("password")) {

			ctx.put("tip", "ÇëÌîÐ´ÐÂµÄÃÜÂë");
			return SUCCESS;
		}

		else {
			ctx.put("tip", "µÇÂ¼Ê§°Ü");
			return ERROR;
		}*/
		return SUCCESS;
	}

}
