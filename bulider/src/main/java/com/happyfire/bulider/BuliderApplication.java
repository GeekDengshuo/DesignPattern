package com.happyfire.bulider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuliderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuliderApplication.class, args);


		MyStringBuilder msb = new MyStringBuilder();
		final int count = 26;

		for (int i = 0; i <count ; i++) {
			msb.append((char)('a'+i));
		}
		System.out.println(msb.toString());
	}

}
