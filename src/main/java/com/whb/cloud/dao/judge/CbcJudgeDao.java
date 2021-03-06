package com.whb.cloud.dao.judge;

import com.whb.cloud.entity.judge.CbcJudgeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-03-09 10:07:22
 */
@Mapper
public interface CbcJudgeDao extends BaseMapper<CbcJudgeEntity> {

    /**
     * @Author: cshnefu
     * @Description: 列表分页查询
     * @Date: 19:26 2021/5/18
     * @Param: [startRow, pageSize, store_id]
     * @return: java.util.List<java.util.Map<java.lang.String,java.lang.String>>
     **/
    List<Map<String,String>> getStoreJudgeById(Integer startRow, Integer pageSize, Integer store_id);

    /**
     * @Author: cshnefu
     * @Description: 寄存点评价总数
     * @Date: 19:29 2021/5/18
     * @Param: [store_id]
     * @return: int
     **/
    int countStoreJudge(Integer store_id);

    /**
     * @Author: cshnefu
     * @Description:  查找当前订单评价状态
     * @Date: 15:32 2021/4/14
     * @Param: [order_id]
     * @return: int
     **/
    int getJudgeStateById(Integer order_id);

    /**
     * @Author: cshnefu
     * @Description: 根据订单id评价
     * @Date: 23:56 2021/4/18
     * @Param: [judgeGrade, judgeText, judgeTime, order_id]
     * @return: int
     **/
    int updateByOrderId(Integer judgeGrade,String judgeText,String judgeTime,Integer order_id);
	
}
