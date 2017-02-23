package com.gmail.yu.omelyanchuk;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	private static void matrixRotate(int degree) {
		if (degree % 90 != 0) {
			return;
		}
		degree = degree - 360 * (degree / 360);
		System.out.println(degree);
		
		int[][] mass = new int[6][6];
		for (int i = 0; i < mass.length; i++) {
			for (int j = 0; j < mass[i].length; j++) {
				mass[i][j] = j + 1;
			}
		}

		int nn = mass.length;
		for (int k = 0; k < degree / 90; k++) {

			for (int i = 0; i < nn / 2; i++) {
				for (int j = i; j < nn - i - 1; j++) {
					int tt = mass[i][j];
					mass[i][j] = mass[nn - j - 1][i];
					mass[nn - j - 1][i] = mass[nn - i - 1][nn - j - 1];
					mass[nn - i - 1][nn - j - 1] = mass[j][nn - i - 1];
					mass[j][nn - i - 1] = tt;
				}

			}
		}

		for (int[] is : mass) {
			System.out.println(Arrays.toString(is));
		}

	}

	private static void vectorRotate(int length){
		int[] mass=new int[length];
		for (int i = 0; i < mass.length; i++) {
			mass[i]=(int)(Math.random()*500);
		}
		System.out.println(Arrays.toString(mass));
		
		for (int i = 0; i < mass.length/2; i++) {
			int tmp=mass[mass.length-i-1];
			mass[mass.length-i-1]=mass[i];
			mass[i]=tmp;			
		}
		System.out.println(Arrays.toString(mass));
	}
	
	private static void money(double digit){
		String t="zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve";
		String[] fromOneToTwelve =t.split("[,]");
		System.out.println(Arrays.toString(fromOneToTwelve));
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		System.out.println("input rotate degree multiple on 90");
//		matrixRotate(sc.nextInt());
//		
//		System.out.println("input arreay length");
//		vectorRotate(sc.nextInt());
		money(10);

	}

}
