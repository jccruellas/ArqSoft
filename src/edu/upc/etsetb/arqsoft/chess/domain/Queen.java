/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upc.etsetb.arqsoft.chess.domain;

import static java.lang.Math.abs;

/**
 *
 * @author JuanCarlos
 */
public class Queen {

    public void isPiceMovement(int f1, int c1, int f2, int c2) throws NoPieceMoveException {

        if (!(f1 == f2 || c1 == c2 || (abs(f1 - f2) == abs(c1 - c2)))) {
            // Movimiento incorrecto
            throw new NoPieceMoveException("Not a valid movement for the Queen");
        }
    }
}
