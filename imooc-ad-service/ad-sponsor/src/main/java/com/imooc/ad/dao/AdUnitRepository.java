package com.imooc.ad.dao;

import com.imooc.ad.entity.AdUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Description:
 *
 */
public interface AdUnitRepository extends JpaRepository<AdUnit, Long> {


    AdUnit findByPlanIdAndUnitName(Long planId, String unitName);


    // 根据推广单元的状态查询多个推广单元
    List<AdUnit> findAllByUnitStatus(Integer unitStatus);
}
