/*
-UNFINISHED-
Level:MEDIUM?
FC Codelona is trying to assemble a team from a roster of available players. They have a minimum number of players they want to sign,
and each player needs to have a skill rating within a certain range. Given a list of players's skill levels with desired upper and
lower bounds, determine how many teams can be created from the list.
Example:
skills=[12,4,6,13,5,10]
minPlayers=3
minLevel=4
maxLevel=10
return the amount of ways to form a team.
*/

import java.util.*;
import java.io.*;
public class Main {
    public static int countTeams(List<Integer>skills,int minPlayers,int minLevel, int maxLevel){
    int teamCount=0;
      int size=skills.size();
      int levelSum=0;
      for(int i=0;i<size;i++){
      levelSum=0;
        for(int j=0;j<size-j;i++){
          levelSum +skills.get(j);
          System.out.println(skills.get(j));
          if(levelSum<=maxLevel&levelSum>=minLevel){
            teamCount++;
          }
        }
      }
      return teamCount;
    }
    public static void main(String[] args){
        String[] strArr= new String[] {"0011", "0010"} ;
        System.out.println("Correct Result: 2 . Your Result: "+function(strArr));
        
    }
}
