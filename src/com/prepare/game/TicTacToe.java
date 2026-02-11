package com.prepare.game;

import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[][] board = new char[3][3];
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				board[row][col] = ' ';
			}
		}
		
		char player = 'X';
		boolean gameOver = false;
		
		Scanner scanner = new Scanner(System.in);
		
		while(!gameOver) {
			printBoard(board);
			System.out.println("Player " + player + ", enter your move (row and column): ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			
			if(board[row][col] == ' ') {
				board[row][col] = player;
				
				if(checkWin(board, player)) {
					printBoard(board);
					System.out.println("Player " + player + " wins!");
					gameOver = true;
				} else if(checkDraw(board)) {
					printBoard(board);
					System.out.println("It's a draw!");
					gameOver = true;
				} else {
					player = (player == 'X') ? 'O' : 'X';
				}
			} else {
				System.out.println("Cell already occupied. Try again.");
			}
		}
		
		
		

	}

	private static boolean checkDraw(char[][] board) {
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				if(board[row][col] == ' ') {
					return false;
				}
			}
		}
		
		return true;
	}

	private static boolean checkWin(char[][] board, char player) {
		
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;
			}
			if(board[0][i] == player && board[1][i] == player && board[2][i] == player) {
				return true;
			}
		}
		
		if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}
		
		if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		}
		
		return false;
	}

	private static void printBoard(char[][] board) {
		// TODO Auto-generated method stub
		
		for(int row = 0; row < board.length; row++) {
			for(int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col]);
				if(col < board[row].length - 1) {
					System.out.print("|");
				}
			}
			System.out.println();
			if(row < board.length - 1) {
				System.out.println("-----");
			}
		}
		
	}

}
