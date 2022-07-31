package question1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;


public class Skyscraper {
	
	LinkedList<Integer> SizeOfFloor = new LinkedList<Integer>();
	LinkedList<Integer> sortedSizeOfFloor = new LinkedList<Integer>();
	
	public void getSortedFloorSize()
	{
		Scanner scNoOfFloor = new Scanner(System.in);
		System.out.println("Please enter the total no of floors in the building");
		int n = scNoOfFloor.nextInt();
		
		// Since everyday one floor is constructed hence No. of floor = No. of days)
//		Queue<Integer> SizeOfFloor = new LinkedList<>();
//		LinkedList<Integer> SizeOfFloor = new LinkedList<Integer>();
		for (int i =1; i<=n; i++)
			
		{
			Scanner scFloorSize = new Scanner(System.in);			
			System.out.println("Please enter the floor size given on day :"+" "+i);
			SizeOfFloor.add(scFloorSize.nextInt()); 		
        }
		     
		System.out.println("The order of construction is as follows");
		for (int i =1; i<=n; i++)
		{
		 for(int j =1; j <= SizeOfFloor.size(); j++)
		 {		 
			if (SizeOfFloor.get(j+1)< SizeOfFloor.get(j))
			{
				System.out.println("day" +i+ ":");				
		    }
			else 
			{
				sortedSizeOfFloor.add(SizeOfFloor.remove());
				Collections.sort(sortedSizeOfFloor, Collections.reverseOrder());
				System.out.println("day" +i+ ":" +sortedSizeOfFloor);
			}

		 }
		}		
	}

}
