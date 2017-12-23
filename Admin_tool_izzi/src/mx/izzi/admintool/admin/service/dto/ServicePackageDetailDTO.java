package mx.izzi.admintool.admin.service.dto;

import java.io.Serializable;

public class ServicePackageDetailDTO implements Serializable {
	private String packageName;
	private String packageNode;
	private String packageDetail;
	private Boolean required;
	
	public ServicePackageDetailDTO(String packageName, String packageNode, String packageDetail, Boolean required){
		this.packageName = packageName;
		this.packageNode = packageNode;
		this.packageDetail = packageDetail;
		this.required = required;
	}
	
	public ServicePackageDetailDTO(String packageName, String packageNode, String packageDetail, int required){
		this.packageName = packageName;
		this.packageNode = packageNode;
		this.packageDetail = packageDetail;
		this.required = required==0?false:true;
	}
	
	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public String getPackageNode() {
		return packageNode;
	}

	public void setPackageNode(String packageNode) {
		this.packageNode = packageNode;
	}

	public String getPackageDetail() {
		return packageDetail;
	}

	public void setPackageDetail(String packageDetail) {
		this.packageDetail = packageDetail;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	@Override
	public String toString() {
		return "ServicePackageDetailDTO [packageName=" + packageName + ", packageNode=" + packageNode
				+ ", packageDetail=" + packageDetail + ", required=" + required + "]";
	}
}
