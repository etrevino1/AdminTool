package mx.izzi.admintool.util;

public class DetermineNode {
	private static final String IZZI_MEX = "http://172.20.183.55:8888";
	private static final String IZZI_MTY = "http://172.18.1.234:8888";
	
	private static final String SUBSCRIBER = "/managetv/prov/subscribers/";
	private static final String SERVICE = "/managetv/prov/services/";
	private static final String DEVICE = "/managetv/prov/devices/";
	private static final String IRD = "/managetv/prov/ird/";
	
	
	public static String getService(String node, String service){
		
		String address = "";
		
		if(node.equals("mex")){
			address += IZZI_MEX;
		}else if(node.equals("mty")){
			address += IZZI_MTY;
		}
		
		switch(service){
		case "subscriber":
			address += SUBSCRIBER;
			break;
		case "service":
			address += SERVICE;
			break;
		case "device":
			address += DEVICE;
			break;
		case "ird":
			address += IRD;
			break;
		}
		
		
		return address;
	}
	
	
}
