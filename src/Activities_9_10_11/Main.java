package Activities_9_10_11;

public class Main {
    public static void main(String[] args) {

        try
        {
            // Here we create an object called aggregated which contains a vector.
            ConcreteAggregator aggregated = new ConcreteAggregator();

            // Here we create an object called iterator to go through the vector.
            Iterator iterator = aggregated.getIterator();

            // Here we go to the first position and its is showed.
            String obj = (String) iterator.first();
            System.out.println( obj );

            // Here we go two positions ahead.
            iterator.next();
            iterator.next();

            // Here the current element is showed.
            System.out.println( (String)iterator.current() + "\n" );

            // Here we go back to the first element.
            iterator.first();

            // Here we use a while loop to print all the elements in the vector.
            while(iterator.thereIsMore()) {
                System.out.println( iterator.next() );
            }
        }
        catch( Exception e )
        {
            e.printStackTrace();
        }
    }
}
