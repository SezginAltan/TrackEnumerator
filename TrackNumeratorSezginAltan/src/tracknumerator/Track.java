/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tracknumerator;

/**
 *
 * @author sezgin.altan
 */
public class Track {

    public Track(int x, int y, int address){
        setX_coordinate(x);
        setY_coordinate(y);
        setAddress(address);
    }
    /**
     * @return the x_coordinate
     */
    protected int getX_coordinate() {
        return x_coordinate;
    }

    /**
     * @param x_coordinate the x_coordinate to set
     */
    protected void setX_coordinate(int x_coordinate) {
        this.x_coordinate = x_coordinate;
    }

    /**
     * @return the y_coordinate
     */
    protected int getY_coordinate() {
        return y_coordinate;
    }

    /**
     * @param y_coordinate the y_coordinate to set
     */
    protected void setY_coordinate(int y_coordinate) {
        this.y_coordinate = y_coordinate;
    }

    /**
     * @return the address
     */
    protected int getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    protected void setAddress(int address) {
        this.address = address;
    }
    private int x_coordinate = 0;
    private int y_coordinate = 0;
    private int address = -1;
}
