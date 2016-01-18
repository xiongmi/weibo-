package weibo4j.examples.timeline;

import weibo4j.Timeline;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.UserTimelineIds;
import weibo4j.model.WeiboException;

public class GetUserTimelineIds {
	
	public static void main(String[] args) {
		String access_token = args[0];
		String uid = args[1];
		Timeline tm = new Timeline(access_token);
		try {
			UserTimelineIds ids = tm.getUserTimelineIdsByUid(uid);
			Log.logInfo(ids.toString());
		} catch (WeiboException e) {
			e.printStackTrace();
		}
	}
}
