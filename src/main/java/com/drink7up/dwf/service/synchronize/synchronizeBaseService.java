package com.drink7up.dwf.service.synchronize;

/**
 * Created com.drink7up.dwf.synchronize by hlding on 2017/4/19.
 */

public interface synchronizeBaseService {

    /**
     * 根据id产生一个同步锁
     * @param lockId 锁id
     * @return 是否获取同步锁
     */
    Boolean GetLock(String lockId);

    /**
     * 根据id释放一个同步锁
     * @param lockId 锁id
     * @return 是否释放成功
     */
    Boolean ReleaseLock(String lockId);

    /**
     * 锁住一个路径
     * @param Path 需要锁住的路径
     * @return 是否获得改路径的锁
     */
    Boolean LockPath(String Path);

    /**
     * 释放一个路径上的锁
     * @param Path 需要释放的锁的路径
     * @return  是否释放成功
     */
    Boolean ReleasePath(String Path);

    /**
     * 设置路径值
     * @param value 设置的值
     * @return 是否成功
     */
    Boolean SetPathValue(Object value);

    /**
     * 获取
     * @return
     */
    Object GetPathValue();

    Boolean updatePath();

    /**
     * 测试用方法
     * @return 测试结果
     */
    String Test();
}
