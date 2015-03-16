import java.io.IOException;
import java.util.Properties;
import java.io.InputStream;
import java.io.FileInputStream;



public class SymbolCounter {

    public static void main(String []args) {
	InputStream inputStream = null;
	Properties prop = new Properties();	
	try {
		inputStream = new FileInputStream(args[0]); 
		if (inputStream != null){
			prop.load(inputStream);
		} else {
			System.out.println("No data");
	}	
	} catch (IOException ex) {
		//ex.printStackTrace();
		System.out.println("No file");
	}	
	
	System.out.println(prop.getProperty("message"));	
	}

} 