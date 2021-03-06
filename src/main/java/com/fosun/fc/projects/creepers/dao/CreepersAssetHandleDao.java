package com.fosun.fc.projects.creepers.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fosun.fc.projects.creepers.entity.TCreepersAssetHandle;
/**
 * 
 *<p>
 *description:
 *简版征信资产处置信息表
 *</p>
 * @author MaXin
 * @since 2016年5月25日
 * @see
 */
public interface CreepersAssetHandleDao
        extends JpaRepository<TCreepersAssetHandle, Long>, JpaSpecificationExecutor<TCreepersAssetHandle> {

    @Query("select t from TCreepersAssetHandle t where t.rptNo = :rptNo")
    List<TCreepersAssetHandle> queryByRptNo(@Param("rptNo")String rptNo);

}
