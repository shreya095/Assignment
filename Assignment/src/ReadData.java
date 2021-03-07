import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;




public class ReadData{
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		try{
			FileReader fin=new FileReader("C:\\Users\\91959\\eclipse-workspace\\Day4IO\\src\\ConsoleOperations.java");
			int ch;
			
			while ((ch=fin.read())!=-1)
			{
				System.out.print((char)ch);
				
			}
			fin.close();
			}
		catch(IOException fe){
			System.out.println("File not found");
		}
		
		
		
		
		//String str="Add this data to a file and save it";
		
		try {
		
		FileWriter fout =new FileWriter("left.txt",true);
		fout.write("Add this data to a file and save it");
		
		
		fout.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}

}
