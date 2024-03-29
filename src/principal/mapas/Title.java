package principal.mapas;

import java.awt.Rectangle;

import principal.sprites.Sprite;

public class Title {
	
	//Variables
	
	private final Sprite sprite;
	private final int id;
	private boolean solido;
	
	//Contructores
	
	public Title(final Sprite sprite, final int id) {
		this.sprite = sprite;
		this.id = id;
		solido = false;
	}
	
	public Title(final Sprite sprite, final int id, final boolean solido) {
		this.sprite = sprite;
		this.id = id;
		this.solido = solido;
	}
	
	//Funciones
	
	public Sprite getSprite(){
		return sprite;
	}
	public int getId() {
		return id;
	}
	public void setSolido(final boolean solido) {
		this.solido = solido;
	}
	public Rectangle getLimites(final int x, final int y) {
		return new Rectangle(x, y, sprite.getAncho(), sprite.getAlto());
	}
}
