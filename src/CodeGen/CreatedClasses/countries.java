package CodeGen.CreatedClasses;

import org.json.simple.JSONArray;;
import CodeGen.DBTable;
import Rules.AST.SQL.DDL.CreateTableStatement;
import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import java.io.*;
import java.util.*;
import java.lang.reflect.Field;
import Rules.SymbolTableMu.*;
import java.lang.annotation.*;
public class countries {

	@DBTable(columnName ="id")
	public double id;
	@DBTable(columnName ="name")
	public String name;
	@DBTable(columnName ="code")
	public String code;
	@DBTable(columnName ="post_code")
	public String post_code;
	@DBTable(columnName ="region")
	public String region;
	public static ArrayList<countries> Mycountries = new ArrayList<>();

	private ArrayList<countries> load() throws IOException { 
	Gson gson = new Gson();
	JsonReader reader = new JsonReader(new FileReader("sample\\countries.json"));
	JsonObject jsonObject = gson.fromJson(reader,JsonObject.class);
	JsonElement jsonElement = jsonObject.get("countries");
	countries [] data = gson.fromJson(jsonElement,countries[].class);
	for(int i=0;i<data.length;i++){
		Mycountries.add(data[i]);
	}
	return Mycountries;
}
public List<countries> getData() {
	try{
		return load();
}	catch(Exception e){
	return null;}
	}
	@Override
	public String toString(){
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(id+"  ");
	stringBuilder.append(name+"  ");
	stringBuilder.append(code+"  ");
	stringBuilder.append(post_code+"  ");
	stringBuilder.append(region+"  ");
	return stringBuilder.toString();}
}
