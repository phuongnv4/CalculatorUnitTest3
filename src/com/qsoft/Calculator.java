package com.qsoft;

public class Calculator {

	public static int add(String str) {
		String delimiter = "";
		if (str == null) {
			return 0;
		}
		if (str.isEmpty()) {
			return 0;
		}

		String[] strtemp = null;

		if (str.contains("//")) {

			delimiter = str.substring(3, 6);
			System.out.println("delimiter =" + delimiter);
			str = str.replace("//[", "");
			str = str.replace("]\n", "");
			str = str.replace(delimiter, ",");
		} else if (str.contains("\n")) {

			str = str.replace("\n", ",");
		} else {

		}

		strtemp = str.split(",");
		int sum = 0;

		for (int i = 0; i < strtemp.length; i++) {
			String str1 = strtemp[i];
			if (str1.isEmpty()) {
				continue;
			}
			sum += Integer.parseInt(strtemp[i]);
		}

		return sum;
	}

}
