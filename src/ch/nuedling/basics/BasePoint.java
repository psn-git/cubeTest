package ch.nuedling.basics;

public class BasePoint {
	private Integer x;
	private Integer y;
	private Integer z;

	public BasePoint(Integer x, Integer y, Integer z) {
		this.x = x;
		this.y = y;
		this.z = z;

	}

	public Integer getX() {
		return x;
	}


	public Integer getY() {
		return y;
	}


	public Integer getZ() {
		return z;
	}
	public boolean equals(BasePoint basePoint){
		return (this.x == basePoint.getX() && this.y == basePoint.getY() && this.z == basePoint.getZ());
	}
}