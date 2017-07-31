package org.seckill.dao;

import java.util.Date;
import java.util.List;

import org.seckill.entity.Seckill;

/**
 * 
 * @ClassName: SeckillDao 
 * @author: zhangze
 * @date: 2017/07/31 15:25:02
 */

public interface SeckillDao {
   /**
    * @date 2017/07/31 15:23:57
    * @author zhangze
    * @Description: 减库存
    * @param seckillId
    * @param killTime
    * @return
    */
    int reduceNumber(long seckillId,Date killTime);
    
   /**
    * @date 2017/07/31 15:23:42
    * @author zhangze
    * @Description: 根据ID查询商品
    * @param seckillId
    * @return
    */
    Seckill queryById(long seckillId);
   
    /**
     * @date 2017/07/31 15:31:59
     * @author zhangze
     * @Description: 根据偏移量出查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet,int limit);
}
