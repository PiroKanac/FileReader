import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
	
	private BufferedReader br;

	public void readDataFromFile(String filepath, String filename) throws IOException {
		File f = new File(filepath + "/" + filename);
		FileReader fr = new FileReader(f);
		br = new BufferedReader(fr);
		String s = br.readLine();
		while(s != null) {
			System.out.println(s);
			s = br.readLine();
		}	
	}
	
	public void writeDatatoFile(String filepath, String filename, String data) throws IOException {
		
	/*	File f = new File(filepath + "/" + filename);
		FileWriter fw = new FileWriter(f);
		//FileWriter fw = new FileWriter(f, true);  // now you can write to file continuously
		fw.write(data);
		fw.flush();
		fw.close(); */
		
		File f = new File(filepath + "/" + filename);
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(data);
		bw.flush();
		bw.close();
		
		
	}

}
