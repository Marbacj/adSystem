package com.imooc.ad.dao.unit_condition;

import com.imooc.ad.entity.unit_condition.AdUnitDistrict;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Marbach
 */

//dao 扩展?
public interface AdUnitDistrictRepository
        extends JpaRepository<AdUnitDistrict, Long> {
}
