import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class BlockbusterAppTests {

	@Test
	void testDVDTitle() {
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		
		DVD dvd = new DVD("Star Wars: A New Hope", 121, movieScenes1);
		String expected = "Star Wars: A New Hope";
		String actual = dvd.getTitle();
		assertEquals(expected, actual);
	}
	

	@Test
	void testDVDRunTime() {
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		
		DVD dvd = new DVD("Star Wars: A New Hope", 121, movieScenes1);
		int expected = 121;
		int actual = dvd.getRunTime();
		assertEquals(expected, actual);
	}

	@Test
	void testVHSTitle() {
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		
		VHS vhs = new VHS("Star Wars: A New Hope", 121, movieScenes1);
		String expected = "Star Wars: A New Hope";
		String actual = vhs.getTitle();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHSRunTime() {
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		
		VHS vhs = new VHS("Star Wars: A New Hope", 121, movieScenes1);
		int expected = 121;
		int actual = vhs.getRunTime();
		assertEquals(expected, actual);
	}
	

	@Test
	void testVHSCurrentTime() {
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		
		VHS vhs = new VHS("Star Wars: A New Hope", 121, movieScenes1);
		int expected = 0;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHSPlay() {
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		
		VHS vhs = new VHS("Star Wars: A New Hope", 121, movieScenes1);
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("R2’s Mission");
		scenes.add("Meeting Old Ben");
		scenes.add("Rescuing the Princess");
		scenes.add("Use the Force, Luke");
		vhs.setScenes(scenes);
		vhs.play(movieScenes1);
		int expected = 1;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}
	
	@Test
	void testVHSRewind() {
		ArrayList<String> movieScenes1 = new ArrayList<>();
		movieScenes1.add("R2’s Mission");
		movieScenes1.add("Meeting Old Ben");
		movieScenes1.add("Rescuing the Princess");
		movieScenes1.add("Use the Force, Luke");
		
		VHS vhs = new VHS("Star Wars: A New Hope", 121, movieScenes1);
		ArrayList<String> scenes = new ArrayList<>();
		scenes.add("R2’s Mission");
		scenes.add("Meeting Old Ben");
		scenes.add("Rescuing the Princess");
		scenes.add("Use the Force, Luke");
		vhs.setScenes(scenes);
		vhs.play(movieScenes1);
		vhs.play(movieScenes1);
		vhs.rewind();
		int expected = 0;
		int actual = vhs.getCurrentTime();
		assertEquals(expected, actual);
	}
}