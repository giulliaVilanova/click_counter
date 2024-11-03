package controller;

import model.Model;
import view.View;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.getButtonCounter().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.incrementCounter();
                view.updateCounter(model.getCounter());
            }
        });

        view.getButtonReset().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.resetCounter();
                view.updateCounter(model.getCounter());
            }
        });
    }
}
