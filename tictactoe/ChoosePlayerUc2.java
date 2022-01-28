package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class ChoosePlayerUc2 {

	public static char[] displayBoard() {
		char[] board1 =new char[9];
		System.out.println("Welcome to tic, tac, toe!\n");
		for (int i=0;i<9;i++) {
			board1[i]=' ' ;
		}
		return board1;	

	}

	public static void isPlayerPlays() {

		char player = 0;
		char computer = ' ';
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Player value or Computer value ");
		char value = sc.next().charAt(0);


		if (computer == 'X' || computer == 'x') {
			player = '0';
		}
		else if (player == '0') {
			computer = 'x';

		}
		else {
			System.out.println("Please enter the values  only X or O");
			System.out.println("Then the  value is "+value);
		}
	}


	public static void main(String[] args) {

		displayBoard();
		isPlayerPlays();


	}

}
