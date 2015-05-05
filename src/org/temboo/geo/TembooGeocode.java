package org.temboo.geo;

import com.temboo.Library.Google.Geocoding.GeocodeByAddress;
import com.temboo.Library.Google.Geocoding.GeocodeByAddress.GeocodeByAddressInputSet;
import com.temboo.Library.Google.Geocoding.GeocodeByAddress.GeocodeByAddressResultSet;
import com.temboo.core.TembooSession;

public class TembooGeocode 
{
	public static void main(String[] args)throws Exception
	{
		// Instantiate the Choreo, using a previously instantiated TembooSession object, eg:
		TembooSession session = new TembooSession("narayana1208", "myFirstApp", "2fd978fdb07b4f3c92dd73d098a995ff");

		GeocodeByAddress geocodeByAddressChoreo = new GeocodeByAddress(session);

		// Get an InputSet object for the choreo
		GeocodeByAddressInputSet geocodeByAddressInputs = geocodeByAddressChoreo.newInputSet();

		// Set inputs
		geocodeByAddressInputs.set_Address("doopanhalli,indiranagar,banglore");

		// Execute Choreo
		GeocodeByAddressResultSet geocodeByAddressResults = geocodeByAddressChoreo.execute(geocodeByAddressInputs);
		System.out.println("latitude adress "+geocodeByAddressResults.get_Latitude());
		System.out.println("latitude adress "+geocodeByAddressResults.get_Longitude());
	}

}
