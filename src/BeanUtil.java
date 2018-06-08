

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.com.git.gfets.thread.service.LogReader;
import imix.ConfigError;
import imix.DataDictionary;

public class BeanUtil {
	
	private static final Log logger = LogFactory.getLog(BeanUtil.class);
	
	private static BeanUtil util = new BeanUtil();
	private BeanUtil(){
		
	}
	
	public static  BeanUtil getInstance(){
		if (util==null){
			 util = new BeanUtil();
		}
		return util;
	}
	
	public static String dateToStr(Date dt, String format)
	{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		return sdf.format(dt);
	}
	
	public static Date StrToDate(String dt, String format) throws ParseException
	{
		SimpleDateFormat sdf = new SimpleDateFormat(format);
			
		return sdf.parse(dt);
	}
	
	public static String classpath(){
		
		return BeanUtil.class.getClassLoader().getResource("").getPath();
	}
	
	public  DataDictionary dd;
	
	public synchronized DataDictionary getdataDictionary(){
		if(dd!=null){
			return dd;
		}
		else{
			try {
				dd = new DataDictionary(Thread.currentThread().getContextClassLoader().getResourceAsStream("IMIX10.xml") );
				return dd;
				} catch (ConfigError e) {
				logger.error("DataDictionary异常",e);
			}
		}
		return dd;
	}
}
