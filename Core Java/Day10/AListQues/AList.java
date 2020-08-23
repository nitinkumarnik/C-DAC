package AListQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AList {
	
	
	private static void maximumRuns(ArrayList<Player> al) {
		System.out.println("Player with maximum runs: ");
		
		int run = 0;
		int index = -1;
		for (Player p: al) {
			if (p.totalrun > run) {
				run = p.totalrun;
				index = al.indexOf(p);
			}
		}
		Player obj = al.get(index);
		obj.display();		
	}
	
	
	private static void disp(ArrayList<Player> al) {
		for (Player obj: al) {
			obj.display();
		}
	}
	
	private static void sortByName(ArrayList<Player> al) {
		System.out.println("Sort player by name: ");
		
		SortByNm srt = new SortByNm();
		Collections.sort(al, srt);
		
		disp(al);
	}
	
	
	private static void removePlayers(ArrayList<Player> al) {
		System.out.println("Removing players with (runs < 100 and matches > 3)");
		
//		for (Player player : al) {
//			if (player.totalrun < 100  && player.noofmatches > 3) {
//				
//			}
//		}
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Player obj = (Player) it.next(); 
			if (obj.totalrun < 100  && obj.noofmatches > 3) {
				it.remove();
			}
		}
		disp(al);
	}
	
	
	private static void updateCategory(ArrayList<Player> al) {
		System.out.println("Update Category..");
		for (Player player : al) {
			if (player.noofcentury >= 10) {
				player.category = "A";
			} else {
				player.category = "B";
			}
			
		}
	}

	
	public static void main(String[] args) {
		
		ArrayList<Player> al = new ArrayList<>();
		
		Player p1 = new Player("Rohit", 1200, 2, 50, 10, "India");
		Player p2 = new Player("Virat", 11, 3, 60, 6, "India");
		Player p3 = new Player("Ashwin", 120, 40, 45, 0, "India");
		Player p4 = new Player("Harbhajan", 180, 43, 60, 1, "India");
		Player p5 = new Player("Gilchrist", 90, 2, 50, 3, "Australia");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		al.add(p5);
		
		/********** Inputing values by array.
		 * 
		Player[] p = new Player[5];
		
		for (int i=0; i<p.length; i++) {
			p[i] = new Player();
			System.out.println("Enter " + (i+1) + " player details: ");
			p[i].setPlayer();
		}
		*
		*************/
		
		
//		System.out.println(al);
		
		System.out.println("************************************");
//		for (Player obj: al) {
//			obj.display();
//		}
		disp(al);
		System.out.println("************************************");
		updateCategory(al);
		disp(al);
		System.out.println("************************************");
		
		maximumRuns(al);
		
		System.out.println("************************************");
		
		sortByName(al);
		
		System.out.println("************************************");
		
		removePlayers(al);
		
		System.out.println("************************************");
		
		
	
			
	}
	
}


class SortByNm implements Comparator<Player> {

	@Override
	public int compare(Player o1, Player o2) {
		return o1.name.compareTo(o2.name);
	}
	
	
}
