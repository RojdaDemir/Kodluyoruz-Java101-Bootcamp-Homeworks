package question6.fileoperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class FileOperations {

	
	public static void write(File file, String content) {
		
		FileWriter writer = null;
		
		try {
			writer = new FileWriter(file, true);
			writer.write(content);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(writer != null) {
					writer.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String read(InputStream is) {
		
		BufferedReader reader = null;
		InputStreamReader streamReader = null;
		
		try {
			
			streamReader = new InputStreamReader(is, StandardCharsets.UTF_8);
			reader = new BufferedReader(streamReader);
			
			String line;
			
			StringBuilder builder = new StringBuilder();
			
			while ((line = reader.readLine()) != null) {
				builder.append(line);
			    builder.append("\n");
			}
			
			return builder.toString();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(is != null) {
					is.close();
				}
				if(streamReader != null) {
					streamReader.close();
				}
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return "";
	}
	
	public static String read(File file) {
		
		try {
            List<String> lines = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
            final StringBuilder builder = new StringBuilder();
            lines.forEach( line -> { 
            	builder.append(line); 
            	builder.append("\n");
            } );
            return builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
		return "";
	}
		
		
		
	}
	
	
