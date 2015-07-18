package ch.nuedling.util;

import java.util.Random;

public class RandomGenerator {
	private Random generator;
	private Integer minValue = 0;
	private Integer maxValue = 0;

	public RandomGenerator(Integer maxValue, Integer minValue) {
		this.minValue = minValue;
		this.maxValue = maxValue;
		generator = new Random();
	}

	public Integer getInteger() {
		Integer value = minValue + generator.nextInt(maxValue * 2) + 1;
		
		return value;
	}
}
