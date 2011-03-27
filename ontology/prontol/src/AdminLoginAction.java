
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
	
	//���崦���û������execute����
	public String execute() throws Exception
	{
		ActionContext ctx=ActionContext.getContext();
		ctx.getSession().put("username", getUsername());
		
		if(getUsername().equals("ykwolf")&& getPassword().equals("1988825"))
		{
		
			ctx.put("tip","�𾴵Ĺ���Ա,���Ѿ��ɹ���¼����Ա��������");
			return SUCCESS;
		}
		
		else
		{
			ctx.put("tip", "��¼ʧ��");
			return ERROR;
		}
	}
}