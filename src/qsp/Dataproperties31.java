package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Dataproperties31 {
@Test
public  static void Dataproperties31() throws FileNotFoundException, IOException{
	Properties  p= new Properties();
	p.load(new FileInputStream("./Input/data.properties"));
	String v = p.getProperty("area");
	System.out.println(v);
	
}
}
