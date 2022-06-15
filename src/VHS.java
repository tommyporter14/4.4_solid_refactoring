import java.util.ArrayList;
import java.util.List;

public class VHS implements Play{

	//fields
	int currentTime;
	String title;
	int runTime;
	ArrayList<String> scenes;

	//getter/setter
	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public int getCurrentTime() {
		return currentTime;
	}

	//Constructor
	public VHS(String title, int runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
		
	}
	
	//methods
	@Override
	public String toString() {
		return "Title: " + title + " Runetime: " + runTime;
	}
	
	@Override
	public void play(List<String> scenes) {
		if(currentTime >= scenes.size()) {
			System.out.println("You've reached the end of the tape, starting rewind.");
			rewind();
		}
		else {
			System.out.println("Scene " + (currentTime +1) + ": " + scenes.get(currentTime));
			currentTime++;
		}
	}
	
	public void rewind() {
		currentTime = 0;
	}
	
}
