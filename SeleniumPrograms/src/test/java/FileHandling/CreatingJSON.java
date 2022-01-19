package FileHandling;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class CreatingJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		JSONObject student1 = new JSONObject();
		student1.put("name", "Student A");
		student1.put("place", "UK");
		
		JSONObject student2 = new JSONObject();
		student2.put("name", "Student B");
		student2.put("place", "USA");
		
		System.out.println(student1.toJSONString());
		System.out.println(student2.toJSONString());
		
		JSONArray details = new JSONArray();
		details.add(student1);
		details.add(student2);
		
		System.out.println(details.toJSONString());
		
		JSONObject studentdetails = new JSONObject();
		studentdetails.put("studentdetails", details);
		
		System.out.println(studentdetails.toJSONString());

	}

}
