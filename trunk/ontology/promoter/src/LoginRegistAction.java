
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginRegistAction extends ActionSupport 
{
	private static final String REGIST="regist";
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
	
	public String regist() throws Exception
	{
		return REGIST;
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
		
			ctx.put("tip","��������ʾ�����Ѿ��ɹ���¼");
			return SUCCESS;
		}
		
		else
		{
			ctx.put("tip", "��¼ʧ��");
			return ERROR;
		}
	}
}