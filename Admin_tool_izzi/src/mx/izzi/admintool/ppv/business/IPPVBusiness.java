package mx.izzi.admintool.ppv.business;

public interface IPPVBusiness {
	public void createIPPVProduct(
			String ppvId, String eventExternalRef, int price, 
			String freeviewStartTime, String freeviewEndTime,
			String PurchaseStartTime, String PurchaseEndTime,
			String CancelStartTime, String cancelEndTime,
			String name, String description, String node);
	public void deleteIPPVProduct(String ppvId, String node);
	public void updateIPPVProduct();
	
	public void findIPPVProduct(String ppvId, String node);
	
}
