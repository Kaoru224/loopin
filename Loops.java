public class Loops {
	public static void main(String[] args) {
		
			int effectivenessLost = 4;
			int effectivenessThreshold = 50;

			potency(effectivenessLost,effectivenessThreshold);

		}


		public static void potency(int lost, int threshold) {
			int month = 0;
				
			double percent = 100.0;

			double finalLost = 0;



			while (percent > threshold) {
				
				System.out.println("Month: " + month + "    " + "Effectiveness: " + percent);
				month++;
				finalLost = percent*.04;
				percent-=finalLost;

			}
				System.out.println("Month: " + month + "    " + "Effectiveness: " + percent + " DISCARDED" );


		}
}