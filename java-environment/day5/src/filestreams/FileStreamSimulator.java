package filestreams;

/*
 * Many of our streams will come from 
 * java.io (input/output) 	
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamSimulator {
	/*
	 * Streams 2 definitions:
	 * 
	 * 'General' definition: An object which reads information from a source, and
	 * can provide information to a target location, performing operations on that
	 * source data prior.
	 * 
	 * 'Exact' definition: A sequence of objects that support various methods which
	 * can be pipelined to produce a desired result. These methods will either be
	 * intermediate or terminal operations. intermediate operations perform some
	 * operation and provide another stream, while terminal operations provide the
	 * result from the source. Streams do not alter the source data directly.
	 */
	private static String FILE_NAME = "files/myfile";
	private static String FILE_EXT = ".txt";

	private static FileOutputStream fos = null;
	private static FileInputStream fis = null;
	private static FileReader fr = null;
	private static FileWriter fw = null;

	public static void main(String[] args) {
		System.out.println("==== Start ====");
		try {
//			fosExample();
//			fisExample();
			fileReaderWriterExample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=== END ===");
	}

	public static void fosExample() throws IOException {
		/*
		 * When we create a new FileOutputStream object, we provide the path for a file
		 * in which we will write
		 */
		fos = new FileOutputStream(FILE_NAME+FILE_EXT);
		for (int i = 0; i < 5; i++) {
			for (char letter = 'A'; letter <= 'Z'; letter++) {
				fos.write(letter);

				if (letter == 'Z') {
					fos.write('\n');
				}
			}
		}
		
		if (fos!=null)
			fos.close();
	}
	
	public static void fisExample() throws IOException {
		fis = new FileInputStream(FILE_NAME+FILE_EXT);
		byte in;
		/*
		 * When our input stream reads a byte as -1
		 * we have reached the end of our input
		 */
		while ((in = (byte)(fis.read())) != -1) {
			System.out.print((char)in);
		}
		
		if (fis != null)
			fis.close();
	}
	
	public static void fileReaderWriterExample() throws IOException {
		/*
		 * File Reader and File Writer allow you
		 * to read/write from a file, respectively
		 * 
		 * File reader and file writer allow us
		 * to process data, two bytes at a time 
		 * instead of byte by byte.
		 * 
		 * recall that bytes are 8 bit values
		 * and char are 16 bit (positive) values 
		 */
		fr = new FileReader(FILE_NAME+FILE_EXT);
		fw = new FileWriter(FILE_NAME+"_camel"+FILE_EXT);
		int in;
		while ((in = fr.read()) != -1) {
			/*
			 * here we are checking for new lines
			 */
			if (in == (int)'\n') {
				fw.write((char)in);
			} else if (in % 2 == 0) {
				/*
				 * Here, we are adding 32 to the
				 * value, to change the casing...
				 */
				fw.write((char)(in+32));
			} else {
				fw.write((char)in);
			}
		}
		/*
		 * Writing to files is a fairly resource
		 * intensive process, and as such, FileWriters
		 * will use a buffer area, that will wait for
		 * other processes before writing to a file
		 * in one batch. In this case, we must manually
		 * flush the buffer (enforcing the writing to
		 * our file). Note that when you close an input
		 * or output stream, this will also cause the
		 * buffer to be flushed...
		 */
		fw.flush(); // manually flush buffer

		/*
		 * closing the input/output stream will also
		 * close the buffer. Additionally, it is
		 * always best practice to do so
		 */
		if (fr != null)
			fr.close();
		if (fw != null)
			fw.close();
	}
	
	
}
