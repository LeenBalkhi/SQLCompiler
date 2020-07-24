package CodeGen.CreatedClasses;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
public class c{
	public Number countries$id;
	public String countries$name;
	public String countries$code;
	public String countries$post_code;
	public ArrayList<c> list_c = new ArrayList<>();
	public ArrayList<countries> list_countries = new ArrayList<>();
	@Override
	public String toString(){
	StringBuilder stringBuilder = new StringBuilder();
	stringBuilder.append(countries$id+"  ");
	stringBuilder.append(countries$name+"  ");
	stringBuilder.append(countries$code+"  ");
	stringBuilder.append(countries$post_code+"  ");
	for(c var : list_c){
		stringBuilder.append(var+"  ");
	}
	for(countries var : list_countries){
		stringBuilder.append(var+"  ");
	}
	return stringBuilder.toString();
}
private void fillData(){
	list_countries.addAll( new countries().getData() );
}
public ArrayList<Fromc> cartProduct(){
	for(countries countries : list_countries){
		Fromc from = new Fromc();
		from.countries = countries;
		Fromc.list_fromc.add(from);
}
 ArrayList<Fromc> copy = new ArrayList<>();
	for(Fromc f : Fromc.list_fromc) copy.add(f);
Fromc.list_fromc =(ArrayList<Fromc>) Fromc.list_fromc.stream().filter(f-> f.countries.id <= 2).collect(Collectors.toList());
return Fromc.list_fromc;
}
public ArrayList<c> getData(){
fillData();
ArrayList<Fromc> from = cartProduct();
for(Fromc f : from){
c c = new c();
c.countries$id = f.countries.id;
c.countries$name = f.countries.name;
c.countries$code = f.countries.code;
c.countries$post_code = f.countries.post_code;
list_c.add(c);
}
return list_c;
}
}
