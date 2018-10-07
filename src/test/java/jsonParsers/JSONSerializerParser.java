package jsonParsers;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class JSONSerializerParser {
	public static final void main(String[] args) throws Exception {
		// Source: https://spring.io/understanding/JSON


			String jsonStr1 = "{\"jsonString1\":{ \"name\": \"John\", \"age\": 35, \"member\": true}}";

			System.out.println("jsonStr1: "+jsonStr1);

			JSONObject jsonObject1 = (JSONObject)JSONSerializer.toJSON(jsonStr1);

			JSONObject queryObj1 = jsonObject1.getJSONObject("jsonString1");
			System.out.println("Original JSON Object String: "+queryObj1);

			System.out.println("name String: "  + jsonObject1.getJSONObject("jsonString1").getString("name"));
			System.out.println("age int: "  + jsonObject1.getJSONObject("jsonString1").getInt("age"));
			System.out.println("member boolean: "  + jsonObject1.getJSONObject("jsonString1").getBoolean("member"));

			String jsonStr2 = "{\"jsonString2\":{\"indexes\": [5, 10, 15], \"names\": [\"John\", \"Elizabeth\", \"Mary\"]}}";

			System.out.println("jsonStr2: "+jsonStr2);

			JSONObject jsonObject2 = (JSONObject)JSONSerializer.toJSON(jsonStr2);

		
			JSONArray indexesJSONArray = jsonObject2.getJSONObject("jsonString2").getJSONArray("indexes");
			System.out.println("indexes JSONArray : "  + indexesJSONArray);

			for (Object ja: indexesJSONArray){
				System.out.println(ja);
			}

			JSONArray namesJSONArray = jsonObject2.getJSONObject("jsonString2").getJSONArray("names");
			System.out.println("names JSONArray : "  + namesJSONArray);

			for (Object ja: namesJSONArray){
				System.out.println(ja);
			}
	

	}
}