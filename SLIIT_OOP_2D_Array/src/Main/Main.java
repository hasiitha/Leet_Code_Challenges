package Main;

import java.util.Random;



public class Main {

	public static void main(String[] args) {
		RandNum obj = new RandNum();
		obj.calculate();
		obj.display();
	}

}
class RandNum{
	
	int numbers[][] = new int[5][5];
	int minimum;
	int maximum;
	double average;
	
	public RandNum() {
		// TODO Auto-generated constructor stub
		
		for(int i =0;i<numbers.length;i++) {
			
			for(int j=0;j<numbers[i].length;j++) {
				Random randomnum = new Random();
					numbers[i][j] = randomnum.nextInt(100)+1;
					System.out.print(numbers[i][j]+"            ");
			}
			System.out.println();
		}
	}
	
	public void calculate() {
		int sum =0;
		int minimum = numbers[0][0];
		int maximum = numbers[0][0];
			for(int i =0;i<numbers.length;i++) {
			
				for(int j=0;j<numbers[i].length;j++) {
				sum = sum+numbers[i][j];
				
				if(numbers[i][j]<minimum) {
					minimum = numbers[i][j];
				}
				
				if(numbers[i][j]>maximum) {
					maximum = numbers[i][j];
				}
				
			}
		}
			this.average = sum /25;
			this.minimum = minimum;
			this.maximum = maximum;
	}
	
	public void display() {
		System.out.println("Minimum: " +this.minimum);
		System.out.println("Maximum: "+this.maximum);
		System.out.println("Average: "+this.average);
	}
}
	