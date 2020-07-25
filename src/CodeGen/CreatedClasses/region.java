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
public class region {

	public String name;
	@Override
	public String toString(){
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(name+"  ");
	return stringBuilder.toString();	}
}
