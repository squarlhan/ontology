
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class AdminLoginAction extends ActionSupport 
{
	private static final String FORGET = "forget";
	private String username;
	private String password;
	private String tip;
	
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
	public String getTip()
	{
		return tip;
	}
	public void setTip(String tip)
	{
		this.tip = tip;
	}
	
	public String forgetPassword() throws Exception
	{
		return FORGET;
	}
	
	//定义处理用户请求的execute方法
	public String execute() throws Exception
	{
		ActionContext ctx=ActionContext.getContext();
		ctx.getSession().put("username", getUsername());
		
		if(getUsername().equals("ykwolf")&& getPassword().equals("1988825"))
		{
		
			ctx.put("tip","尊敬的管理员,您已经成功登录管理员搜索界面");
			return SUCCESS;
		}
		
		else
		{
			ctx.put("tip", "登录失败");
			return ERROR;
		}
	}
}