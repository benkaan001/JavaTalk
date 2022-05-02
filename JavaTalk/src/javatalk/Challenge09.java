package javatalk;

public class Challenge09 {
	
	public void calculateDistance(double latitude[], double longitude[]) {
		double latitudeVal1 = latitude[0];
		double latitudeVal2 = latitude[1];
		double longitudeVal1 = longitude[0];
		double longitudeVal2= longitude[1];
		
		double r = 6371.01;
		double distance = r * Math.acos( Math.sin(latitudeVal1) * Math.sin(latitudeVal2) + Math.cos(latitudeVal1)*Math.cos(latitudeVal2) * Math.cos(longitudeVal1 - longitudeVal2));
	    System.out.println(distance);

		
	}

}
