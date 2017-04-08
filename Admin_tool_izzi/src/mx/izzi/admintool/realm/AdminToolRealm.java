package mx.izzi.admintool.realm;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.realm.GenericPrincipal;
import org.apache.catalina.realm.RealmBase;
import org.apache.log4j.Logger;

public class AdminToolRealm extends RealmBase {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Override
	protected String getName() {
		return this.getClass().getSimpleName();
	}

	@Override
	protected String getPassword(final String username) {
		return "test1234";
	}

	@Override
	protected Principal getPrincipal(final String username) {
		log.debug("User: " + username);
		final List<String> roles = new ArrayList<String>();
		roles.add("tomcat");
		log.debug(new GenericPrincipal(username, "test123", roles));
		return new GenericPrincipal(username, "test123", roles);
	}

	
}
