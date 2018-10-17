package mx.izzi.admintool.admin.service.dto;

import java.io.Serializable;

public class ServicePackageDTO implements Serializable {
	static final long serialVersionUID = 1L;
	
	private Integer package_id;
	private String package_name;
	private String mirada_node;
	private Boolean equipment_needed;
	
	public ServicePackageDTO(Integer package_id, String package_name, String mirada_node, Boolean equipment_needed){
		this.package_id = package_id;
		this.package_name = package_name;
		this.mirada_node = mirada_node;
		this.equipment_needed = equipment_needed;
	}

	public Integer getPackage_id() {
		return package_id;
	}

	public String getPackage_name() {
		return package_name;
	}

	public String getMirada_node() {
		return mirada_node;
	}

	public Boolean getEquipment_needed() {
		return equipment_needed;
	}

	@Override
	public String toString() {
		return "{" + package_id + ", " + package_name + ", " + mirada_node + ", " + equipment_needed + "}";
	}
}
