package jsonParsers;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactCardJSONParser {
	public static void main(String[] args) throws JSONException {
		// Source: https://spring.io/understanding/JSON

		String ccJSONString = "{\"contactCard\":{\"firstName\": \"John\", \"lastName\": \"Smith\", \"birthday\": \"1975-01-31\", \"spouse\": {\"firstName\": \"Mary\", \"lastName\": \"Smith\" }, \"addresses\": [ { \"description\": \"home\", \"street\": \"123 Peachtree Ln\", \"city\": \"Atlanta\", \"state\": \"GA\", \"postalCode\": 30305 }, { \"description\": \"work\", \"street\": \"456 Peachtree St\", \"city\": \"Atlanta\", \"state\": \"GA\", \"postalCode\": 30305 } ], \"phoneNumbers\": [ { \"description\": \"home\", \"number\": \"404-555-1234\" },  { \"description\": \"mobile\", \"number\": \"678-555-1234\" } ] } }";

		System.out.println("contactCard JSON String: "+ccJSONString);

		JSONObject ccjObj = new JSONObject(ccJSONString);
		System.out.println("Original ContactCard JSON Object: "+ccjObj.getJSONObject("contactCard"));

		
		System.out.println("firstName String: "+ccjObj.getJSONObject("contactCard").getString("firstName"));
		System.out.println("lastName String: "+ccjObj.getJSONObject("contactCard").getString("lastName"));
		System.out.println("birthday String: "+ccjObj.getJSONObject("contactCard").getString("birthday"));
		
		System.out.println("spouse JSON object : "+ccjObj.getJSONObject("contactCard").getJSONObject("spouse"));
		System.out.println("spouse firstName String: "+ccjObj.getJSONObject("contactCard").getJSONObject("spouse").getString("firstName"));
		System.out.println("spouse lastName String: "+ccjObj.getJSONObject("contactCard").getJSONObject("spouse").getString("lastName"));
		

		JSONArray phoneNumbersJSONArray = (JSONArray) ccjObj.getJSONObject("contactCard").getJSONArray("phoneNumbers");

		for (Object ja: phoneNumbersJSONArray){
			System.out.println(ja);
		}

		System.out.println("home phoneNumber String: "+ ccjObj.getJSONObject("contactCard").getJSONArray("phoneNumbers").getJSONObject(0).getString("number"));
		System.out.println("mobile phoneNumber String: "+ ccjObj.getJSONObject("contactCard").getJSONArray("phoneNumbers").getJSONObject(1).getString("number"));
			


		JSONArray addressesJSONArray = (JSONArray) ccjObj.getJSONObject("contactCard").getJSONArray("addresses");

		for (Object ja: addressesJSONArray){
			System.out.println(ja);
		}

		System.out.println("home street String: "+ ccjObj.getJSONObject("contactCard").getJSONArray("addresses").getJSONObject(0).getString("street"));
		System.out.println("work street String: "+ ccjObj.getJSONObject("contactCard").getJSONArray("addresses").getJSONObject(1).getString("street"));

		System.out.println("home city String: "+ ccjObj.getJSONObject("contactCard").getJSONArray("addresses").getJSONObject(0).getString("city"));
		System.out.println("work city String: "+ ccjObj.getJSONObject("contactCard").getJSONArray("addresses").getJSONObject(1).getString("city"));

	}

}

