
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        System.out.println("File: ");
            String file = scan.nextLine();
            
        System.out.println("Team: ");
            String team = scan.nextLine().trim();
            
            int games = 0;
            int wins = 0;
            
        try (Scanner fileScanner = new Scanner(Paths.get(file))){
            while (fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                
                String homeTeam = parts[0].trim();
                String awayTeam = parts[1].trim();
                int homePoints = Integer.valueOf(parts[2].trim());
                int visitorPoints = Integer.valueOf(parts[3].trim());
                
                boolean isHome = homeTeam.equals(team);
                boolean isAway = awayTeam.equals(team);
                
                if (isHome || isAway){
                    games++;
                    
                    if ((isHome && homePoints > visitorPoints) || (isAway && visitorPoints > homePoints)){
                        wins++;
                    }
                }
                
            }
            
        } catch (Exception e) {
            System.out.println("Not found!.");
        }
        
            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (games - wins));
    }

}
