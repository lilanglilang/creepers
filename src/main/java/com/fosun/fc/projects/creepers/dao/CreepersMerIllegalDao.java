package com.fosun.fc.projects.creepers.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.fosun.fc.projects.creepers.entity.TCreepersMerIllegal;

/**
*
* <p>
* description:
* T_CREEPERS_MER_ILLEGAL	爬虫信息-严重违法信息
* <p>
* @author MaXin
* @since 2016-07-14 17:38:05
* @see
*/

public interface CreepersMerIllegalDao extends JpaRepository<TCreepersMerIllegal, Long>, JpaSpecificationExecutor<TCreepersMerIllegal> {
}