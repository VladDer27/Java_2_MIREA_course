package ru.mirea.lab7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class TestDequeue {
    public static void dequeueGame(String[] firstPlayer, String[] secondPlayer){
        Deque<Integer> firstPlayerDeck = new ArrayDeque<>();
        Deque<Integer> secondPlayerDeck = new ArrayDeque<>();

        for(int i = 0; i < firstPlayer.length; i++){                  // Заполняем основные стеки
            firstPlayerDeck.addLast(Integer.valueOf(firstPlayer[i]));
        }

        for(int i = 0; i < secondPlayer.length; i++){
            secondPlayerDeck.addLast(Integer.valueOf(secondPlayer[i]));
        }

        int firstPlayerCard;
        int secondPlayerCard;
        for(int move = 1; move <= 106; move++){
            firstPlayerCard = firstPlayerDeck.pop();
            secondPlayerCard = secondPlayerDeck.pop();

            if(((firstPlayerCard > secondPlayerCard) || (firstPlayerCard == 0 && secondPlayerCard == 9)) && !(firstPlayerCard == 9 && secondPlayerCard == 0)){
                firstPlayerDeck.addLast(firstPlayerCard);
                firstPlayerDeck.addLast(secondPlayerCard);
            }
            else if(firstPlayerCard == secondPlayerCard){
                firstPlayerDeck.addLast(firstPlayerCard);
                secondPlayerDeck.addLast(secondPlayerCard);
            }
            else{
                secondPlayerDeck.addLast(secondPlayerCard);
                secondPlayerDeck.addLast(firstPlayerCard);
            }

            if (firstPlayerDeck.size() == 0) {
                System.out.println("second" + " " + String.valueOf(move));
                return;
            }

            if (secondPlayerDeck.size() == 0) {
                System.out.println("first" + " " + String.valueOf(move));
                return;
            }
        }
        System.out.println("botva");
    }
    public static void exec(){
        Scanner scanner = new Scanner(System.in);
        String[] firstPlayer = scanner.nextLine().split(" ");
        String[] secondPlayer = scanner.nextLine().split(" ");
        scanner.close();

        dequeueGame(firstPlayer, secondPlayer);
    }
}
