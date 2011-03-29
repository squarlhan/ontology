import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginRegistAction extends ActionSupport {
	private static final String REGIST = "regist";
	private static final String FORGET = "forget";
	private static final String CHANGE = "change";
	private String username;
	private String password;
	private String tip;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String regist() throws Exception {
		return REGIST;
	}

	public String forgetPassword() throws Exception {
		return FORGET;
	}
	/*public String changepass() throws Exception{
		return CHANGE;
	}*/

	public String execute() throws Exception {
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("username", getUsername());
		ctx.put("tip", "服务器提示：您已经成功登录");
		return SUCCESS;

	}
}