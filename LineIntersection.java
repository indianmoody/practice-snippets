// intersection of two lines given by two points each

public class LineIntersection {
	
	public static float[] solveEquation(float p1, float p2, float p3, float p4, float q1, float q2, float q3, float q4) {
		float m1, m2;
		
		if (p1 == p3){
			m1 = 1000000;
		}
		else {
			m1 = (p4 - p2)/(p3 - p1);
		}
		
		if (q1 == q3) {
			m2 = 1000000;
		}
		else {
			m2 = (q4  - q2)/(q3 - q1);
		}
		
		if (m1 == m2) {
			return new float[] {-999, -999};
		}
		
		float x = q2 - p2 - ((m2*q1 - m1*p1)/(m1-m2));
		
		float y = p2 + m1 * (x - p1);
		
		return new float[] {x, y};
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr = solveEquation(2, 1, 8, 6, 3, 4, 6, 2);
		
		System.out.printf("point of intersection: (%f, %f)\n", arr[0], arr[1]);

	}

}
