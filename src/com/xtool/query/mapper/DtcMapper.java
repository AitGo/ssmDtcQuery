package com.xtool.query.mapper;

import com.xtool.query.po.Dtc;
import com.xtool.query.po.DtcExample;
import com.xtool.query.po.DtcWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtcMapper {
    int countByExample(DtcExample example);

    int deleteByExample(DtcExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(DtcWithBLOBs record);

    int insertSelective(DtcWithBLOBs record);

    List<DtcWithBLOBs> selectByExampleWithBLOBs(DtcExample example);

    List<Dtc> selectByExample(DtcExample example);

    DtcWithBLOBs selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") DtcWithBLOBs record, @Param("example") DtcExample example);

    int updateByExampleWithBLOBs(@Param("record") DtcWithBLOBs record, @Param("example") DtcExample example);

    int updateByExample(@Param("record") Dtc record, @Param("example") DtcExample example);

    int updateByPrimaryKeySelective(DtcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(DtcWithBLOBs record);

    int updateByPrimaryKey(Dtc record);
}