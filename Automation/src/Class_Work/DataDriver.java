package Class_Work;

import java.util.ArrayList;
import java.util.HashMap;

public class DataDriver 
{

	public static void main(String[] args)
	{
		ArrayList<String>aL=new ArrayList<>();
		aL.add("https://demo.actitime.com/");
		aL.add("admin");
		aL.add("admin@actitime.com");
		aL.add("manager");
		System.out.println(aL.get(2));
		HashMap<String,String>map=new HashMap<>();
		map.put("Url","https://demo.actitime.com/");
		map.put("username","admin");
		map.put("password","manager");
		System.out.println(map.get("password"));

	}

}
