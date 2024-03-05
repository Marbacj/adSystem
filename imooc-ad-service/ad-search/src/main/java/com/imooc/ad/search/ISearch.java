package com.imooc.ad.search;

import com.imooc.ad.search.vo.SearchRequest;
import com.imooc.ad.search.vo.SearchResponse;

/**
 * Created by Marbach
 */
public interface ISearch {

    SearchResponse fetchAds(SearchRequest request);
}
