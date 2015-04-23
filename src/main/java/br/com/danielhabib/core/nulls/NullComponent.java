package br.com.danielhabib.core.nulls;


import br.com.danielhabib.core.component.Position;
import br.com.danielhabib.core.component.Component;
import br.com.danielhabib.core.gui.Graphics;

public class NullComponent extends Component {

	public NullComponent() {
		super(new Position(-1, -1), -1);
	}

	@Override
	public void draw(Graphics g) {
	}

	@Override
	public void setPosition(Position position) {
	}

	@Override
	public void setSize(int size) {
	}

}
