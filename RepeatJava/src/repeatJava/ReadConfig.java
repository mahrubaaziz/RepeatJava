package repeatJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	
	@Test
	public void readConFigFile()
	{
		try{//./ it means user derectory
		//File srcf = new File(System.getProperty("user.dir")+"./Config/environment.properties"); //providing the location we have by System.get...
		              //as we are using the user directory  I donot need RepeatJava before config file
		//FileInputStream srcg = new FileInputStream(srcf);
		//XSSF
		Properties pros=new Properties(); //reading the property type file
		
		//calling the obj and to load from the srcg file in one line
		
		
		
		pros.load(new FileInputStream(new File(System.getProperty("user.dir")+"./Config/environment.properties")));
		 
		
		System.out.println(pros.get("username"));//taking property from environment folder
		System.out.println(pros.get("password"));
		}catch(FileNotFoundException e){// it does not know how to  read the file type of error it is 
			System.out.println("Couldn't find the file "+e.getMessage());//this is for fileinputstream
		}
		catch(IOException e){//java does not know how to read the file it wil help to throw the exception
			System.out.println("Loading Exception"+e.getMessage());// its for load we need to put ioexception for loading
		}
		
		}
	}


