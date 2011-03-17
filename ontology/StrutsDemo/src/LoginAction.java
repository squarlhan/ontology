import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport
{
	private String username;
	private String password;
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	//定义处理用户请求的execute方法
	public String execute() throws Exception
	{
		if(getUsername().equals("ykwolf")&& getPassword().equals("1988825"))
		{
			ActionContext.getContext().getSession().put("user", getUsername());
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
	}
}
