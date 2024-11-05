package com.javaex.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names;
		int scores[];
		
		names = new String[] {
				"김","이","박","최"
		};
		
		scores = new int[4];
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		
		float heights[] = {
				175.3f,
				170.2f,
				173.4f,
				168.5f
		}; // 선언과 동시에 할 때만 가능
		
		for (int i = 0; i < names.length; ++i) {
			System.out.printf("%s (%.2f) : score=%d%n", names[i], heights[i], scores[i]);
		}
	}

}
