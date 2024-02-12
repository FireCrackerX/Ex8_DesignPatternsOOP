// ImageManager class isn't following the Open/Closed Principle. It's not open for extension and closed for modification.
public class ImageManager {
    private Strategy renderer;

	public void setRenderer(Strategy renderer) {
		this.renderer = renderer;
	}

	public void show() {
		this.renderer.showImage();
	}
}