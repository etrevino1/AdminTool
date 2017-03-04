package mx.izzi.admintool.business;

import tv.mirada.www.iris.core.types.CustomerPremisesEquipment;

public interface IRDBusiness {
	public void activateCPE(CustomerPremisesEquipment equipo, String node);
}
