package Dicaionary;

import java.io.IOException;

import ReadFileExcel.ReadExcelFile;
import jxl.read.biff.BiffException;

import java.util.Scanner;

public class ProgramMain {
	public static void main(String[] args) throws BiffException, IOException {
		ReadExcelFile eX = new ReadExcelFile();
		int size = eX.getRow();
		String key = null;
		String exit = "exit";
		String insert = "insert";
		Scanner sc = new Scanner(System.in);
		boolean root = true;
		Nods n = new Nods(size);
		for (int j = 1; j < size; j++) {
			n.insert(eX.readWork(j), eX.readDiscussion(j));
		}

		System.out.println("Welcom to Dicaionary.");
		System.out.println("-------------------------\n");
		while (root) {
			System.out.print("search the work : ");
			key = sc.next();
			if (key.equals(exit)) {
				break;
			} else if (key.equals(insert)) {
				System.out.print("Insert \nWork : ");
				String work = sc.next();
				System.out.print("\nDiscussion : ");
				String discussion = sc.next();
				n.insert(work, discussion);
				System.out.println("Insert complete\n");
			} else {
				n.find(key);
			}
		}
		System.out.println("\nThack you for use.");

		// sc.nextLine();
	}
}
