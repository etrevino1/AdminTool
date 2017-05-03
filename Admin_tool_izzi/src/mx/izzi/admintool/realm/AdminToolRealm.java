package mx.izzi.admintool.realm;

import java.security.Principal;

import org.apache.catalina.realm.RealmBase;
import org.apache.log4j.Logger;

public class AdminToolRealm extends RealmBase {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	protected String getName() {
		log.debug("getName");
		return this.getClass().getSimpleName();
	}

	@Override
	protected String getPassword(String username) {
		log.debug("getPassword");
		return "test1234";
	}

	@Override
	protected Principal getPrincipal(String username) {
		log.debug("User: " + username);
		return new CustomPrincipal(username); 
	}

	class CustomPrincipal implements Principal { 
	       private final String name;
	       public CustomPrincipal(String name) { 
	            this.name = name; 
	       }
	  
	       public String getName() { 
	          return name; 
	       }
	  
	       public String toString() { 
	          return getName(); 
	       } 
	   } 
}
