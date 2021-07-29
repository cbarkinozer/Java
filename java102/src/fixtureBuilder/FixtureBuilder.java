package fixtureBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureBuilder {
	List<String>teams; 

	
	FixtureBuilder(){
		teams = new ArrayList<>();
	}
	FixtureBuilder(List<String> teams){
		 this.teams = teams;
	}
	
	
	 public void add( String teamName ){
	        teams.add(teamName);
	    }
	 public void generateMatches( ){
		 int size = teams.size();
	        if( size % 2 == 1 ) {
	        	teams.add("Bay");
	        }
	        
	        //Create a String List name round where you store matches
	        List<String> round = new ArrayList<String>();
	        for( int i = 0 ; i < teams.size() ; i++ ){
	            for( int k = 0 ; k < teams.size() ; k++ ){
	                if( k == i )continue;
	                String match = teams.get(i) + " vs " +  teams.get(k);
	                round.add(match);
	            }
	        }
	        //Print all the teams names
	        System.out.println("Takýmlar ");
	        for( String team : teams ){
	            if( !team.equals("Bay") )
	                System.out.println("-"+ " "+team);
	        }

	        int plus = teams.size();
	        Collections.shuffle(round);
	        for( int i = 0 ; i < teams.size() ; i++ ){

	        	System.out.println();
	        	System.out.println("Round "+(i+1));
	            System.out.println(round.get(i));
	            System.out.println(round.get((i+plus)% round.size()) );
	            System.out.println(round.get(((i+plus*2) % round.size())));
	        }




	        teams.remove("Bay");
	    }
}
