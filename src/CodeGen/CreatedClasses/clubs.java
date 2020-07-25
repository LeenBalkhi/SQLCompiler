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
public class clubs {

	@DBTable(columnName ="id")
	public double id;
	@DBTable(columnName ="name")
	public String name;
	public city city;
	public static ArrayList<clubs> Myclubs = new ArrayList<>();

	private ArrayList<clubs> load() throws IOException { 
	Gson gson = new Gson();
	JsonReader reader = new JsonReader(new FileReader("sample\\clubs.json"));
	JsonObject jsonObject = gson.fromJson(reader,JsonObject.class);
	JsonElement jsonElement = jsonObject.get("clubs");
	clubs [] data = gson.fromJson(jsonElement,clubs[].class);
	for(int i=0;i<data.length;i++){
		Myclubs.add(data[i]);
	}
	return Myclubs;
}
public List<clubs> getData() {
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
	stringBuilder.append(city+"  ");
	return stringBuilder.toString();}
}
