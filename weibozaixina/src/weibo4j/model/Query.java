/*
Copyright (c) 2007-2009
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions are met:
    * Redistributions of source code must retain the above copyright
      notice, this list of conditions and the following disclaimer.
    * Redistributions in binary form must reproduce the above copyright
      notice, this list of conditions and the following disclaimer in the
      documentation and/or other materials provided with the distribution.
    * Neither the name of the Yusuke Yamamoto nor the
      names of its contributors may be used to endorse or promote products
      derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY Yusuke Yamamoto ``AS IS'' AND ANY
EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
DISCLAIMED. IN NO EVENT SHALL Yusuke Yamamoto BE LIABLE FOR ANY
DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
(INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
(INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package weibo4j.model;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 鎼滅储鏉′欢
 * @author SinaWeibo
 *
 */
public class Query {
    private String q; //鎼滅储鐨勫叧閿瓧銆�
    private Boolean snick=null;//鎼滅储鑼冨洿鏄惁鍖呭惈鏄电О
    private int rpp=20;
    private Boolean sdomain=null;//鎼滅储鑼冨洿鏄惁鍖呭惈涓�鍩熷悕
    private Boolean sintro=null;//鎼滅储鑼冨洿鏄惁鍖呭惈绠�粙
    private Integer province=null;//鐪佷唤ID锛屽弬鑰冪渷浠藉煄甯傜紪鐮佽〃
    private Integer city	=null;//鍩庡競ID锛屽弬鑰冪渷浠藉煄甯傜紪鐮佽〃
    private Gender gender=null;//鎬у埆
    private String comorsch=null;
    private int sort=1;//鎺掑簭鏂瑰紡锛�涓烘寜鏇存柊鏃堕棿锛�涓烘寜绮変笣鏁般�
    private Integer page=null;
    private Integer count=null;//榛樿姣忛〉10鏉�
    private boolean base_app=true;//鏄惁涓嶅熀浜庡綋鍓嶅簲鐢ㄦ潵鑾峰彇鏁版嵁
    private int filter_ori=0;//杩囨护鍣紝鏄惁涓哄師鍒涳紝0涓哄叏閮紝5涓哄師鍒涳紝4涓鸿浆鍙戙�榛樿涓�銆�   
    private int filter_pic;//杩囨护鍣ㄣ�鏄惁鍖呭惈鍥剧墖銆�涓哄叏閮紝1涓哄寘鍚紝2涓轰笉鍖呭惈銆�   
    private long fuid;//寰崥浣滆�鐨勭敤鎴稩D銆� 
    private Date starttime;//寮�鏃堕棿锛孶nix鏃堕棿鎴�    
    private Date endtime;//缁撴潫鏃堕棿锛孶nix鏃堕棿鎴�    
    private boolean needcount=false;//杩斿洖缁撴灉涓槸鍚﹀寘鍚繑鍥炶褰曟暟銆倀rue鍒欒繑鍥炴悳绱㈢粨鏋滆褰曟暟銆�   
    private String geocode=null;//杩斿洖鎸囧畾缁忕含搴﹂檮杩戠殑淇℃伅銆傜粡绾害鍙傛暟鏍煎紡鏄�绾害锛岀粡搴︼紝鍗婂緞鈥濓紝鍗婂緞鏀寔km锛堝叕閲岋級锛宮锛堢背锛夛紝mi锛堣嫳閲岋級銆傛牸寮忛渶瑕乁RL Encode缂栫爜
    
    public void setQ(String q) {
		this.q = q;
//		if(!URLEncodeUtils.isURLEncoded(q))
//		q=URLEncodeUtils.encodeURL(q);
	}
    
	public String getQ() {
		return q;
	}
	
	public Boolean getSnick() {
		return snick;
	}
	
	public void setSnick(Boolean snick) {
		this.snick = snick;
	}
	
	public int getRpp() {
		return rpp;
	}
	
	public void setRpp(int rpp) {
		this.rpp = rpp;
	}
	
	public Boolean getSdomain() {
		return sdomain;
	}
	
	public void setSdomain(Boolean sdomain) {
		this.sdomain = sdomain;
	}
	
	public Boolean getSintro() {
		return sintro;
	}
	
	public void setSintro(Boolean sintro) {
		this.sintro = sintro;
	}
	
	public Integer getProvince() {
		return province;
	}
	
	public void setProvince(Integer province) {
		this.province = province;
	}
	
	public Integer getCity() {
		return city;
	}
	
	public void setCity(Integer city) {
		this.city = city;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public String getComorsch() {
		return comorsch;
	}
	
	public void setComorsch(String comorsch) {
		this.comorsch = comorsch;
	}
	
	public int getSort() {
		return sort;
	}
	
	public void setSort(int sort) {
		this.sort = sort;
	}
	
	public Integer getPage() {
		return page;
	}
	
	public void setPage(Integer page) {
		this.page = page;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
	
	public boolean getBase_app() {
		return base_app;
	}
	
	public void setBase_app(boolean baseApp) {
		base_app = baseApp;
	}
	
	public int getFilter_ori() {
		return filter_ori;
	}
	
	public void setFilter_ori(int filterOri) {
		filter_ori = filterOri;
	}
	
	public int getFilter_pic() {
		return filter_pic;
	}
	
	public void setFilter_pic(int filterPic) {
		filter_pic = filterPic;
	}
	
	public long getFuid() {
		return fuid;
	}
	
	public void setFuid(Integer fuid) {
		this.fuid = fuid;
	}
	
	public Date getStarttime() {
		return starttime;
	}
	
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	
	public Date getEndtime() {
		return endtime;
	}
	
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	
	public boolean getNeedcount() {
		return needcount;
	}
	
	public void setNeedcount(boolean needcount) {
		this.needcount = needcount;
	}
	
	public String getGeocode() {
		return geocode;
	}
	public void setGeocode(String geocode) {
		this.geocode = geocode;
	}
	public PostParameter[] getParameters() throws WeiboException{
		List<PostParameter> list= new ArrayList<PostParameter>();
		Class<Query> clz=Query.class;
		Field[] fields=clz.getDeclaredFields();
		for (Field field : fields) {
			field.setAccessible(true);
			String fieldName=field.getName();
			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			String getMethodName = "get" + firstLetter+ fieldName.substring(1); 
			Method getMethod;
			try {
				getMethod = clz.getMethod(getMethodName, new Class[] {});
				Object value = getMethod.invoke(this, new Object[] {}); 
				if(value!=null){
					list.add(getParameterValue(fieldName, value));
				}
			} catch (Exception e) {
				throw new WeiboException(e);
			}
		}
		return list.toArray(new PostParameter[list.size()]);
		
	}
	private PostParameter getParameterValue(String name,Object value){
		if(value instanceof Boolean){
			return new PostParameter(name, (Boolean)value?"0":"1");
		}else if(value instanceof String){
			return new PostParameter(name, value.toString());
		}else if(value instanceof Integer){
			return new PostParameter(name,Integer.toString((Integer)value));
		}else if(value instanceof Long){
			return new PostParameter(name,Long.toString((Long)value));
		}else if(value instanceof Gender) {
			return new PostParameter(name,Gender.valueOf((Gender)value));
		}
		return null;
	}
	
}


