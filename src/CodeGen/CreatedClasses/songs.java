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
public class songs {

	@DBTable(columnName ="initials")
	public String initials;
	@DBTable(columnName ="track_id")
	public String track_id;
	@DBTable(columnName ="artist_name")
	public String artist_name;
	@DBTable(columnName ="title")
	public String title;
	@DBTable(columnName ="loudness")
	public double loudness;
	@DBTable(columnName ="tempo")
	public double tempo;
	@DBTable(columnName ="time_signature")
	public double time_signature;
	@DBTable(columnName ="keyy")
	public double keyy;
	@DBTable(columnName ="mode")
	public double mode;
	@DBTable(columnName ="duration")
	public double duration;
	@DBTable(columnName ="year")
	public double year;
	public static ArrayList<songs> Mysongs = new ArrayList<>();

	private ArrayList<songs> load() throws IOException {
 	BufferedReader csvReader = new BufferedReader(new FileReader("sample\\songs.csv"));
	String row="";
	while ((row = csvReader.readLine()) != null) {
		songs temp = new songs();
		int i=0;
 		String[] data = row.split(",");
			temp.initials= data[0];
			temp.track_id= data[1];
			temp.artist_name= data[2];
			temp.title= data[3];
			temp.loudness= Double.parseDouble(data[4]);
			temp.tempo= Double.parseDouble(data[5]);
			temp.time_signature= Double.parseDouble(data[6]);
			temp.keyy= Double.parseDouble(data[7]);
			temp.mode= Double.parseDouble(data[8]);
			temp.duration= Double.parseDouble(data[9]);
			temp.year= Double.parseDouble(data[10]);
			Mysongs.add(temp);
		}	return Mysongs;
}
public List<songs> getData() {
	try{
		return load();
}	catch(Exception e){
	return null;}
	}
	@Override
	public String toString(){
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(initials+"  ");
	stringBuilder.append(track_id+"  ");
	stringBuilder.append(artist_name+"  ");
	stringBuilder.append(title+"  ");
	stringBuilder.append(loudness+"  ");
	stringBuilder.append(tempo+"  ");
	stringBuilder.append(time_signature+"  ");
	stringBuilder.append(keyy+"  ");
	stringBuilder.append(mode+"  ");
	stringBuilder.append(duration+"  ");
	stringBuilder.append(year+"  ");
	return stringBuilder.toString();}
}
