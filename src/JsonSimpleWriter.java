	import java.io.FileWriter;
	import java.io.IOException;

	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;

	public class JsonSimpleWriter {

		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
			JSONObject obj = new JSONObject();
			
			obj.put("name", "Pankaj Kumar");
			obj.put("age", new Integer(32));

			JSONArray cities = new JSONArray();
			cities.add("New York");
			cities.add("Bangalore");
			cities.add("San Francisco");

			obj.put("cities", cities);

			try {

				FileWriter file = new FileWriter("data.json");
				file.write(obj.toJSONString());
				file.flush();
				file.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

			System.out.print(obj.toJSONString());

		}
	
}
