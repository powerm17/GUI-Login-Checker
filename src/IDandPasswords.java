import java.util.HashMap;
public class IDandPasswords {

	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords(){
		
		// Logins the system will recognize
		logininfo.put("Hello","World");
		logininfo.put("UserName","PASSWORD");
		logininfo.put("Login","Check123");
	}
	
	public HashMap<String, String> getLoginInfo(){
		return logininfo;
	}
}