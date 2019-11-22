/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import CS2114.Shape;

/**
 * package default interface used by View.addGlyph method so we can
 * add Glyph and Legend in a similar fashion
 *
 *
 */
interface GUIMiniGraph {
    Shape[] getGlyph();
}
