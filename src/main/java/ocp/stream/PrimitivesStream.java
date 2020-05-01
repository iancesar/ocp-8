package ocp.stream;

import java.text.MessageFormat;
import java.util.logging.Logger;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitivesStream
{

	public static void main(String[] args)
	{
		Logger logger = Logger.getLogger(PrimitivesStream.class.getName());

		IntStream intStream = IntStream.of(1, 2, 3, 4);
		logger.info(MessageFormat.format("Resultado {0}", intStream.sum())); //10

		LongStream longStream = LongStream.of(1, 2, 3, 4l);
		logger.info(MessageFormat.format("Resultado {0}", longStream.sum())); //10

		DoubleStream doubleStream = DoubleStream.of(1, 2, 3.5);
		logger.info(MessageFormat.format("Resultado {0}", doubleStream.sum())); //6,5
		
	}

}
