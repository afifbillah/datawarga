/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oraclejava;

import view.TransaksiView;
import java.sql.SQLException;
/**
 *
 * @author afif
 */
public class oraclejava {
    public static void main(String[] args) throws SQLException {
        new TransaksiView().show();
}
}
