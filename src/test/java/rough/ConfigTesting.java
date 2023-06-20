package rough;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigTesting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println(System.getProperty("user.dir"));
		Properties config= new Properties();
		
		
		FileInputStream fis= new FileInputStream("C:\\Java\\workspace\\class30_SkyItSchool_part4_Cucumber_Runner_MT\\src\\test\\java\\rough\\config.properties");
    config.load(fis);
    
    System.out.println( config.getProperty(    "city"     ));
    System.out.println(config.getProperty(     "name"     ));

	}

}
