package abstractFactory;
	
abstract public class AbstractFactory 
{
	    String name;
	    String dough;
	    String sauce;

	    public String getName() {
	        return name;
	    }

	    public void prepare() {
	        System.out.println("Preparing " + name);
	    }

	    public void bake() {
	        System.out.println("Baking " + name);
	    }

	    public void cut() {
	        System.out.println("Cutting " + name);
	    }

	    public void box() {
	        System.out.println("Boxing " + name);
	    }

	    public String toString() {
	        StringBuffer display = new StringBuffer();
	        display.append("---- " + name + " ----\n");
	        display.append(dough + "\n");
	        display.append(sauce + "\n");
	        return display.toString();
	    }
	}
	


