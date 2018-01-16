package edu.fju.exam;

import java.util.Scanner;

public class VendingMachine {

	public static void main(String[] args) {
		int n = 1;
		int money = 0;
		int a = 10;
		int b = 15;
		int c = 10;
		int d = 18;
		int e = 10;
		int f = 20;
		int g = 15;
		int h = 18;
		System.out.println("販賣機餘額:" + money);
		do {
			System.out.print("請投幣或選擇飲料(a,b,c,d,e,f,g,h),或按0結束:");
			Scanner s = new Scanner(System.in);
			String p = s.nextLine();
			switch (p) {
			case "1":
				money = money + 1;
				System.out.println("販賣機餘額:" + money);
				break;
			case "5":
				money = money + 5;
				System.out.println("販賣機餘額:" + money);
				break;
			case "10":
				money = money + 10;
				System.out.println("販賣機餘額:" + money);
				break;
			case "a":
				if (money - a >= 0) {
					money = money - a;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + money);
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + money);
				}
				break;
			case "b":
				if (money - b >= 0) {
					money = money - b;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + money);
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + money);
				}
				break;
			case "c":
				if (money - c >= 0) {
					money = money - c;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + money);

				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + money);
				}
				break;
			case "d":
				if (money - d >= 0) {
					money = money - d;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + money);

				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + money);
				}
				break;
			case "e":
				if (money - e >= 0) {
					money = money - e;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + money);

				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + money);
				}
				break;
			case "f":
				if (money - f >= 0) {
					money = money - f;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + money);

				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + money);
				}
				break;
			case "g":
				if (money - g >= 0) {
					money = money - g;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + money);

				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + money);
				}
				break;
			case "h":
				if (money - h >= 0) {
					money = money - h;
					System.out.println("DON!");
					System.out.println("販賣機餘額:" + money);
				} else {
					System.out.println("BEEP!");
					System.out.println("販賣機餘額:" + money);
				}
				break;
			case "0":
				n = -1;
				break;
			}
		} while (n > 0);

	}

}
