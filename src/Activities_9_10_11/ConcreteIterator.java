package Activities_9_10_11;

public class ConcreteIterator implements Iterator{
    private ConcreteAggregator aggregated;
    private int counter = 0;

    private ConcreteIterator() {
    }

    public ConcreteIterator(ConcreteAggregator aggregated)
    {
        this.aggregated = aggregated;
    }

    @Override
    public Object first()
    {
        Object obj = null;
        if(!this.aggregated.data.isEmpty())
        {
            this.counter = 0;
            obj = this.aggregated.data.firstElement();
        }
        return obj;
    }

    @Override
    public Object next()
    {
        Object obj = null;
        if( (this.counter) < this.aggregated.data.size() )
        {
            obj = this.aggregated.data.elementAt(this.counter);
            this.counter = this.counter + 1;
        }
        return obj;
    }

    @Override
    public boolean thereIsMore()
    {
        return this.counter < (this.aggregated.data.size());
    }

    @Override
    public Object current()
    {
        Object obj = null;
        if( this.counter < this.aggregated.data.size() )
        {
            obj = this.aggregated.data.elementAt( this.counter);
        }
        return obj;
    }
}
