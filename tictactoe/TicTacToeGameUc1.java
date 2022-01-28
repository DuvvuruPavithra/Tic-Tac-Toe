package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGameUc1 {

	public static char[] displayBoard() {
		char[] board1 =new char[9];
		System.out.println("Welcome to tic, tac, toe!\n");
		for (int i=0;i<9;i++) {
			board1[i]=' ' ;
		}
		return board1;	

	}


	public static void main(String[] args) {
		char[] board1 =displayBoard();



	}
}

