package ar.edu.unlp.info.oo1.Ejercicio1;

public class WallPost {
	private String text;
	private int likes;
	private boolean featured;
	/*
	* Permite construir una instancia del WallPost.
	* Luego de la invocación, debe tener como texto: “Undefined post”,
	* no debe estar marcado como destacado y la cantidad de “Me gusta” debe ser 0.
	*/
	public WallPost() {
		this.text="Undefined post";
		this.likes=0;
		this.featured=false;
	}

	/*
	* Retorna el texto descriptivo de la publicación
	*/
	public String getText() {
		return this.text;
	}

	/*
	* Asigna el texto descriptivo de la publicación
	*/
	public void setText (String descriptionText) {
		this.text=descriptionText;
	}

	/*
	* Retorna la cantidad de “me gusta”
	*/
	public int getLikes() {
		return this.likes;
	}

	/*
	 * Incrementa la cantidad de likes en uno.
	*/
	public void like() {
		this.likes++;
	}

	/*
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada.
	*/
	public void dislike() {
		if(this.likes!=0)
			this.likes--;
	}

	/*
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	*/
	public boolean isFeatured() {
		return this.featured;
	}

	/*
	 * Cambia el post del estado destacado a no destacado y viceversa.
	*/
	public void toggleFeatured() {
		if(this.featured)
			this.featured=false;
		else
			this.featured=true;
	}


}
