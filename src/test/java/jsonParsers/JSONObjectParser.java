package jsonParsers;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONObjectParser {
	public static void main(String[] args) throws JSONException {
		// Source: https://spring.io/understanding/JSON

		String jsonStr1 = "{\"jsonString1\":{ \"name\": \"John\", \"age\": 35, \"member\": true}}";
		System.out.println("jsonStr1: "+jsonStr1);

		JSONObject jObj1 = new JSONObject(jsonStr1);
		JSONObject dataResult1 = jObj1.getJSONObject("jsonString1");
		System.out.println("Original JSON String1: "+dataResult1);


		String jString2 = "{\"jsonString2\":{\"indexes\": [5, 10, 15, 20], \"names\": [\"John\", \"Elizabeth\", \"Mary\"]}}";
		System.out.println("jString2: "+jString2);


			JSONObject jObj = new JSONObject(jString2);
			JSONObject dataResult2 = jObj.getJSONObject("jsonString2");
			System.out.println("Original JSON String: "+dataResult2);

			JSONArray indexesJSONArray =  dataResult2.getJSONArray("indexes");

			System.out.println("indexesJSONArray length = " + dataResult2.getJSONArray("indexes").length());

			for (Object ja: indexesJSONArray){
				System.out.println(ja);
			}
			
			JSONArray namesJSONArray = (JSONArray) dataResult2.getJSONArray("names");

			System.out.println("namesJSONArray length = " + dataResult2.getJSONArray("names").length());

			for (Object ja: namesJSONArray){
				System.out.println(ja);
			}
						
		}
		
}

