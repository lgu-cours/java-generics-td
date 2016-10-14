package generics.tp;

public class Cube<T extends Number> {
	
   private T length;
   private T width;
   private T height;
 
   public Cube(T length, T width, T height) {
	      super();
	      this.length = length;
	      this.width = width;
	      this.height = height;
   }

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getWidth() {
		return width;
	}

	public void setWidth(T width) {
		this.width = width;
	}

	public T getHeight() {
		return height;
	}

	public void setHeight(T height) {
		this.height = height;
	}
	   
	public double volume() {
		return length.doubleValue() * width.doubleValue() * height.doubleValue();
	}
	
}
