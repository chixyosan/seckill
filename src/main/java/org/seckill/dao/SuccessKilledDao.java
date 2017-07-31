package org.seckill.dao;

import org.seckill.entity.SuccessKilled;

/**
 * 
 * @ClassName: SuccessKilledDao 
 * @author: zhangze
 * @date: 2017/07/31 15:33:49
 */
public class SuccessKilledDao {
    
    /**
     * @date 2017/07/31 15:34:33
     * @author zhangze
     * @Description: 插入购买明细
     * @param seckillId
     * @param userPhone
     * @return
     */
    int insertSuccessKilled(long seckillId,long userPhone);
    
    /**
     * @date 2017/07/31 15:36:36
     * @author zhangze
     * @Description: TODO
     * @param seckillId
     * @return
     */
    SuccessKilled queryByIdWithSeckill(long seckillId);
}
