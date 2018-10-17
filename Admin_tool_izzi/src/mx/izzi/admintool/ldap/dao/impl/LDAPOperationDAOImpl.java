package mx.izzi.admintool.ldap.dao.impl;

import java.util.List;

import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;

import mx.izzi.admintool.ldap.dao.LDAPOperationDAO;

public class LDAPOperationDAOImpl implements LDAPOperationDAO {
	private LdapTemplate ldapTemplate;

	public List<?> getDevice(){
		return ldapTemplate.search("", "(objectclass=person)", new AttributesMapper(){
			public Object mapFromAttributes(Attributes attrs) throws NamingException{
				return attrs.get("cn").get();
			}
		});
	}
	
	
	
	public void setLdapTemplate(LdapTemplate ldapTemplate) {
		this.ldapTemplate = ldapTemplate;
	}
	
}
