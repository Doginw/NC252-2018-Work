package ReadFileExcel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelFile {

	
	private File inPutFile = new File("D:\\K\\Two\\DataBass\\Dictionary\\Dictionary.xls");
	private Sheet sheet;
	private int row ;
	private int column ;
	
	public ReadExcelFile() throws BiffException, IOException {
		Workbook w ;
		w = Workbook.getWorkbook(inPutFile);
		sheet = w.getSheet(0);
		row = sheet.getRows();
		column = sheet.getColumns();
	}
	
	public ReadExcelFile(String inPut) throws BiffException, IOException {
		this.inPutFile = new File(inPut);		
		Workbook w ;
		w = Workbook.getWorkbook(inPutFile);
		sheet = w.getSheet(0);
	}
		
	public String readWork(int i) throws IOException, BiffException{
		Cell cell = sheet.getCell(1,i);
		return	cell.getContents() ;		
	}
	
	public String readDiscussion(int i) throws IOException, BiffException{
		Cell cell = sheet.getCell(2,i);
		return cell.getContents();
		
	}
	
	public void read() throws IOException {
		String c = null;
		for(int j=1;j<sheet.getRows();j++) {
			for(int i= 1;i<sheet.getColumns();i++) {
			Cell cell = sheet.getCell(i,j);				
			c = cell.getContents();
			System.out.print(c);
			}
			System.out.print("\n");
			if (c == null) {
				j = sheet.getRows();
			}
		}
		
	}
	
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	public int find(String text,ReadExcelFile excelFile) throws BiffException, IOException {
		int num = 0 ;
		int i = 0;
		while (text.compareTo(excelFile.readWork(i))!=0){
			if(i == excelFile.getRow())
				break;
			num++;
			i++;
		}
		
		return num ;
	}

	public static void main(String [] args) throws IOException, BiffException {
		ReadExcelFile excelFile = new ReadExcelFile();
		//excelFile.read(1);
		String a = excelFile.readWork(3);
		System.out.println(a);
		//System.out.println(excelFile.getRow());
		System.out.print(excelFile.find("able", excelFile));
		
		
	}
}
