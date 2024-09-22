package com.imooc.ad.dao;

import com.imooc.ad.entity.Creative;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description:
 * 创意表的curd
 *
 */
public interface CreativeRepository extends JpaRepository<Creative, Long> {

}