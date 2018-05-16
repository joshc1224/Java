package dvr;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExecuteShellCommand {

	public static void main(String[] args) {

		ExecuteShellCommand obj = new ExecuteShellCommand();

		String domainName = "google.com";

		//in mac oxs
		//String command = "ping -c 3 " + domainName;

		//in windows
		String command = "c:/users/j/desktop/hello_world.bat " ;

		String output = obj.executeCommand(command);

		//System.out.println(output);
		
		String[] outputArr = output.split("\n");
		for (int i =0; i<outputArr.length;i++) {
			if (!outputArr[i].equals("")&&!outputArr[i].substring(0, 3).equalsIgnoreCase("c:\\"))
			System.out.println(outputArr[i]);
		}

	}

	private String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader =
                            new BufferedReader(new InputStreamReader(p.getInputStream()));

                        String line = "";
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();

	}

}