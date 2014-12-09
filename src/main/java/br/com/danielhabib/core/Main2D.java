package br.com.danielhabib.core;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class Main2D extends JApplet {

	private static final long serialVersionUID = -3688474214568402581L;
	private Psico psico;
	private Environment env;

	public Main2D(Psico psico, Environment env) {
		this.psico = psico;
		this.env = env;
		psico.setObserver(new IPsicoObserver() {
			public void hasChanged() {
				repaint();
			}
		});
	}

	@Override
	public void init() {
		setBackground(Color.WHITE);
	}

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		env.draw(g);
		psico.draw(g);
	}

}
