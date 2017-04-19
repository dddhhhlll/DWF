package com.drink7up.dwf.service.synchronize;

/**
 * Created com.drink7up.dwf.service.synchronize by hlding on 2017/4/19.
 */
public class redisService implements synchronizeBaseService {
    /**
     * 根据id产生一个同步锁
     *
     * @param lockId 锁id
     * @return 是否获取同步锁
     */
    @Override
    public Boolean GetLock(String lockId) {
        return null;
    }

    /**
     * 根据id释放一个同步锁
     *
     * @param lockId 锁id
     * @return 是否释放成功
     */
    @Override
    public Boolean ReleaseLock(String lockId) {
        return null;
    }

    /**
     * 锁住一个路径
     *
     * @param Path 需要锁住的路径
     * @return 是否获得改路径的锁
     */
    @Override
    public Boolean LockPath(String Path) {
        return null;
    }

    /**
     * 释放一个路径上的锁
     *
     * @param Path 需要释放的锁的路径
     * @return 是否释放成功
     */
    @Override
    public Boolean ReleasePath(String Path) {
        return null;
    }

    /**
     * 设置路径值
     *
     * @param value 设置的值
     * @return 是否成功
     */
    @Override
    public Boolean SetPathValue(Object value) {
        return null;
    }

    /**
     * 获取
     *
     * @return
     */
    @Override
    public Object GetPathValue() {
        return null;
    }

    @Override
    public Boolean updatePath() {
        return null;
    }

    /**
     * 测试用方法
     *
     * @return 测试结果
     */
    @Override
    public String Test() {
        return "Redis.";
    }
}
