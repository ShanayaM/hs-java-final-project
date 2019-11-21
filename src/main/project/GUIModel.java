/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.List;
import project.GUIInterface;

/**
 *
 *
 */
public class GUIModel{
    protected List model;
    protected GUIInterface view;
    public GUIModel(List model, GUIInterface view){
        this.model = model;
        this.view = view;
    }
}