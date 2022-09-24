package ru.mirea.lab7;

import java.util.Scanner;
import java.util.Stack;

public class TestStack {

    public static Stack<Integer> reverse(Stack<Integer> Stack){
        Stack<Integer> tempStack = new Stack<Integer>();
        while(!Stack.empty()) {
            tempStack.push(Stack.pop());
        }
        return tempStack;
    }

    public static void stackGame(String[] firstPlayer, String[] secondPlayer){

        Stack<Integer> firstPlayerDeck = new Stack<Integer>();
        Stack<Integer> secondPlayerDeck = new Stack<Integer>();

        Stack<Integer> firstExtraDeck = new Stack<Integer>();
        Stack<Integer> secondExtraDeck = new Stack<Integer>();

        for(int i = firstPlayer.length - 1; i >= 0; i--){                  // Заполняем основные стеки
            firstPlayerDeck.push(Integer.valueOf(firstPlayer[i]));
        }

        for(int i = secondPlayer.length - 1; i >= 0; i--){
            secondPlayerDeck.push(Integer.valueOf(secondPlayer[i]));
        }

        int firstPlayerCard;
        int secondPlayerCard;
        for(int move = 1; move <= 106; move++){
            firstPlayerCard = firstPlayerDeck.pop();
            secondPlayerCard = secondPlayerDeck.pop();

            if(((firstPlayerCard > secondPlayerCard) || (firstPlayerCard == 0 && secondPlayerCard == 9)) && !(firstPlayerCard == 9 && secondPlayerCard == 0)){
                firstExtraDeck.push(firstPlayerCard);
                firstExtraDeck.push(secondPlayerCard);
            }
            else if(firstPlayerCard == secondPlayerCard){
                firstExtraDeck.push(firstPlayerCard);
                secondExtraDeck.push(secondPlayerCard);
            }
            else{
                secondExtraDeck.push(secondPlayerCard);
                secondExtraDeck.push(firstPlayerCard);
            }

            if (firstPlayerDeck.size() == 0) {
                if (firstExtraDeck.size() != 0) {
                    firstPlayerDeck = reverse(firstExtraDeck);
                    firstExtraDeck.clear();
                } else {
                    System.out.println("second" + " " + String.valueOf(move));
                    return;
                }
            }

            if (secondPlayerDeck.size() == 0) {
                if (secondExtraDeck.size() != 0) {
                    secondPlayerDeck = reverse(secondExtraDeck);
                    secondExtraDeck.clear();
                } else {
                    System.out.println("first" + " " + String.valueOf(move));
                    return;
                }
            }
        }
        System.out.println("botva");
    }

    public static void exec(){
        Scanner scanner = new Scanner(System.in);
        String[] firstPlayer = scanner.nextLine().split(" ");
        String[] secondPlayer = scanner.nextLine().split(" ");
        scanner.close();

        stackGame(firstPlayer, secondPlayer);
    }
}
