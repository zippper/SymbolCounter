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
		if (inputStream != null && args.length > 0){
			prop.load(inputStream);
			System.out.println(prop.getProperty("message"));	
			System.out.println("Message length = " + getMessageLength(prop.getProperty("message")));

		} else {
			System.out.println("No data");
	}	
	} catch (IOException ex) {
		//ex.printStackTrace();
		System.out.println("No file");
	}	
	}

	public static int getMessageLength(String message){

		return message.length();
	
	}

} 