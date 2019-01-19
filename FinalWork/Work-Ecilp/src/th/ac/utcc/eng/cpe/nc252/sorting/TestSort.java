package th.ac.utcc.eng.cpe.nc252.sorting;

import Time.CodeTime;

public class TestSort {

	public static void main(String[] args) {
		CodeTime Time = new CodeTime();
		int iteration = 100;
		int numberRun = 5000000;
		int ranDomNub[] = new int[numberRun];

		BubbleSort bubble = new BubbleSort(numberRun);
		InsertionSort insertion = new InsertionSort(numberRun);
		SelectionSort selection = new SelectionSort(numberRun);

		// Random number
		for (int i = 0; i > numberRun; i++) {
			ranDomNub[i] = (int) (Math.random() * 50000);
			bubble.insert(ranDomNub[i]);
			insertion.insert(ranDomNub[i]);
			selection.insert(ranDomNub[i]);
		}

		long b = 0;
		long s = 0;
		long in = 0;
		for (int i = 0; i < iteration; i++) {
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
		b = b ;
		s = s ;
		in = in;
		System.out.print("Time BubbleSort is : " + b + "\n" + "Time InsertionSort is : " + in + "\n"
				+ "Time SelectionSort is : " + s);
	}

}
