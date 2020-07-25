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
public class city {

	public double id;
	public String name;
	public country country;
	@Override
	public String toString(){
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(id+"  ");
	stringBuilder.append(name+"  ");
	stringBuilder.append(country+"  ");
	return stringBuilder.toString();	}
}
