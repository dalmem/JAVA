package quiz22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Student s = new Student();
		List<Student> list = new ArrayList<>();
		Point p =new Point();
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			InterPoint.menuInfo();int menu = scan.nextInt();
			switch (menu) {
			case 1:
				p.input(list);
				
				break;
			case 2:
				p.showPointUI();
				p.showAll(list);

				break;
			case 3:
				p.search(list);
				break;
			case 4:
				p.modify(list);
				break;
			case 5:
				p.delete(list);
				break;

			default:
				break;
			}

		}

	}
}
