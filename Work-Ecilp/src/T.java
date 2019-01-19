import java.io.IOException;
import java.nio.channels.NetworkChannel;

import Dicaionary.Data;
import Dicaionary.Nods;

import ReadFileExcel.*;
import jxl.read.biff.BiffException;

public class T {
	public static void main(String[] args) throws BiffException, IOException {
		ReadExcelFile eX = new ReadExcelFile();
		int size = eX.getRow();
		Nods n = new Nods(size);
		for (int j = 1; j < size; j++) {
			n.insert(eX.readWork(j), eX.readDiscussion(j));
		}
		n.find("ables");

	}

}
