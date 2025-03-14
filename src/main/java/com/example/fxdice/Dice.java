package com.example.fxdice;
import java.util.Random; //乱数を使うためのパッケージ

public class Dice {
    private int number = 1;
    //コンストラクタ 初期化処理
    public Dice() {
        //初期化処理として、１回サイコロを転がしておくze
        rollDice();
    }
    //サイコロを転がすka
    public void rollDice(){
        Random rand = new Random();
        this.number = rand.nextInt(6) + 1; //1～6
    }
    //１～６までの数値を返すようにするsample1aaaa

    public int getNumber(){
        return this.number;
    }
}
