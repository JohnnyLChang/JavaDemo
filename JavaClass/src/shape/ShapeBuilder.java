package shape;

class ShapeBuilder{
	protected static abstract class ShapeBuilderBase<T extends ShapeBuilderBase<T, S>, S extends ShapeBuilder> {
		private Color color;
        public T setColor(Color c) {
        	this.color = c;
            return (T)this;
        }
        
        public abstract S build();
    }

    protected ShapeBuilder() {}
}
