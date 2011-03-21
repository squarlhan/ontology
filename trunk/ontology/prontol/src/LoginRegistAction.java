
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
	//���崦��ע���regist����
	public String regist() throws Exception
	{
		//ActionContext.getContext().getSession().put("username", getUsername());
		//setTip("��ϲ����"+getUsername()+",���Ѿ�ע��ɹ���");
		return REGIST;
	}
	//�������÷���reset
	public String reset() throws Exception
	{
		return INPUT;
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