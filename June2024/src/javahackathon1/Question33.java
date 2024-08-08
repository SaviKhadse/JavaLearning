//A circus is designing a tower routine consisting of people standing atop one another’s shoulders. 
//For practical and aesthetic reasons, each person must be both shorter and lighter than the person below him or her. 
//Given the heights and weights of each person in the circus, You are given two sorted arrays, A and B, and A has a large 
//enough buffer at the end to hold B. Write a method to merge B into A in sorted order. write a method to compute the largest 
//possible number of people in such a tower. 
//EXAMPLE: Input (ht, wt): (65, 100) (70, 150) (56, 90) (75, 190) (60, 95) (68, 110) 
//Output: The longest tower is length 6 and includes from top to bottom: (56, 90) (60,95) (65,100) (68,110) (70,150) (75,190)
package javahackathon1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Question33{
	        int height;
	        int weight;
	        
	   public Question33(int height, int weight) {
	            this.height = height;
	            this.weight = weight;
	        }
	        @Override
	        public String toString() {
	            return "(" + height + "," + weight + ")";
	        }
	    public static void main(String[] args) {
	        // Example input
	        int[][] peopleArray = {{65, 100}, {70, 150}, {56, 90}, {75, 190}, {60, 95}, {68, 110}};
	        
	        List<Question33> people = new ArrayList<>();
	        for (int[] person : peopleArray) {
	            people.add(new Question33(person[0], person[1]));
	        }
	        List<Question33> longestTower = findLongestTower(people);
	        
	        System.out.println("The longest tower is length " + longestTower.size());
	        System.out.print("and includes from top to bottom: ");
	        for (Question33 p : longestTower) {
	            System.out.print(p + " ");
	        }
	        System.out.println();
	    }
	    
	    public static List<Question33> findLongestTower(List<Question33> people) {
	        if (people == null || people.isEmpty()) {
	            return new ArrayList<>();
	        }
	        
	        // Sort people by height ascending, and by weight ascending if heights are equal
	        people.sort(Comparator.comparing((Question33 p) -> p.height).thenComparing(p -> p.weight));
	        
	        // Find the longest increasing subsequence based on weight
	        List<Question33> tower = new ArrayList<>();
	        for (Question33 person : people) {
	            if (tower.isEmpty() || person.weight > tower.get(tower.size() - 1).weight) {
	                tower.add(person);
	            } else {
	                // Replace the person in the tower if current person is lighter and taller
	                // This step ensures we maintain the correct order based on both height and weight
	                for (int i = 0; i < tower.size(); i++) {
	                    if (person.weight < tower.get(i).weight) {
	                        tower.set(i, person);
	                        break;
	                    }
	                }
	            }
	        }
	        
	        return tower;
	    }
	}





