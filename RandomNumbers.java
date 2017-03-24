public class RandomNumbers{
	public static void main(String[] args) {
		int a, b, c, d;
		double r, rps;
		int y, z;

		// rps = Math.random();
		// if(rps<0.333){
		// 	System.out.println("ROCK");
		// }else if( rps < 0.666){
		// 	System.out.println("PAPER");
		// }else{
		// 	System.out.println("SCISSORS");
		// }

		a = 1+(int) (10*Math.random());
		b = 1+(int) (10*Math.random());
		c = 1+(int) (10*Math.random());
		d = 1+(int) (10*Math.random());
		// System.out.println("1-10: \t"+a+"\t"+b+"\t"+c+"\t"+d);

		a = 1+(int) (6*Math.random());
		b = 1+(int) (6*Math.random());
		c = 1+(int) (6*Math.random());
		d = 1+(int) (6*Math.random());
		// System.out.println("1-6: \t"+a+"\t"+b+"\t"+c+"\t"+d);

		a = 1+(int) (100*Math.random());
		// System.out.println("1-100: \t"+a+"\t"+a+"\t"+a+"\t"+a);

		//Study drills
		y = 1+(int) (3*Math.random());			//1-3 including 3
		System.out.println("1-3, including 3:\t" + y);
		y = (int) (3*Math.random());			//1-3 NOT including 3
		System.out.println("1-3, NOT including 3:\t" + y);
		z = 5+(int) (6*Math.random());			//5-10 including 10
		System.out.println("5-10, including 10:\t" + z);
	}
}