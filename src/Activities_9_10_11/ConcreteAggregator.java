package Activities_9_10_11;

import java.util.Vector;

public class ConcreteAggregator implements Aggregator{
    protected Vector data = new Vector();

    public ConcreteAggregator() {
        this.fill();
    }

    @Override
    public Iterator getIterator()
    {
        return new ConcreteIterator( this );
    }

    public void fill()
    {
        this.data.add( new String("Nacho") );
        this.data.add( new String("Laura") );
        this.data.add( new String("Juan Ramón") );
        this.data.add( new String("Josefina") );
    }
}
