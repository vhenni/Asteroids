package asteroids;
 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author henni
 */
import javafx.scene.shape.Polygon;
 
public class Alus extends Hahmo {
 
    public Alus(int x, int y) {
        super(new Polygon(-5, -5, 10, 0, -5, 5), x, y);
    }
}
 