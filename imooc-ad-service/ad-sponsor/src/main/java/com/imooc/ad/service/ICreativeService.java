package com.imooc.ad.service;

import com.imooc.ad.vo.CreativeRequest;
import com.imooc.ad.vo.CreativeResponse;

/**
 * Created by Marbach
 */
public interface ICreativeService {

    CreativeResponse createCreative(CreativeRequest request);
}
