package DesignPattern.FlyweightPattern.example;

/**
 * Created by Xiao Hong on 2020-07-24
 */
public class MainClass {
    
    public static void main(String[] args) {
        final String WHITE = "white";
        final String BLACK = "black";
        Chesspiece p1 = ChesspieceFactory.getChesspiece(WHITE);
        assert p1 != null;
        p1.put(1,1);
        Chesspiece p2 = ChesspieceFactory.getChesspiece(BLACK);
        p2.put(1,2);
    }
}
