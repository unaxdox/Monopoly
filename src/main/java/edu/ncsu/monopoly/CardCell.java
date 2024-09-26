package edu.ncsu.monopoly;
//bla bla
public class CardCell extends Cell {
    private int type;
    
    public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    //a
    public void playAction() {
    }
    
    public int getType() {
        return type;
    }
}
