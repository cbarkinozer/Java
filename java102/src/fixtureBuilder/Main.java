package fixtureBuilder;

public class Main {
	public static void main(String[] args) {
		FixtureBuilder fixtureBuilder = new FixtureBuilder();
		fixtureBuilder.add("Galatasaray");
		fixtureBuilder.add("Bursaspor");
		fixtureBuilder.add("Fenerbah�e");
		fixtureBuilder.add("Be�ikta�");
		fixtureBuilder.add("Ba�ak�ehir");
		fixtureBuilder.add("Bursaspor");
		fixtureBuilder.generateMatches();
	}
}
