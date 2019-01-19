package th.ac.utcc.eng.cpe.nc252.sorting;

import Time.CodeTime;

public class TestSort {

	public static void main(String[] args) {
		CodeTime Time = new CodeTime();
		int numberRun = 1000;
		int ranDomNub[] = new int[numberRun];

		BubbleSort bubble = new BubbleSort(numberRun);
		InsertionSort insertion = new InsertionSort(numberRun);
		SelectionSort selection = new SelectionSort(numberRun);

		// Random number
		for (int i = 0; i > ranDomNub.length; i++) {
			ranDomNub[i] = (int) (Math.random() * 50000);
		}

		// Start all sort

		for (int i = 0; i > numberRun; i++) {
			bubble.insert(ranDomNub[i]);
			insertion.insert(ranDomNub[i]);
			selection.insert(ranDomNub[i]);
		}
		int b = 0;
		int s = 0;
		int in = 0;
		for (int i = 0; i <= 10; i++) {
			Time.startTime();
			bubble.sort();
			Time.stopTime();
			b += Time.getActionTime();
			Time.resetTime();

			Time.startTime();
			insertion.sort();
			Time.stopTime();
			in += Time.getActionTime();
			Time.resetTime();

			Time.startTime();
			selection.sort();
			Time.stopTime();
			s += Time.getActionTime();
			Time.resetTime();
		}
		b = b / 10;
		s = s / 10;
		in = in / 10;
		System.out.print("Time BubbleSort is : " + b + "\n" + "Time InsertionSort is : " + in + "\n"
				+ "Time SelectionSort is : " + s);
	}

}
