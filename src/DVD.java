import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DVD implements Play{

	//fields
	String title;
	int sceneChoice;
	int runTime;
	ArrayList<String> scenes;
	
	//getters setters
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getSceneChoice() {
		return sceneChoice;
	}

	public void setSceneChoice(int sceneChoice) {
		this.sceneChoice = sceneChoice;
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

	//constructor
	public DVD(String title, int runTime, ArrayList<String> scenes) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}
	
	
	//method override
	@Override
	public String toString() {
		return "Title: " + title + "\n Runetime: " + runTime;
	}
	
	@Override 
	public void play(List<String> scenes) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Which scene would you like to view?");
		for (int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene: " + (i+1) + ". " + scenes.get(i));
		}
		System.out.print("Please select a scene: ");
		sceneChoice = scnr.nextInt();
		System.out.println ("Here is scene " + sceneChoice + ": " + scenes.get(sceneChoice-1));
	}
}