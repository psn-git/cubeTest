package ch.nuedling.basics;

public  class DistanceCalculator {
	public static Integer calculateAbsoluteDifference( Integer value1, Integer value2){
		if ((value1 >= 0) && (value2 >= 0)){
			if (value1 > value2) {
				return Math.abs(value1)
						- Math.abs(value2);
			}else{
				return Math.abs(value2)
						- Math.abs(value1);				
			}
		}else if ((value1 < 0) && (value2 < 0)) {
			if (value1 > value2) {
				return Math.abs(value2)
						- Math.abs(value1);
			}else{
				return Math.abs(value1)
						- Math.abs(value2);				
			}
		} else {
			return Math.abs(value1)
					+ Math.abs(value2);
		}
		/*
		  		if (((value1 >= 0) && (value2 >= 0))
				|| ((value1 < 0) && (value2 < 0))) {
			if (value1 > value2) {

				return Math.abs(value1)
						- Math.abs(value2);
			} else {
				return Math.abs(value2)
						- Math.abs(value1);
			}
		} else {
			return Math.abs(value1)
					+ Math.abs(value2);
		}*/
		 
	}

}
