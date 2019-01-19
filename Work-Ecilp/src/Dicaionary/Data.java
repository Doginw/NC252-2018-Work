package Dicaionary;

public class Data {
	public String work, discussion;
	public Data next;

	public Data() {
	}

	public Data(String work, String discussion) {
		this.work = work;
		this.discussion = discussion;
	}

	public String toString() {
		return work + " " + discussion;
	}

	public String getWork() {
		return this.work;
	}
	public String getDiscussion() {
		return this.discussion;
	}

}
