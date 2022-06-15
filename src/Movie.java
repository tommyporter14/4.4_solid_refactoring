import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie implements Play{
	
	//fields
	String title;
	int runTime;
	ArrayList<String> scenes;
	int iPlay;
	int currentTime;
	
	//getters/setters
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

	public int getiPlay() {
		return iPlay;
	}

	public void setiPlay(int iPlay) {
		this.iPlay = iPlay;
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}
	
	//constructor
	public Movie(String title, int runTime, ArrayList<String> scenes, int iPlay) {
		super();
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
		this.iPlay = iPlay;
	}
	
	//methods
	public void printInfo() {
		System.out.println("Title: " + title);
		System.out.println("Run Time: " + runTime);
	}

	public void printScenes() {
		for (String scene : scenes) {
			System.out.println("Scene " + (scenes.indexOf(scene)+1) + ": " + scene);
		}
	}
	
	public void play() {
		play(scenes);
	}
	
	@Override
	public void play(List<String> scenes) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Which scene would you like to watch?:");
		printScenes();
		int choice = scnr.nextInt();
		setiPlay(choice);
		System.out.println("Scene " + iPlay + ": " + scenes.get(iPlay));
		currentTime++;
	}
}
