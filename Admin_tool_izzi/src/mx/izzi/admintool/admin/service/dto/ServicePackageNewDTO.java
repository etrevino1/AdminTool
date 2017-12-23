package mx.izzi.admintool.admin.service.dto;

public class ServicePackageNewDTO {
	private String packageName;
	private String packageNode;
	private int equipment;
	
	public ServicePackageNewDTO(String packageName, String packageNode, int equipment){
		this.packageName = packageName;
		this.packageNode = packageNode;
		this.equipment = equipment;
	}

	public String getPackageName() {
		return packageName;
	}

	public String getPackageNode() {
		return packageNode;
	}

	public int getEquipment() {
		return equipment;
	}

	@Override
	public String toString() {
		return "ServicePackageNewDTO [packageName=" + packageName + ", packageNode=" + packageNode + ", equipment="
				+ equipment + "]";
	}
	
}
