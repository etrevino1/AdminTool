package mx.izzi.admintool.util;

public class DetermineNode {
	private static final String IZZI_MEX = "http://172.20.183.55:8888";
	private static final String IZZI_MTY = "http://172.18.1.234:8888";
	
	private static final String SUBSCRIBER = "/managetv/prov/subscribers/";
	private static final String SERVICE = "/managetv/prov/services/";
	private static final String DEVICE = "/managetv/prov/devices/";
	private static final String IRD = "/managetv/prov/ird/";
	private static final String PPV = "/managetv/ppv/subscriberppv/";
	private static final String IPPV = "/managetv/ppv/payperview/";
	
	
	public static String getService(String node, String service) throws Exception{
		
		String address = "";
		
		if(node.equals("mex")){
			address += IZZI_MEX;
		}else if(node.equals("mty")){
			address += IZZI_MTY;
		}else{
			throw new Exception("Invalid node: " + node);
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
		case "ppv":
			address += PPV;
			break;
		case "ippv":
			address += IPPV;
			break;
			default:
				throw new Exception("Invalid service: " + service);
		}
		
		
		return address;
	}
	
	
}
