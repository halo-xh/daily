package DesignPattern.FlyweightPattern.example;

/**
 * Created by Xiao Hong on 2020-07-24
 */
public class ChesspieceFactory {
    
    private static final Chesspiece WHITE = new ChesspieceFlyweight("white");
    private static final Chesspiece BLACK = new ChesspieceFlyweight("black");
    
    public static Chesspiece getChesspiece(String color){
        if (color.equalsIgnoreCase("white")){
            return WHITE;
        }else if (color.equalsIgnoreCase("black")){
            return BLACK;
        }
        return null;
    }
}
