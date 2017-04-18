package mx.izzi.admintool.business;

import mx.izzi.admintool.dto.IzziTvClientDTO;
import mx.izzi.admintool.exception.CPEException;
import tv.mirada.www.iris.core.types.Subscriber;

public interface MixedBusiness {
	public IzziTvClientDTO getClient(String account, String node, String user);
	public IzziTvClientDTO getClient(Long irisId, String node, String user);
	public void activateAccount(String subscriber, String node, String user);
	public void deactivateAccount(String subscriber, String node, String user);
	public Subscriber findCPESubscriber(String hardwareId, String node, String user) throws CPEException;
}
