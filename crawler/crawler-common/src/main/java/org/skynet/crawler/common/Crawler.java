package org.skynet.crawler.common;

import java.util.Map;

/**
 * Created by Shoper on 2017/3/19.
 * 爬取接口....
 */
public interface Crawler {
    /**
     * 列表抓取,传入列表页url
     * @param url
     */
    Map<String,Object> crawlerList(String url,Object... obj);

    /**
     * 单数据抓取
     * @param url
     */
    Map<String,Object> crawler(String url,Object... obj);
}
