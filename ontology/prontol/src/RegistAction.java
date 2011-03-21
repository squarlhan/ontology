import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;

public class RegistAction extends ActionSupport
{
	private String username;
	private String surname;
	private String password;
	private String repassword;
	private String tip;
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getSurname() {
		return surname;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
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
	public void setTip(String tip) {
		this.tip = tip;
	}
	public String getTip() {
		return tip;
	}
	public String execute() throws Exception
	{
		ActionContext ctx=ActionContext.getContext();
		ctx.getSession().put("username", getUsername());
		ctx.put("tip","服务器提示：恭喜您已经成功注册，自动登录登录");
		return SUCCESS;
	}
	
	

}
