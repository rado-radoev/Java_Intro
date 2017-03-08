// https://www.codewars.com/kata/growth-of-a-population/train/java
public class PopulationGrowth {

	public static void main(String[] args) {
		System.out.print(nbYear(1000, 2, 50, 1200));

	}

	
	public static int nbYear(int p0, double percent, int aug, int population) {
        percent /= 100;
        int years = 0;
        while (population > p0) {
        	p0 += (int) ((p0 * percent) + aug);
        	years++;
        }
        	return years;
	}
}
