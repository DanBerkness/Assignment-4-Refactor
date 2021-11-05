package com.userloginapplication;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileOutput {
	public static void writeFile(User[] users) throws IOException {
		BufferedWriter writer = null;
		UserService userService1 = new UserService();

		try {
			writer = new BufferedWriter(new FileWriter(FileInterface.standardFileName));

			for (User user : users) {

				writer.write(userService1.getCurrentUser(user));
				if (user.getRole().equals("super_user")) {
//					Arrays.sort(users);
//					System.out.println(user);
//					System.out.println("--------");
//					user.compareTo(user);
//					System.out.println(user);
				} else {
//				Arrays.sort(users);
//				System.out.println(user);
//				user.compareTo(user);
//				System.out.println(user);
				}
			}
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
	}
}
