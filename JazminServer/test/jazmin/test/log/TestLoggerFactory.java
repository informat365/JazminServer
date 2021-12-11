/**
 * 
 */
package jazmin.test.log;

import jazmin.log.Logger;
import jazmin.log.LoggerFactory;

/**
 * @author yama
 * 25 Jan, 2016
 */
public class TestLoggerFactory {
	//
	private static Logger logger=LoggerFactory.get(TestLoggerFactory.class);
	//
	
	public static void main(String[] args) throws Exception{
		LoggerFactory.setLevel("DEBUG");
		LoggerFactory.setFile("/tmp/test.log", true);
	
		//
		logger.debug("11111");
		logger.info("22222");
		logger.error("33333");
	}

}
