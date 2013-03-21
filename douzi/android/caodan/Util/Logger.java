/**
 * @author:Xiaoyuan
 * @date : 2011-11-5
 */
package douzi.android.caodan.Util;

import android.util.Log;

/**
 * 
 * @author Xiaoyuan
 *
 */
public class Logger {
	
	/** �������Ϊfalse,��ô����ʾ���е�����Ϣ */
	public static boolean DEBUG = false;
	
	private boolean mDebugThisInstance;
	
	public Logger(boolean isDebug){
		mDebugThisInstance = isDebug;
	}
	
	public void e(String tag,String msg){
		if(DEBUG && mDebugThisInstance){
			Log.e(tag, msg);
		}
	}
	
	public void d(String tag,String msg){
		if(DEBUG && mDebugThisInstance){
			Log.d(tag,msg);
		}
	}
	
	
	
}
