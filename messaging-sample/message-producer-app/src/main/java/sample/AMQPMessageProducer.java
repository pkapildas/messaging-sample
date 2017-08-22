package sample;

import java.util.Calendar;

import sample.domain.TradeRequest;
import sample.domain.TradeRequestDao;
import sample.gateway.StockServiceGateway;


public class AMQPMessageProducer {

	private StockServiceGateway stockServiceGateway;

	public void persistAndSendMessage(TradeRequest tradeRequest) throws Exception {
		tradeRequest.setTicker("AMQP@" + Calendar.getInstance().getTime().toString());
		tradeRequest.setDescription("BEFORE-SENDING");
		(new TradeRequestDao()).save(tradeRequest);
		stockServiceGateway.send(tradeRequest);
	}

	public void setStockServiceGateway(StockServiceGateway stockServiceGateway) {
		this.stockServiceGateway = stockServiceGateway;
	}


}
