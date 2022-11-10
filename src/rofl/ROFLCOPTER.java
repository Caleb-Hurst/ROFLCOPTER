package rofl;

public class RoflCopter { //copter
	//option cmd r rename for any object

	public static void main(String[] args) throws InterruptedException {
		new RoflCopter().fly();
//		ROFLCOPTER copter = new ROFLCOPTER();
//		copter.fly();
		
	}

	private void fly() throws InterruptedException {
		int c = 100;
		while (true) {
			for(int i = 0; i<10; i++) {
				System.out.println();
			}

			bladeRight();

			Thread.sleep(c);

			for(int i = 0; i<10; i++) {
				System.out.println();
			}

			bladeLeft();
			Thread.sleep(c);
		}
	}

	private void bladeLeft() {
		System.out.println("ROFL:ROFL:LOL                  ");
		System.out.println("          A          ");
		System.out.println("      /--------                 ");
		System.out.println("LOL======      []\\                  ");
		System.out.println("  L   \\          \\       ");
		System.out.println("       \\_________]            ");
		System.out.println("          I     I    ");
		System.out.println("        ------------/            ");
		System.out.println("                    ");
		System.out.println("     Calebs ROFLCOPTER            ");
	}

	private  void bladeRight() {
		System.out.println("          LOL:ROFL:ROFL                    ");
		System.out.println("          A          ");
		System.out.println("  L   /--------                 ");
		System.out.println("LOL======      []\\                 ");
		System.out.println("      \\          \\       ");
		System.out.println("       \\_________]            ");
		System.out.println("          I     I    ");
		System.out.println("        ------------/            ");
		System.out.println("                    ");
		System.out.println("     Calebs ROFLCOPTER            ");
	}
}
