package ca.concordia.ngci.tools4cities.middleware.middleware;

public interface IOperation {
	// TODO Rename for a better name. more in lign with the Observer DP 
	void newDataAvailable(final IProducer<?> aProducer) throws Exception;

	IProducer<?> fetchData() throws Exception;

	void addObserver(IConsumer<?> aConsumer);
}
