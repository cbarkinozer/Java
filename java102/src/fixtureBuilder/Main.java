package fixtureBuilder;

public class Main {
	public static void main(String[] args) {
		FixtureBuilder fixtureBuilder = new FixtureBuilder();
		fixtureBuilder.add("Galatasaray");
		fixtureBuilder.add("Bursaspor");
		fixtureBuilder.add("Fenerbahçe");
		fixtureBuilder.add("Beþiktaþ");
		fixtureBuilder.add("Baþakþehir");
		fixtureBuilder.add("Bursaspor");
		fixtureBuilder.generateMatches();
	}
}
