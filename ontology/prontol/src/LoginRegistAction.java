
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginRegistAction extends ActionSupport 
{
	private static final String REGIST="regist";
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
	//定义处理注册的regist方法
	public String regist() throws Exception
	{
		//ActionContext.getContext().getSession().put("username", getUsername());
		//setTip("恭喜您，"+getUsername()+",您已经注册成功！");
		return REGIST;
	}
	//定义重置方法reset
	public String reset() throws Exception
	{
		return INPUT;
	}
	//定义处理用户请求的execute方法
	public String execute() throws Exception
	{
		ActionContext ctx=ActionContext.getContext();
		ctx.getSession().put("username", getUsername());
		
		if(getUsername().equals("ykwolf")&& getPassword().equals("1988825"))
		{
		
			ctx.put("tip","服务器提示：您已经成功登录");
			return SUCCESS;
		}
		
		else
		{
			ctx.put("tip", "登录失败");
			return ERROR;
		}
	}
}