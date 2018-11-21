package com.warcraft.commonexception;
/**
 * 自定义异常(不是必须的)
 * 1)更加友好的描述问题
 * 2)更加精确的定位问题
 */
public class ServiceException 
             extends RuntimeException {
	private static final long serialVersionUID = 8029523183323748146L;

	public ServiceException() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	public ServiceException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	public ServiceException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public ServiceException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	
}
