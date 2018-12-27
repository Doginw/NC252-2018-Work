/*import jxl.*;
import jxl.read.biff.BiffException;
*/
//import java.io.*;
public class T {	
	/*
	private static String inPut;
	
	public void inPutFile(String inPutFile) {
		this.inPut = inPutFile;
	}
	public void readWork() throws IOException, BiffException{
		File inPutFile = new File(inPut);
		Workbook w ;
		w = Workbook.getWorkbook(inPutFile);
		Sheet sheet = w.getSheet(0);
		for(int i=1 ;i<sheet.getRows();i++) {
			Cell cell = sheet.getCell(1,i);
			System.out.print(cell.getContents()+"\n");
		}
		
	}
	public void readDiscussion() throws IOException, BiffException{
		File inPutFile = new File(inPut);
		Workbook w ;
		w = Workbook.getWorkbook(inPutFile);
		Sheet sheet = w.getSheet(0);
		for(int i=1 ;i<sheet.getRows();i++) {
			Cell cell = sheet.getCell(2,i);
			System.out.print(cell.getContents()+"\n");
		}
		
	}
	
	public void read() throws IOException {
		File inPutFile = new File(inPut);
		Workbook w ;
		try {
			w = Workbook.getWorkbook(inPutFile);
			Sheet sheet = w.getSheet(0);
			for(int j=1;j<sheet.getRows();j++) {
				for(int i= 1;i<sheet.getColumns();i++) {
				Cell cell = sheet.getCell(i,j);
				System.out.print(cell.getContents()+" ");
				}
				System.out.print("\n");
			}
			/*
			for(int j=0;j<sheet.getColumns();j++) {						
				for(int i=0;i<sheet.getRows();i++) {
					Cell cell = sheet.getCell(j,i);
					System.out.println(cell.getContents());
				}
			}
			
			
		}catch (BiffException e ) {
			e.printStackTrace();
		}
		
	}*/
	/*
	public static void main(String [] args) throws IOException, BiffException {
		T test = new T();
		test.inPutFile("D:\\K\\Two\\DataBass\\Dictionary\\Dictionary.xls");
		test.readDiscussion();;
		
	}
	*/
}

