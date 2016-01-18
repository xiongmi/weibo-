package weibo4j;

import weibo4j.http.HttpClient;

public class Weibo implements java.io.Serializable {

	private static final long serialVersionUID = 4282616848978535016L;

	public static HttpClient client = new HttpClient();

//	濡傛灉甯屾湜鑷繁璁剧疆HttpClient鐨勫悇绉嶅弬鏁帮紝鍙互浣跨敤涓嬮潰鐨勬瀯閫犳柟娉�//	protected static HttpClient client = new HttpClient(int maxConPerHost, int conTimeOutMs, int soTimeOutMs,
//			int maxSize);
	
	protected String access_token;

}