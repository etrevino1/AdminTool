package mx.izzi.admintool.util;

import mx.izzi.admintool.exception.NDSTransformationTVIException;

public class NDSTransformationTVI {
	public static String createNDSChipID(final String sdpHardwareId) throws NDSTransformationTVIException{
	    /*
	    Example:
	    Suppose the Chip ID in a given STB is 0x464F54 = 4607828 (decimal).
	    Then the CA STB ID for this box is 4607828 + 2^31 = 2152091476.
	    The value shown on the CA STB Label for the box is <prefix><CA STB ID><Checkdigit>:
	    xxxxx2152091476z
	    where z is the Luhn checkdigit computed on the previous 15 digits
	     al prefijo de 5 caracteres, es fijo y tiene un valor de 52753.
	    */

	    if (sdpHardwareId == null) {
	        throw new NDSTransformationTVIException("Invalid HW-ID - labelled ID expected as 16 characters");
	    }
	    if (sdpHardwareId.length() != 16) {
	        throw new NDSTransformationTVIException("Invalid HW-ID - labelled ID expected as 16 characters");
	    }
	    if (!isValidNumberByLUHN(sdpHardwareId)) {
	        throw new NDSTransformationTVIException("Invalid HW-ID - check digit failure");
	    }

		System.out.println("createNDSChipID: " + sdpHardwareId);
	    String caStbId = sdpHardwareId.substring(5, 15);
	    Long caStbIdNum = Long.parseLong(caStbId) - (1L << 31);
	    // Should this ID be handled as a HEX string, as above, or as a decimal?
	    // Assume a decimal for the time being
	    return caStbIdNum.toString();
	    //return Long.toHexString(caStbIdNum).toUpperCase();
	}
	
	public static boolean isValidNumberByLUHN(final String number) {
	    int sum = 0;
	    boolean alternate = false;
	    for (int i = number.length() - 1; i >= 0; i--) {
	        int n = Integer.parseInt(number.substring(i, i + 1));
	        if (alternate) {
	            n *= 2;
	            if (n > 9) {
	                n = (n % 10) + 1;
	            }
	        }
	        sum += n;
	        alternate = !alternate;
	    }

	    return (sum % 10 == 0);
	}
}
