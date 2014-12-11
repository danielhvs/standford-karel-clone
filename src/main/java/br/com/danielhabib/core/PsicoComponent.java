package br.com.danielhabib.core;

import java.awt.Graphics;

public abstract class PsicoComponent {
	protected Position position;

	public Position getPosition(){
		return position;
	}

	public PsicoComponent(Position position) {
		this.position = position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	abstract void draw(Graphics g);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		PsicoComponent other = (PsicoComponent) obj;
		if (position == null) {
			if (other.position != null) {
				return false;
			}
		} else if (!position.equals(other.position)) {
			return false;
		}
		return true;
	}

}